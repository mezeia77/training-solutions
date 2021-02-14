package week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Battles {

    private static List<String> houses = new ArrayList<>();

    private void readFile(String filename){
        Path file = Path.of("src\\main\\resources\\week15d05"+ "\\" + filename);
        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line = "";
            br.readLine();
            while ((line= br.readLine())!=null){
                fillData(line);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't find file");
        }
    }

    private void fillData(String line) {
        String[] temp = line.split(",");
        for(int i = 5; i<=12; i++) {
            if(!temp[i].isEmpty()) {
                houses.add(temp[i]);
            }
        }
    }

    public void countHouses(){
        Map<String, Integer> countOfHouses = new HashMap<>();
        for (String house: houses) {
            if (countOfHouses.containsKey(house)) {
                countOfHouses.put(house, countOfHouses.get(house) + 1);
            }
            else {
                countOfHouses.put(house, 1);
            }
        }
        System.out.println(countOfHouses);
        getMax(countOfHouses);
    }

    private void getMax(Map<String, Integer> countOfHouses) {
        int max = 0;
        String house=null;
        for(Map.Entry<String, Integer> entry: countOfHouses.entrySet()){
            if(entry.getValue()>max){
                max= entry.getValue();
                house= entry.getKey();
            }
        }
        System.out.println(house);
    }

    public static void main(String[] args) {
        new Battles().readFile("battles.dat");
        new Battles().countHouses();
    }



}
//Meg kell keresni azt a házat, ami a legtöbb csatában szerepel.
