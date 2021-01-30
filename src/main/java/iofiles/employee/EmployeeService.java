package iofiles.employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EmployeeService {
    public static void main(String[] args) {
        Path path = Path.of("src\\main\\resources\\iofiles\\data.dat");
        System.out.println(Files.isRegularFile(path));
        try {
            System.out.println(Files.size(path));
            Files.copy(path, Path.of("src\\main\\resources\\iofiles\\data2.dat"));
            Files.delete(Path.of("src\\main\\resources\\iofiles\\data2.dat"));
        } catch (IOException ioException) {
            throw new IllegalStateException("Can't get file" , ioException);
        }
    }
}
