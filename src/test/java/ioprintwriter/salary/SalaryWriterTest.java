package ioprintwriter.salary;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWriterTest {

    List<String> names = List.of("Dr. John Doe", "Mrs. Jane Doe", "Jack Doe");

    @Test
    void salaryTest(){
        SalaryWriter salaryWriter = new SalaryWriter(names);
        salaryWriter.writeNamesAndSalaries(Path.of("src\\main\\resources\\ioprintwriter\\names.txt"));
    }

}