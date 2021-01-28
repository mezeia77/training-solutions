package week13d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TemplateMerger2 {

    public StringBuilder merge(Path file, List<Employee> employees){
        String line;
        try {
            line = Files.readString(file);
        } catch (IOException e) {
            throw new IllegalStateException("File not found");
        }
        String temp;
        String temp2;
        StringBuilder result = new StringBuilder();
        for(Employee employee:employees){
            temp = line.replace("{nev}", employee.getName());
            temp2 = temp.replace("{ev}", Integer.toString(employee.getYearOfBirth()));
            result.append(temp2).append("\n");
            }
        return result;
    }
}
