package iowritebytes.employee;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EmployeeService {
    public static void main(String[] args) {
        Path path = Path.of("src\\main\\resources\\iowritebytes\\data.dat");
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(Files.newOutputStream(path))) {
            for(int i = 0; i<1100; i++){
                bufferedOutputStream.write("abcde".getBytes());
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't write file", ioe);
        }
    }
}
