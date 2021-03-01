package jdbc.architecture;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesDaoTest {

    EmployeesDao dao;

    @BeforeEach
    void init(){
        MariaDbDataSource dataSource = new MariaDbDataSource();
//        dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true"); //kisgép
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3307/employees?useUnicode=true"); //nagygép
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection Failed", sqlException);
        }
        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        dao = new EmployeesDao(dataSource);
    }

    @Test
    void testInsert(){
        dao.createEmployee("John Doe");
        assertEquals(1, dao.listEmployeeNames().size());
        assertEquals(List.of("John Doe"), dao.listEmployeeNames());
    }

}