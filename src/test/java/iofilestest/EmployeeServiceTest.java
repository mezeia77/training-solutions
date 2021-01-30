package iofilestest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;


import java.io.IOException;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {

    @TempDir
    public Path directory;

    @Test
    void writeEmployeesToFileTest() throws IOException {
        List<String> employees = List.of("John Doe", "Jane Doe");
//        new EmployeeService().writeEmployeesToFile(employees, directory);

    }
}