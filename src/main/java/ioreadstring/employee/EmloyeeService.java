package ioreadstring.employee;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmloyeeService {

    public static void main(String[] args) {
        Path file = Path.of("src/main/resources/ioreadstring", "ioreader/employees.txt");
        List<String> s = null;
        try {
            s = Files.readAllLines(file, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
        System.out.println(s);
    }
}
