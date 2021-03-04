package vaccination;

import org.mariadb.jdbc.MariaDbDataSource;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Generate {

    private List<Citizen> citizens;
    private List<Citizen> citizensToVaccine = new ArrayList<>();
    private List<File> files= new ArrayList<>();

    Scanner scanner=new Scanner(System.in);

    public void generateListForVaccination(MariaDbDataSource dataSource){
    citizens = new ArrayList<>(new CitizensDAO(dataSource).listAllCitizens());
            for(Citizen citizen:citizens){
            if(citizen.getNumberOfVaccination()<2 && citizen.getLastVaccination().plusDays(15).isBefore(LocalDate.now())){
                citizensToVaccine.add(citizen);
            }
        }
        checkZIP();
        Collections.sort(citizens, new Comparator<Citizen>() {
            @Override
            public int compare(Citizen o1, Citizen o2) {
                return o1.getYear_of_birth()-o2.getYear_of_birth();
            }
        });
            int max= 16;
            if (citizens.size()<16){
                max = citizens.size();
            }

            for (int i = 0; i<max; i++){
                LocalTime time = LocalTime.of(8,00);
                time = time.plusMinutes(30*i);
                files.add(new File(time, citizens.get(i).getFullName(), citizens.get(i).getZIP(),
                        citizens.get(i).getYear_of_birth(), citizens.get(i).getEmail(), citizens.get(i).getTAJ()));
            }
        writeToFile();
    }

    private void checkZIP() {
        System.out.println("Kérem az irányítószámot");
        String ZIP = scanner.nextLine();
        citizens = new ArrayList<>();
        for (Citizen citizen:citizensToVaccine){
            if(citizen.getZIP().equals(ZIP)){
                citizens.add(citizen);
            }
        }
        if(citizens.size()==0){
            throw new IllegalArgumentException("ZIP not in the list");
        }
    }

    private void writeToFile() {
        System.out.println("Kérem a fájl nevét");
        String filename = scanner.nextLine();
        String header = "Időpont;Név;Irányítószám;Születési év;E-mail cím;TAJ szám \n";

        Path path = Path.of("src\\main\\resources\\vaccination" + "\\" + filename);
        try (BufferedWriter writer = Files.newBufferedWriter(path)){
            writer.write(header);
            for (int i = 0; i< files.size(); i++){
                writer.write(files.get(i).toString());
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't write file", e);
        }
    }

}
