package vaccination;

import org.mariadb.jdbc.MariaDbDataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {

    List<Citizen> citizens;
    List<City> cities;

    Scanner scanner = new Scanner(System.in);

    public void requestDataFromUser(MariaDbDataSource dataSource){
        System.out.println("Kérem a nevet: ");
        String name = scanner.nextLine();

        System.out.println("Kérem az irányítószámot: ");
        String ZIP = scanner.nextLine();

        System.out.println("Kérem a születési évet: ");
        int year_of_birth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem a TAJ számot: ");
        String TAJ = scanner.nextLine();

        System.out.println("Kérem az emailt (nem kötelező): ");
        String email = scanner.nextLine();

        System.out.println("Kérem az emailt újra: ");
        String secondEmail = scanner.nextLine();

        Citizen citizen = new Citizen(name, ZIP, year_of_birth, TAJ, email);
        registration(citizen, secondEmail, dataSource);
    }

    public void registration(Citizen citizen, String secondEmail, MariaDbDataSource dataSource){
        checkRegistrationData(citizen, secondEmail, dataSource);
        findCityByZIP(citizen, dataSource);
        new CitizensDAO(dataSource).createCitizen(citizen);
        System.out.println("Sikeres regisztráció!");
    }

    public void massRegistration(MariaDbDataSource dataSource){
        List<Citizen> citizens = new ArrayList<>();
        System.out.println("Kérem a fájl nevét");
        String filename = scanner.nextLine();

        Path path = Path.of("src\\main\\resources\\vaccination" + "\\" + filename);
        try {
            BufferedReader reader = Files.newBufferedReader(path);
            String line;
            reader.readLine();
            while ((line = reader.readLine())!=null){
                String temp[] = line.split(";");
                citizens.add(new Citizen(temp[0], temp[1], Integer.parseInt(temp[2]), temp[4], temp[3]));
            }
        } catch (IOException e) {
            throw new IllegalStateException("File not found: " + path, e);
        }
        for (Citizen citizen: citizens){
            checkRegistrationData(citizen,citizen.getEmail(),dataSource);
            new CitizensDAO(dataSource).createCitizen(citizen);
        }
        System.out.println("Sikeres regisztráció!");
    }

    private void checkRegistrationData(Citizen citizen, String secondEmail, MariaDbDataSource dataSource) {
        if(isEmpty(citizen.getFullName())){
            throw new IllegalArgumentException("Empty name");
        }
        if(isEmpty(citizen.getZIP())){
            throw new IllegalArgumentException("Empty name");
        }
        if(isEmpty(citizen.getTAJ())){
            throw new IllegalArgumentException("Empty TAJ");
        }

        isAgeValid(citizen);
        isTajValid(citizen);

        if(isTajExists(citizen, dataSource)){
            throw new IllegalArgumentException("TAJ already exists: " + citizen.getTAJ());
        }

        isEmailValid(citizen);

        if(!citizen.getEmail().equals(secondEmail)){
            throw new IllegalArgumentException("Emails are different");
        }
    }

    private void isEmailValid(Citizen citizen) {
        if(!isEmpty(citizen.getEmail())) {
            int at = citizen.getEmail().indexOf("@");
            int dot = citizen.getEmail().lastIndexOf(".");
            if(at <1 || dot<3 || dot<=at+1){
                throw new IllegalArgumentException("Invalid email: " + citizen.getEmail());
            }
        }
    }

    private void isAgeValid(Citizen citizen) {
        int age = LocalDate.now().getYear()- citizen.getYear_of_birth();
        if(age<10 || age>150){
            throw new IllegalArgumentException("Age must be between 10 & 150: " + citizen.getYear_of_birth());
        }
    }

    private void isTajValid(Citizen citizen) {
        if(citizen.getTAJ().length()!=9){
            throw new IllegalArgumentException("TAJ must be 9 numbers: " + citizen.getTAJ());
        }
        int number = 0;
        for (int i = 0; i<8; i++){
            if(i%2==0){
                number += 3 * Character.getNumericValue(citizen.getTAJ().charAt(i));
            }
            else {
                number += 7 * Character.getNumericValue(citizen.getTAJ().charAt(i));
            }
        }
        int CDV = number%10;
        int code = Character.getNumericValue(citizen.getTAJ().charAt(8));
        if (CDV != code){
            throw new IllegalArgumentException("Invalid TAJ: " + citizen.getTAJ());
        }
    }

    public boolean isTajExists(Citizen citizen, MariaDbDataSource dataSource) {
        citizens = new ArrayList<>(new CitizensDAO(dataSource).listAllCitizens());
        for (Citizen citizen1:citizens){
            if(citizen1.getTAJ().equals(citizen.getTAJ())){
                return true;
            }
        }
        return false;
    }

    private void findCityByZIP(Citizen citizen, MariaDbDataSource dataSource) {
        cities = new ArrayList<>(new CitizensDAO(dataSource).listAllCities());
        boolean found = false;
        for(City city:cities){
            if(citizen.getZIP().equals(city.getZIP())){
                System.out.println("Település: " + city.getCity() + " " + city.getCity_part());
                found = true;
            }
        }
        if(!found){
            throw new IllegalArgumentException("ZIP not exists: " + citizen.getZIP());
        }
    }

    private boolean isEmpty(String s){
        return (s==null || "".equals(s.trim()));
    }

}
