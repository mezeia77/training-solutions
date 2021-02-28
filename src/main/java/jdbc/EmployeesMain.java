package jdbc;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeesMain {

    MariaDbDataSource dataSource = new MariaDbDataSource();

    private void prepare() throws SQLException {
        dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
        dataSource.setUser("employees");
        dataSource.setPassword("employees");
    }

    public void insert(){
        try {
            prepare();
            Connection conn = dataSource.getConnection();
//            Statement stmt = conn.createStatement();
//            stmt.executeUpdate("insert into employees(emp_name) values ('John Doe')");
            PreparedStatement stmt = conn.prepareStatement("insert into employees(emp_name) values (?)");
            stmt.setString(1, "Jack Doe");
            stmt.executeUpdate();
        }
        catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }
    }

    public void select() throws SQLException {
        prepare();
        try (
            Connection conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select emp_name from employees");
        ){
            List<String> names = new ArrayList<>();
            while ((rs.next())){
             String name = rs.getString("emp_name");
             names.add(name);
            }
            System.out.println(names);
        } catch (SQLException se) {
            throw new IllegalStateException("Can't select employees", se);
        }
    }

    public void findById() throws SQLException {
        prepare();
        try (
            Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement("select emp_name from employees where id = ?");
        ){
            ps.setLong(1, 1L);
            selectNameByPreparedStatement(ps);

        } catch (SQLException se) {
            throw new IllegalStateException("Can't query", se);
        }

    }

    private void selectNameByPreparedStatement(PreparedStatement ps) throws SQLException {
        try (ResultSet rs = ps.executeQuery()){
            if(rs.next()){
                String name = rs.getString("emp_name");
                System.out.println(name);
            }
            throw new IllegalArgumentException("Not found");
        }
    }


    public static void main(String[] args) throws SQLException {
//        new EmployeesMain().insert();
//        new EmployeesMain().select();
        new EmployeesMain().findById();
    }
}
