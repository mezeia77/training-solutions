package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DatabaseConfiguration {

    private Properties properties;

    public DatabaseConfiguration(File file) {
        try (FileInputStream fileInputStream = new FileInputStream(file)){
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new IllegalArgumentException("Can't read file", e);
        }
    }

}
