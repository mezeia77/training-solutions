package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HtmlReader {
    public static void main(String[] args) {
        Path path = Path.of("src/main/resources/week12d05/index.html");
        int counter=0;
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)){
            String line;
            while ((line=bufferedReader.readLine())!=null){
                if(line.toLowerCase().contains("koronavírus")){
                    counter++;
                }
            }
            System.out.println(counter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
