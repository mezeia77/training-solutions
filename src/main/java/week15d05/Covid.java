package week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Covid {

    private List<CovidData> data = new ArrayList<>();
    private Map<String, Double> dataSummarised = new TreeMap<>();

    private void readFile(String filename){
        Path file = Path.of("src\\main\\resources\\week15d05"+ "\\" + filename);
        try (BufferedReader br = Files.newBufferedReader(file)) {
            br.readLine();
            fillData(br);
        } catch (IOException e) {
            throw new IllegalStateException("Can't find file");
        }
    }

    private void fillData(BufferedReader br) throws IOException {
        String line;
        double casesPerPopulation;
        while ((line= br.readLine())!=null){
            String[] temp = line.split(",");
            casesPerPopulation = 1_000_000 * (double) Integer.parseInt(temp[2])/Integer.parseInt(temp[7]);
            data.add(new CovidData(temp[4], casesPerPopulation));
        }
    }

    private void setDataSummarised(){
        List<CovidData> copy = new ArrayList<>(data);
        for (CovidData country:copy){
            if(dataSummarised.containsKey(country.getCountry())){
                double sum = dataSummarised.get(country.getCountry()) + country.getCasesPerWeek();
                dataSummarised.put(country.getCountry(), sum);
            } else {
                dataSummarised.put(country.getCountry(), country.getCasesPerWeek());
            }
        }
    }

    public List<String> findMaxThree(){
        Map<String, Double> copy= new HashMap<>(dataSummarised);
        List<String> top3Countries = new ArrayList<>();
        for(int i = 0; i< 3; i++) {
            double max = 0;
            String country = "";
            country = foundMax(copy, max, country);
            top3Countries.add(country);
            copy.remove(country);
        }
        return top3Countries;
    }

    private String foundMax(Map<String, Double> copy, double max, String country) {
        for (Map.Entry entry : copy.entrySet()) {
            double d = (double) entry.getValue();
            if (d > max) {
                max = d;
                country = (String) entry.getKey();
            }
        }
        return country;
    }

    public static void main(String[] args) {
        new Covid().readFile("data.csv");
        new Covid().setDataSummarised();
        System.out.println(new Covid().findMaxThree());
    }
}

//    Letölthetőek a COVID adatok a
//        https://opendata.ecdc.europa.eu/covid19/casedistribution/csv/data.csv címről.
//        Összegezd országonként az esetszámokat, és add vissza azt a három
//        országot, ahol az összes esetszám populációra arányosítva a legnagyobb.
