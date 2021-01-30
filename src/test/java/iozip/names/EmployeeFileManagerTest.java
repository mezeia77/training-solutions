package iozip.names;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

class EmployeeFileManagerTest {

    @Test
    void saveEmployeesTest() {
        EmployeeFileManager fileManager = new EmployeeFileManager();
        List<String> names = List.of("John Doe", "Jane Doe", "Jack Doe");
        fileManager.saveEmployees(Path.of("src\\main\\resources\\iozip\\names.zip"), names);
    }
}