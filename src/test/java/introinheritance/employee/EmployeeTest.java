package introinheritance.employee;

import introinheritance.employee.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void testCreateEmployee() {
        //Given
        Employee employee = new Employee("John Doe", "1117 Budapest, Budafoki út 56.", 300_000);
        //Then
        assertEquals(employee.getName(), "John Doe");
        assertEquals(employee.getAddress(), "1117 Budapest, Budafoki út 56.");
        assertEquals(employee.getSalary(), 300_000.0);
    }

    @Test
    public void testMigrateEmployee() {
        //Given
        Employee employee = new Employee("John Doe", "1117 Budapest, Budafoki út 56.", 300_000);
        employee.migrate("1117 Budapest, Budafoki út 100.");
        //Then
        assertEquals(employee.getAddress(), "1117 Budapest, Budafoki út 100.");
    }

    @Test
    public void testRaiseSalary() {
        //Given
        Employee employee = new Employee("John Doe", "1117 Budapest, Budafoki út 56.", 300_000);
        //When
        employee.raiseSalary(10);
        //Then
        assertEquals(employee.getSalary(), 330_000.0);
    }

}
