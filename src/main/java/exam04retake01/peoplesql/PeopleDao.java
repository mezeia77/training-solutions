package exam04retake01.peoplesql;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PeopleDao {
    DataSource dataSource;

    public PeopleDao(DataSource dataSource) {
        this.dataSource=dataSource;
    }

    public String findIpByName(String firstName, String lastName) {
        String result = "";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt =
                     conn.prepareStatement("select ip_address from people where (first_name, last_name) = (?,?) "))
        {
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    result = rs.getString("ip_address");
                }
            } catch (SQLException sqlException) {
                throw new IllegalStateException("Cannot execute", sqlException);
            }

        } catch (SQLException sqlException) {
            throw new IllegalStateException("No data found", sqlException);
        }
        return result;
    }
}
