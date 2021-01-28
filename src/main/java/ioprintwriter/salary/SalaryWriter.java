package ioprintwriter.salary;

import intromethods.Employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SalaryWriter {

    private List<String> employees;

    public SalaryWriter(List<String> employees) {
        this.employees = employees;
    }

    public void writeNamesAndSalaries(Path file){
        try (PrintWriter printWriter = new PrintWriter(Files.newBufferedWriter(file))){
            for (String employee:employees) {
                printWriter.print(employee + ": ");
                printWriter.println(decideSalary(employee));
            }
        } catch (IOException e) {
            throw new IllegalStateException("File not found ", e);
        }
    }

    private int decideSalary(String employee) {
        if (employee.contains("Dr")) {
            return 500_000;
        } if(employee.contains("Mr") || employees.contains("Mrs")) {
            return 200_000;
        } else {
            return 100_000;
        }
    }
}
