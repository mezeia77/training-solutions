package vaccination;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VaccinationDAO {

    private MariaDbDataSource dataSource;

    public VaccinationDAO(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void createVaccination(Vaccine vaccine){
        try (Connection conn =  dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into vaccinations" +
                     "(citizen_id, vaccination_date, STATUS, note, vaccination_type) values (?, ?, ?, ?, ?)")){
            stmt.setInt(1, vaccine.getCitizen_id());
            stmt.setDate(2, Date.valueOf(vaccine.getVaccination_date()));
            stmt.setString(3, vaccine.getStatus().toString());
            stmt.setString(4, vaccine.getNote());
            stmt.setString(5, vaccine.getVaccination_type());
            stmt.executeUpdate();
        }
        catch (SQLException se){
            throw new IllegalStateException("Can't insert", se);
        }
    }

    public List<Vaccine> listAllVaccinations(){
        List<Vaccine> result = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("select * from vaccinations"))
        {
            return getVaccinations(result, statement);
        } catch (SQLException sqlException){
            throw new IllegalStateException("Connection failed", sqlException);
        }
    }

    private List<Vaccine> getVaccinations(List<Vaccine> result, PreparedStatement statement) {
        try (ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                Vaccine vaccine = new Vaccine(
                        rs.getInt("vaccination_id"),
                        rs.getInt("citizen_id"),
                        rs.getDate("vaccination_date").toLocalDate(),
                        rs.getString("STATUS"),
                        rs.getString("note"),
                        rs.getString("vaccination_type"));
                result.add(vaccine);
            }
            return result;
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot execute", sqlException);
        }
    }

}
