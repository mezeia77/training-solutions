package vaccination;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CitizensDAO {

    private DataSource dataSource;

    public CitizensDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void createCitizen(Citizen citizen){
        try (Connection conn =  dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into citizens(citizen_name, ZIP, year_of_birth, TAJ, email) values (?, ?, ?, ?, ?)")){
            stmt.setString(1, citizen.getFullName());
            stmt.setString(2, citizen.getZIP());
            stmt.setInt(3, citizen.getYear_of_birth());
            stmt.setString(4, citizen.getTAJ());
            stmt.setString(5, citizen.getEmail());
            stmt.executeUpdate();
        }
        catch (SQLException se){
            throw new IllegalStateException("Can't insert", se);
        }
    }

    public List<Citizen> listAllCitizens(){
        List<Citizen> result = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("select * from citizens"))
        {
            return getCitizens(result, statement);
        } catch (SQLException sqlException){
            throw new IllegalStateException("Connection failed", sqlException);
        }
    }

    private List<Citizen> getCitizens(List<Citizen> result, PreparedStatement statement) {
        try (ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                Citizen citizen = new Citizen(
                        rs.getString("citizen_name"),
                        rs.getString("ZIP"),
                        rs.getInt("year_of_birth"),
                        rs.getString("TAJ"),
                        rs.getString("email"),
                        rs.getInt("number_of_vaccination"),
                        rs.getDate("last_vaccination").toLocalDate());
                result.add(citizen);
            }
            return result;
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot execute", sqlException);
        }
    }

    public List<City> listAllCities(){
        List<City> result = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("select * from cities"))
        {
            return getCities(result, statement);
        } catch (SQLException sqlException){
            throw new IllegalStateException("Connection failed", sqlException);
        }
    }

    private List<City> getCities(List<City> result, PreparedStatement statement) {
        try (ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                City city = new City(
                        rs.getString("ZIP"),
                        rs.getString("city"),
                        rs.getString("city_part"));
                result.add(city);
            }
            return result;
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot execute", sqlException);
        }
    }

}
