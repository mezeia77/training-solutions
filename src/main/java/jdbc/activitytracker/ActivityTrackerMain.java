package jdbc.activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;

public class ActivityTrackerMain {


    public static void main(String[] args) {
        MariaDbDataSource dataSource;

        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
            Flyway flyway = Flyway.configure().dataSource(dataSource).load();
            flyway.clean();
            flyway.migrate();
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed", sqlException);
        }
//        Activity activity = new Activity(LocalDateTime.of(2021, 01, 01, 12, 20), "Biking in Bakony", ActivityType.BIKING);
//        Activity activity2 = new Activity(LocalDateTime.of(2021, 01, 01, 12, 20), "Hiking in Bakony", ActivityType.HIKING);
//        Activity activity3 = new Activity(LocalDateTime.of(2021, 01, 01, 12, 20), "Running in Bakony", ActivityType.RUNNING);

        ActivityDao dao = new ActivityDao(dataSource);
//        dao.insertActivity(activity);
//        dao.insertActivity(activity2);
//        dao.insertActivity(activity3);
        System.out.println(dao.selectActivityById(8));
        System.out.println(dao.selectAllActivities());
        System.out.println(dao.selectActivityByType(ActivityType.RUNNING));
    }
}
