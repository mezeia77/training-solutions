package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer> quantity = new HashMap<>();
    public void readFromFile(BufferedReader reader) {
        try (BufferedReader br = new BufferedReader(reader)){
            String line;
            while ((line = br.readLine())!= null){
                String[] parts = line.split("=");
                quantity.put(parts[0],Integer.parseInt(parts[1]));
            }
        } catch (IOException e) {
            throw new IllegalStateException("File not found");
        }
    }

    public int getNumberOfOwls(String s) {
        return quantity.get(s);
    }
}
