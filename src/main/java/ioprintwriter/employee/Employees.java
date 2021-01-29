package ioprintwriter.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Employees {

    private List<String> employees = List.of("John Doe", "Jane Doe", "Jack Doe");
    Path path = Path.of("src\\main\\resources\\ioprintwriter\\employees.txt");

    public void setEmployees(){
        try (PrintWriter printWriter = new PrintWriter(Files.newBufferedWriter(path))){
            for(String employee:employees){
                printWriter.print(employee);
                printWriter.print(", ");
                printWriter.println(500_000);
            }
        } catch (IOException e) {
            throw new IllegalStateException("File not found ", e);
        }
    }

    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.setEmployees();

    }

}
