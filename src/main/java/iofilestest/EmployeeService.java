package iofilestest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeService {

    public void writeEmployeesToFile(List<String> employees, Path path){
        try (BufferedWriter br = new BufferedWriter(Files.newBufferedWriter(path))) {
            for(String s : employees){
                br.write(s + "\n");
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't write file ", ioe);
        }
    }
}
