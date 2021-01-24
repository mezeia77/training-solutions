package ioreader.idread;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IdManager {

    List<String> result = new ArrayList<>();

    public void readIdsFromFile(String fileName){
    Path path = Path.of("src/main/resources/ioreader/" + fileName);
        try {
            BufferedReader br = Files.newBufferedReader(path);
            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file ", e);
        }
    }

    public List<String> getResult() {
        return result;
    }
}
