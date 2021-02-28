package jdbc.activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {
    ActivityDao dao;

    @BeforeEach
    void init(){
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
        dao = new ActivityDao(dataSource);
    }

    @Test
    void selectAllTest(){
        assertEquals(3, dao.selectAllActivities().size());
    }

    @Test
    void insertActivityTest(){
        Activity activity3 = new Activity(LocalDateTime.of(2021, 01, 01, 12, 20), "Running in Bakony", ActivityType.RUNNING);
        dao.insertActivity(activity3);
        assertEquals(4, dao.selectAllActivities().size());
    }

    @Test
    void selectBeforeDateTest(){
        System.out.println(dao.selectActivitiesBeforeDate(LocalDate.of(2021, 02, 03)));
    }

    @Test
    void findByIdTest(){
        Activity activity3 = new Activity(LocalDateTime.of(2021, 01, 01, 12, 20), "Running in Bakony", ActivityType.RUNNING);
        Activity result = dao.insertActivity(activity3);
        assertEquals("Running in Bakony", dao.selectActivityById(result.getId()).getDesc());
    }

    @Test
    void insertActivityWithTrackPointTest(){
        Activity activity3 = new Activity(LocalDateTime.of(2021, 01, 01, 12, 20), "Running in Bakony", ActivityType.RUNNING);
        activity3.addTrackPoints(List.of(
                new TrackPoint(LocalDate.of(2021,01,01), 67, 23),
                new TrackPoint(LocalDate.of(2021,01,01), 67, 23),
                new TrackPoint(LocalDate.of(2021,01,01), 67, 23)));

        System.out.println(dao.selectActivityById(dao.insertActivity(activity3).getId()));
    }
}