package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Cities {

    public String longestName(String filename){
        String result = "";
        Path path = Path.of("src/main/resources/week13d01/"+filename);
        try (BufferedReader br = Files.newBufferedReader(path)){
            br.readLine();
            String line;
            while ((line=br.readLine())!=null){
                String[] linePart = line.split(";");
                if(linePart[1].trim().length()>result.length()) {
                    result = linePart[1].trim();
                }
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("No such file found ", e);
        }
        return result;
    }

    public static void main(String[] args) {
        Cities cities = new Cities();
        System.out.println(cities.longestName("iranyitoszamok-varosok-2021.csv"));
    }
}
