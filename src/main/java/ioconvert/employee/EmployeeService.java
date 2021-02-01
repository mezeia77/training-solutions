package ioconvert.employee;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class EmployeeService {

    public static void main(String[] args) {
        Path path = Path.of("src\\main\\resources\\ioconvert\\data.dat");
        try (OutputStreamWriter os = new OutputStreamWriter(new BufferedOutputStream(Files.newOutputStream(path)))) {
            os.write("John Doe");
        } catch (IOException ioe){
            throw new IllegalStateException("Can't write file ", ioe);
        }

        try (PrintStream os = new PrintStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            os.println("John Doe");
        } catch (IOException ioe){
            throw new IllegalStateException("Can't write file ", ioe);
        }
    }
}
