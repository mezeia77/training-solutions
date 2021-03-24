package exam04retake01.people;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class People {
    public int getNumberOfMales(String path){
        int result = 0;
        try (BufferedReader br = Files.newBufferedReader(Path.of(path))){
            String line;
            br.readLine();
            while ((line = br.readLine())!=null){
                String[] parts = line.split(",");
                if(parts[4].equals("Male")){
                    result++;
                }
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("File not found", ioException);
        }

        return result;
    }
}
