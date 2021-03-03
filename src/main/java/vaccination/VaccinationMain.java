package vaccination;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sound.midi.Soundbank;
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
//            Flyway flyway = Flyway.configure().dataSource(dataSource).load();
//            flyway.clean();
//            flyway.migrate();
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed", sqlException);
        }

        System.out.println(
                "1 - Regisztráció" + "\n"+
                        "2 - Tömeges regisztráció" + "\n"+
                        "3 - Generálás" + "\n"+
                        "4 - Oltás" + "\n"+
                        "5 - Riport" + "\n"+
                        "0 - Kilépés" + "\n"+
                "Kérem válasszon" + "\n");
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        scanner.nextLine();

        switch (select){
            case 1:new Registration().requestDataFromUser(dataSource); return;
            case 2:new Registration().massRegistration(dataSource); return;
            case 0: break;
        }

        System.out.println(new CitizensDAO(dataSource).listAllCitizens());
    }
}
