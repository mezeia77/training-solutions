package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CoronaCounter {

    private List<CoronaData> data = new ArrayList<>();

    public List<String> counterWithLoop (String filename){
        readFile(filename);
        List<String> result = new ArrayList<>();
        int max = 0;
        String week = "";
        int listCounter = 0;
        for(int i = 1; i<=3; i++) {
            for (int j = 0; j<= data.size()-1; j++) {
                if (data.get(j).getCasesWeekly() > max) {
                    max = data.get(j).getCasesWeekly();
                    week = data.get(j).getYearWeek();
                    listCounter=j;
                }
            }
            result.add(week);
            data.remove(listCounter);
            max=0;
        }
        System.out.println(result);
        return result;
    }

    public List<String> counterWithSort (String filename){
        readFile(filename);
        List<CoronaData> sorted = new ArrayList<>(data);
        Collections.sort(sorted);
        List<String> result = new ArrayList<>();
        for (int i = 0; i< 3; i++){
            result.add(sorted.get(i).getYearWeek());
        }
        System.out.println(result);
        return result;
    }

    private void readFile(String filename){
        Path file = Path.of("src\\main\\resources\\week15d04"+ "\\" + filename);
        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line = "";
            while ((line= br.readLine())!=null){
                String[] temp = line.split(",");
                if(temp[4].equals("Hungary")) {
                    data.add(new CoronaData(temp[1], Integer.parseInt(temp[2])));
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't find file");
        }
    }

    public static void main(String[] args) {
        new CoronaCounter().counterWithLoop("data.csv");
        new CoronaCounter().counterWithSort("data.csv");
    }
}

//    Letölthetőek a koronavírus adatok innen: https://opendata.ecdc.europa.eu/covid19/casedistribution/csv/data.csv
//    Melyik három héten volt Magyarországon a legtöbb esetszám?
