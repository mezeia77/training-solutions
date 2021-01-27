package ioreadwritebytes.temperatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperatureReader {
    public Temperatures temperatures(String pathString){
        try {
            byte[] data = Files.readAllBytes(Path.of(pathString));
            return new Temperatures(data);
        } catch (IOException e) {
            throw new IllegalStateException("File not found ", e);
        }
    }
}
