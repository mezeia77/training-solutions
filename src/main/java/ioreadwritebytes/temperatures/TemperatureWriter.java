package ioreadwritebytes.temperatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperatureWriter {
    public void writeTemperatures(Temperatures temperatures){
        Path file = Path.of("src/main/resources/ioreadwritebytes/temperatures.dat");
        try {
            Files.write(file, temperatures.getData());
        } catch (IOException e) {
            throw new IllegalStateException("Can't write file ", e);
        }
    }
}
