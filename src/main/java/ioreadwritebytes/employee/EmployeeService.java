package ioreadwritebytes.employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class EmployeeService {
    public static void main(String[] args) {
        Path file = Path.of("src/main/resources/ioreadwritebytes/data.dat");

        try {
            Files.write(file, new byte[]{97,98,99});
        } catch (IOException e) {
            throw new IllegalStateException("File not found");
        }

        try {
            byte[] content = Files.readAllBytes(file);
            System.out.println(Arrays.toString(content));
        } catch (IOException e) {
            throw new IllegalStateException("File not found");
        }
    }
}
