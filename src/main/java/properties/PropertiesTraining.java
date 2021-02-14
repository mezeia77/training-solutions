package properties;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.file.Path;
import java.util.Properties;

public class PropertiesTraining {

    private void type(){
        Properties p = new Properties();
        p.setProperty("host", "training360.com");
        System.out.println(p);
        System.out.println(p.getProperty("host"));
        System.out.println(p.getProperty("port"));
        System.out.println(p.getProperty("port", "80"));
    }

    private void load(){
        Properties p = new Properties();
        try (InputStream is = PropertiesTraining.class.getResourceAsStream("/properties/welcome.properties")){
            p.load(is);
        } catch (IOException e) {
            throw new IllegalStateException("Can't load file", e);
        }
        System.out.println(p.getProperty("welcome.message"));
    }

    private void write(){
        Properties properties = new Properties();
        properties.setProperty("host", "training360.com");
        properties.setProperty("port", "80");

        try (Writer writer = new FileWriter("src/main/resources/properties/config.properties")){
            properties.store(writer, null);

        } catch (IOException e) {
            throw new IllegalStateException("Can't save file", e);
        }
    }

    public static void main(String[] args) {
        new PropertiesTraining().load();
        new PropertiesTraining().write();
    }
}
