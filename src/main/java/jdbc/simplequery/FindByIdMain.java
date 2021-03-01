package jdbc.simplequery;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FindByIdMain {

    public static void main(String[] args) throws SQLException {
        MariaDbDataSource dataSource = new MariaDbDataSource();
//        dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true"); //kisgép
        dataSource.setUrl("jdbc:mariadb://localhost:3307/employees?useUnicode=true"); //nagygép
        dataSource.setUser("employees");
        dataSource.setPassword("employees");

        selectNameById(dataSource, 2);
    }

    private static void selectNameById(MariaDbDataSource dataSource, long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("select emp_name from employees where id = ?");
        ){
            ps.setLong(1, id);
            selectNameByPreparedStatement(ps);

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot query", sqlException);
        }
    }

    private static void selectNameByPreparedStatement(PreparedStatement ps) {
        try (ResultSet rs = ps.executeQuery()){
            if(rs.next()){
                System.out.println(rs.getString("emp_name"));
            } else throw new IllegalArgumentException("Not found");
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot query", sqlException);
        }
    }
}
