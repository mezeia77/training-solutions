package week15d05;

import week15d04.CoronaData;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Covid {

    private static List<CovidData> data = new ArrayList<>();

    private void readFile(String filename){
        Path file = Path.of("src\\main\\resources\\week15d05"+ "\\" + filename);
        int casesPerWeek=0;
        int population=0;
        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line = "";
            br.readLine();
            while ((line= br.readLine())!=null){
                String[] temp = line.split(",");
                population = Integer.parseInt(temp[7]);
                casesPerWeek = Integer.parseInt(temp[2]);
                data.add(new CovidData(temp[4], (1_000_000*casesPerWeek/population)));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't find file");
        }
    }

    public static void main(String[] args) {
        new Covid().readFile("data.csv");
        System.out.println(data);
    }
}

//    Letölthetőek a COVID adatok a
//        https://opendata.ecdc.europa.eu/covid19/casedistribution/csv/data.csv címről.
//        Összegezd országonként az esetszámokat, és add vissza azt a három
//        országot, ahol az összes esetszám populációra arányosítva a legnagyobb.
