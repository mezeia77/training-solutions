package iowriter.music;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BandManager {

    private Path path = Path.of("src\\main\\resources\\iowriter\\bands_and_years.txt");

    public List<String> earlierBands(int year){
        List<String> result = new ArrayList<>();
        List<Band> bands = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(path)){
            String line;
            while ((line = reader.readLine())!=null) {
                String[] parts = line.split(";");
                bands.add(new Band(parts[0], Integer.parseInt(parts[1])));
            }
        } catch (IOException e) {
            throw new IllegalStateException("File error ", e);
        }

        for(Band band:bands){
            if(band.getYear()<year){
                result.add(band.getName());
            }
        }
        return result;
    }
}
