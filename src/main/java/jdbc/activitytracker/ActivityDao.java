package jdbc.activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {
    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Activity insertActivity(Activity activity){
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values (?, ?, ?)",
                     Statement.RETURN_GENERATED_KEYS)){
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getActivityType().toString());
            stmt.executeUpdate();

            Activity result = getIdAfterExecuted(activity, stmt);
            insertActivityTrackPoints(activity.getTrackPoints(), result.getId());
            return result;

//            return getIdAfterExecuted(activity, stmt);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed", sqlException);
        }
    }

    private void insertActivityTrackPoints(List<TrackPoint> trackPoints, long activityId){
        try (Connection conn = dataSource.getConnection()){
            conn.setAutoCommit(false);
            try (PreparedStatement stmt = conn.prepareStatement("insert into track_points(act_time, lat, lon, activityId) values (?, ?, ?, ?)")){
                for (TrackPoint trackPoint: trackPoints){
                    if(!isValidCoordinate(trackPoint.getLat(), trackPoint.getLon())){
                        throw new IllegalArgumentException("Invalid coordinate");
                    }
                    stmt.setDate(1, Date.valueOf(trackPoint.getTime()));
                    stmt.setDouble(2, trackPoint.getLat());
                    stmt.setDouble(3, trackPoint.getLon());
                    stmt.setLong(4, activityId);
                    stmt.executeUpdate();
                }
                conn.commit();
            } catch (IllegalArgumentException illegalArgumentException){
                conn.rollback();
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Can't connect", sqlException);
        }
    }

    private boolean isValidCoordinate(double lat, double lon){
        if(lat>90 || lat <-90){
            return false;
        }
        if(lon>180 || lon <-180){
            return false;
        }
        return true;
    }

    private Activity getIdAfterExecuted(Activity activity, PreparedStatement stmt) throws SQLException {
        try (ResultSet rs = stmt.getGeneratedKeys()){
            if(rs.next()){
                long id = rs.getLong(1);
                return new Activity(id, activity.getStartTime(), activity.getDesc(), activity.getActivityType());
            }
        }
        throw new IllegalStateException("Can't get keys");
    }

    public List<Activity> selectActivitiesBeforeDate(LocalDate date){
        List<Activity> result = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             PreparedStatement statement = conn.prepareStatement("select * from activities where start_time < ?")){
            LocalDateTime actual = date.atTime(0,0);
            statement.setTimestamp(1, Timestamp.valueOf(actual));
            return selectActivityByPreparedStatement(statement);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot connect", sqlException);
        }
    }

    private List<Activity> selectActivityByPreparedStatement(PreparedStatement statement) {
        List<Activity> result = new ArrayList<>();
        try (ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                Activity activity = new Activity(
                        rs.getLong("id"),
                        rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("activity_desc"),
                        ActivityType.valueOf(rs.getString("activity_type")));
                result.add(activity);
            }
            return result;
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot execute", sqlException);
        }
    }

    private List<TrackPoint> selectTrackPointsByPreparedStatement(PreparedStatement statement) {
        List<TrackPoint> result = new ArrayList<>();
        try (ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                TrackPoint activity = new TrackPoint(
                        rs.getLong("id"),
                        rs.getDate("act_time").toLocalDate(),
                        rs.getDouble("lat"),
                        rs.getDouble("lon"));
                result.add(activity);
            }
            return result;
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot execute", sqlException);
        }
    }

    public Activity selectActivityById(long id){
        try (Connection conn = dataSource.getConnection();
             PreparedStatement statement = conn.prepareStatement("select * from activities where id = ?");
             PreparedStatement statement2 = conn.prepareStatement("select * from track_points where activityId = ?")){

            statement.setLong(1, id);
            List<Activity> result = selectActivityByPreparedStatement(statement);
            if(result.size()==1){
                statement2.setLong(1, id);
                List<TrackPoint> resultPoints = selectTrackPointsByPreparedStatement(statement2);
                result.get(0).addTrackPoints(resultPoints);
                return result.get(0);
            } throw new IllegalArgumentException("Wrong id");
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed", sqlException);
        }
    }

    public List<Activity> selectAllActivities(){
        List<Activity> result = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("select * from activities"))
        {
            return selectActivityByPreparedStatement(statement);
        } catch (SQLException sqlException){
            throw new IllegalStateException("Connection failed", sqlException);
        }
    }

    public List<Activity> selectActivityByType(ActivityType type){
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("select * from activities where activity_type=?")) {
            statement.setString(1, type.toString());
            return selectActivityByPreparedStatement(statement);
        } catch (SQLException sqlException){
            throw new IllegalStateException("Connection failed", sqlException);
        }
    }
}
