package exam04retake01.peoplesql;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeopleDaoTest {
    private PeopleDao peopleDao;

    @BeforeEach
    void init() throws SQLException {
        MariaDbDataSource dataSource;
        dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3307/employees?useUnicode=true");
        dataSource.setUser("root");
        dataSource.setPassword("12345");

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

        flyway.clean();
        flyway.migrate();

        peopleDao = new PeopleDao(dataSource);
    }


    @Test
    void findIpByName() {
        assertEquals("134.135.61.66", peopleDao.findIpByName("Brina", "Snibson"));
        assertEquals("97.203.249.128", peopleDao.findIpByName("Torrence", "Porteous"));
    }
}
