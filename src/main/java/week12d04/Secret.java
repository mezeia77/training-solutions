package week12d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Secret {
    public static void main(String[] args) {

        Path path = Path.of("src/main/resources/week12d04/secret.dat");
        try {
            byte[] bytes = Files.readAllBytes(path);
            for(byte b:bytes){
                int i = b+10;
                char c = (char) i;
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
