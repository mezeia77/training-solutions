package iowriter.employee;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class EmployeeService {

    public static void main(String[] args) {
        Path path = Path.of("src/main/resources/iowriter/employees.txt");

        List<String> names = List.of("John Doe", "Jane Doe", "Jack Doe");

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path)){
            for(String employee : names){
                bufferedWriter.write(employee);
                bufferedWriter.write("\n");
            }
        } catch (IOException e) {
        throw new IllegalStateException("Can't write file");
        }
    }
}
