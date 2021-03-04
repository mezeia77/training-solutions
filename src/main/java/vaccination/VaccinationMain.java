package vaccination;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.Scanner;

public class VaccinationMain {

    public static void main(String[] args) {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/vaccination?useUnicode=true");
            dataSource.setUser("root");
            dataSource.setPassword("12345");
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed", sqlException);
        }

        System.out.println(
                "1 - Regisztráció" + "\n"+
                        "2 - Tömeges regisztráció" + "\n"+
                        "3 - Generálás" + "\n"+
                        "4 - Oltás / oltás meghiúsulás" + "\n"+
                        "5 - Riport" + "\n"+
                "Kérem válasszon" + "\n");
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        scanner.nextLine();

        switch (select){
            case 1:new Registration().requestDataFromUser(dataSource); return;
            case 2:new Registration().massRegistration(dataSource); return;
            case 3:new Generate().generateListForVaccination(dataSource); return;
            case 4:new Vaccination().addVaccination(dataSource); return;
            case 5:new RiportByZip().riportByZip(dataSource); return;
        }

        System.out.println(new CitizensDAO(dataSource).listAllCitizens());
    }
}
