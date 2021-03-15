package exam03retake02;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.Collator;
import java.util.*;

public class BalatonStorm {
    public List<String> getStationsInStorm(BufferedReader reader) {
        List<String> result = new ArrayList<>();
        List<String> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(reader)){
            String line;
            while ((line=br.readLine())!=null){
                if(line.contains("allomas")) {
                    String s = line.substring(16, line.lastIndexOf("\""));
                    data.add(s);
                }
                if(line.contains("level")) {
                    String s = line.substring(line.length()-2, line.length()-1);
                    data.add(s);
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("File not found");
        }
        for (int i = 0; i<data.size(); i++){
            if(data.get(i).contains("3")){
                result.add(data.get(i-1));
            }
        }
        Collections.sort(result, Collator.getInstance(new Locale("hu", "HU")));
        return result;
    }
}
