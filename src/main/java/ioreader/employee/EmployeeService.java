package ioreader.employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EmployeeService {

    public static void main(String[] args) {
        Path file = Path.of("src/main/resources/ioreader/employees.txt");

        try {
            BufferedReader bufferedReader = Files.newBufferedReader(file);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file ", e);
        }
    }
}
