package vaccination;

import org.mariadb.jdbc.MariaDbDataSource;

import java.util.*;

public class RiportByZip {

    private List<Citizen> citizens;
    private List<Riport> riports = new ArrayList<>();

    public void riportByZip(MariaDbDataSource dataSource){
        citizens = new ArrayList<>(new CitizensDAO(dataSource).listAllCitizens());
        List<String> ZIPsAdded = new ArrayList<>();
        String ZIP;
        for (int i = 0; i<citizens.size(); i++){
            countVaccinations(ZIPsAdded, i);
        }
        for (Riport riport:riports){
            System.out.println(riport);
        }
    }

    private void countVaccinations(List<String> ZIPsAdded, int i) {
        String ZIP;
        ZIP = citizens.get(i).getZIP();
        int[] quantity = new int[3];
        for (Citizen citizen:citizens){
            if(citizen.getZIP().equals(ZIP)){
                quantity[citizen.getNumberOfVaccination()]++;
            }
        }
        if(!ZIPsAdded.contains(ZIP)){
            riports.add(new Riport(ZIP, quantity[0], quantity[1], quantity[2]));
        }
        ZIPsAdded.add(ZIP);
    }

}
