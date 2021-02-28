package jdbc.simpleupdate;

import org.flywaydb.core.api.callback.Statement;
import org.flywaydb.core.internal.database.base.Connection;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeesDao {

    private DataSource dataSource;

    public EmployeesDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void createEmployee(String name){
        try {
            Connection conn = (Connection) dataSource.getConnection();
            PreparedStatement stmt = conn.getJdbcConnection().prepareStatement("insert into employees(emp_name) values (?)");
            stmt.setString(1, name);
            stmt.executeUpdate();
        }
        catch (SQLException se){
            throw new IllegalStateException("Can't insert, se");
        }
    }

//    public List<String> listEmployeeNames() throws SQLException {
//        Connection conn = (Connection) dataSource.getConnection();
//        Statement stmt = (Statement) conn.getJdbcConnection().createStatement();
//        ResultSet rs = stmt.
//    }
}
