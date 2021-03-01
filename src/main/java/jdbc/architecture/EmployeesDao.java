package jdbc.architecture;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDao {

    private DataSource dataSource;

    public EmployeesDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void createEmployee(String name) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("insert into employees (emp_name) values (?)")
        ){
            ps.setString(1, name);
            ps.executeUpdate();

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot insert", sqlException);
        }
    }

    public List<String> listEmployeeNames(){
        List<String> names = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select emp_name from employees")
        ){
            while (rs.next()){
                names.add(rs.getString("emp_name"));
            }
            System.out.println(names);

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot select employees", sqlException);
        }
        return names;
    }

    public String findEmployeeNameById(long id){
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("select emp_name from employees where id = ?")
        ){
            ps.setLong(1, id);
            return selectNameByPreparedStatement(ps);

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot query", sqlException);
        }
    }

    private String  selectNameByPreparedStatement(PreparedStatement ps) {
        try (ResultSet rs = ps.executeQuery()){
            if(rs.next()){
                return rs.getString("emp_name");
            } else throw new IllegalArgumentException("Not found");
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot query", sqlException);
        }
    }
}
