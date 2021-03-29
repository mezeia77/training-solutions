package exam04retake02.housecup;

import javax.sql.DataSource;
import java.sql.*;

public class HouseCup {

DataSource dataSource;

    public HouseCup(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public int getPointsOfHouse(String house) {
        int result = 0;
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM house_points WHERE house_name = ?");
        ){
            stmt.setString(1, house);
            try (ResultSet rs = stmt.executeQuery()){
                while (rs.next()){
                    result+= rs.getInt("points_earned");
                }
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("No data found");
        }
        return result;
    }
}
