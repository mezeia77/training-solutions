package iowritestring.training;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Training {
    public static void main(String[] args) {
        Path path = Path.of("src/main/resources/iowritestring/employees.txt");
        try {
            Files.writeString(path, "John Doe", StandardOpenOption.APPEND);
            Files.write(path, List.of("John Doe", "Jane Doe"));
        } catch (IOException e) {
            throw new IllegalStateException("Cant write file, e");
        }
    }
}
