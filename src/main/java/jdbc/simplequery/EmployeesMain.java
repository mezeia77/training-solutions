package jdbc.simplequery;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeesMain {

    public static void main(String[] args) throws SQLException {
        MariaDbDataSource dataSource = new MariaDbDataSource();
//        dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true"); //kisgép
        dataSource.setUrl("jdbc:mariadb://localhost:3307/employees?useUnicode=true"); //nagygép
        dataSource.setUser("employees");
        dataSource.setPassword("employees");

        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select emp_name from employees")
        ){
            List<String> names = new ArrayList<>();
            while (rs.next()){
                names.add(rs.getString("emp_name"));
            }
            System.out.println(names);

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot select employees", sqlException);
        }
    }

}
