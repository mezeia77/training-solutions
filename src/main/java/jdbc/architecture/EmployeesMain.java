package jdbc.architecture;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.List;

public class EmployeesMain {

    public static void main(String[] args) throws SQLException {
        MariaDbDataSource dataSource = new MariaDbDataSource();
//        dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true"); //kisgép
        dataSource.setUrl("jdbc:mariadb://localhost:3307/employees?useUnicode=true"); //nagygép
        dataSource.setUser("employees");
        dataSource.setPassword("employees");

        EmployeesDao dao = new EmployeesDao(dataSource);
        dao.createEmployee("John Doe");

        List<String> names = dao.listEmployeeNames();
        System.out.println(names);


        String name = dao.findEmployeeNameById(4L);
        System.out.println(name);
    }


}
