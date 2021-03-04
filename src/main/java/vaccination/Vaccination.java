package vaccination;

import org.mariadb.jdbc.MariaDbDataSource;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Vaccination {

    Scanner scanner = new Scanner(System.in);
    private Citizen citizenVaccination;
    private Citizen citizen;

    public void addVaccination(MariaDbDataSource dataSource){
        System.out.println("Kérem a TAJ számot");
        String TAJ = scanner.nextLine();
        citizenVaccination = new Citizen(TAJ);

        getCitizenByTaj(dataSource, TAJ, citizenVaccination);
        System.out.println(citizen);

        if(citizen.getNumberOfVaccination()==2) {
            throw new IllegalStateException("2 oltás beadva, újabb nem lehetséges");
        } else {
            requestVaccionationDetails(dataSource);
        }
    }

    private void requestVaccionationDetails(MariaDbDataSource dataSource) {
        System.out.println("Kérem a státuszt (0 - sikertelen / 1 - sikeres)");
        int status_num = scanner.nextInt();
        scanner.nextLine();
        if(status_num!=0 && status_num!= 1){
            throw new IllegalArgumentException("Only 1-2 accepted as status");
        }
        String status = "";
        if(status_num == 1){
            status = "SUCCES";
        } else {
            status = "FAILED";
        }
        LocalDate date = getDate();
        System.out.println("Kérem a megjegyzést (sikertelen esetén kötelező)");
        String note = scanner.nextLine();
        if(note.isEmpty() && status_num == 0){
            throw new IllegalStateException("Note field mandatory when failed");
        }

        String vaccination_type = "";
        vaccination_type = getVaccine(dataSource, status_num, date, vaccination_type);

        Vaccine vaccine = new Vaccine(0, citizen.getId(), date, status, note, vaccination_type);
        System.out.println(vaccine);
        new VaccinationDAO(dataSource).createVaccination(vaccine);
        System.out.println("Sikeres adatbevitel!");
    }

    private String getVaccine(MariaDbDataSource dataSource, int status_num, LocalDate date, String vaccination_type) {
        if(status_num == 1) {
            System.out.println("Kérem a vakcinát");
            vaccination_type = scanner.nextLine();
            if (vaccination_type.isEmpty()) {
                throw new IllegalArgumentException("Vaccine type must be added");
            }
            if(citizen.getNumberOfVaccination()==1) {
                checkVaccinesAreEquals(dataSource, vaccination_type);
            }
            new CitizensDAO(dataSource).updateCitizenByVaccination(citizen.getId(), date, citizen.getNumberOfVaccination()+1);
        }
        return vaccination_type;
    }

    private void checkVaccinesAreEquals(MariaDbDataSource dataSource, String vaccination_type) {
        List<Vaccine> vaccinations = new VaccinationDAO(dataSource).listAllVaccinations();
        String first_vaccination_type = "";
        for (Vaccine vaccine:vaccinations){
            if(vaccine.getCitizen_id()== citizen.getId()){
                first_vaccination_type=(vaccine.getVaccination_type());
            }
        }
        if(!first_vaccination_type.equals(vaccination_type)){
            throw new IllegalStateException("Vaccines are different!");
        }
    }

    private LocalDate getDate() {
        System.out.println("Kérem az évet");
        String year = scanner.nextLine();
        System.out.println("Kérem a hónapot");
        String month = scanner.nextLine();
        System.out.println("Kérem a napot");
        String day = scanner.nextLine();
        if (year.isEmpty() || month.isEmpty() || day.isEmpty()) {
            throw new IllegalArgumentException("Year, month, day must be filled");
        }
        LocalDate date = LocalDate.parse(year + "-" + month + "-" + day);

        if(!citizen.getLastVaccination().plusDays(15).isBefore(date)){
            throw new IllegalArgumentException("wait until 15 days passed");
        }
        return date;
    }

    private Citizen getCitizenByTaj(MariaDbDataSource dataSource, String TAJ, Citizen citizenVaccination) {
        List <Citizen> citizens = new CitizensDAO(dataSource).listAllCitizens();
        for (Citizen c: citizens){
            if(c.getTAJ().equals(TAJ)){
                citizen = c;
                return citizen;
            }
        }
        throw new IllegalArgumentException("TAJ not registered, please register: " + TAJ);
    }

    private boolean isEmpty(String s) {
        return (s == null || "".equals(s.trim()));
    }
}
