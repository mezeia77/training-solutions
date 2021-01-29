package week13d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TemplateMerger {

    public String merge(Path file, List<Employee> employees){
        String line;
        try (BufferedReader br = Files.newBufferedReader(file)){
                line=br.readLine();
        } catch (IOException e) {
            throw new IllegalStateException("File not found", e);
        }

        String first = line.substring(0, line.indexOf(":")+1);
        String second = line.substring(line.indexOf(","), line.lastIndexOf(":")+1);

        String result = "";
        for(Employee employee:employees){
            result += first + employee.getName() + second + employee.getYearOfBirth() +"\n";
        }
        return result;
    }
}
