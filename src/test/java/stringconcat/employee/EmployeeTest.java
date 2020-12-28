package stringconcat.employee;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    @Test
    public void testCreate() {
        Employee employee = new Employee("Kis Géza", "minőségellenőr", 520000);

        assertEquals("Kis Géza", employee.getName());
        assertEquals("minőségellenőr", employee.getJob());
        assertEquals(520000, employee.getSalary());
    }

    @Test
    public void testCreateWithEmptyName() {

        System.out.println(new Employee("", "minőségellenőr", 520000));
    }

    @Test
    public void testCreateWithNullJob() {

        System.out.println(new Employee("Kis Géza", null, 520000));
    }

    @Test
    public void testCreateWithNegativeSalary() {

        System.out.println(new Employee("Kis Géza", "minőségellenőr", -520000));
    }

    @Test
    public void testToString() {
        Employee employee = new Employee("Kis Géza", "minőségellenőr", 1000);

        assertEquals("Kis Géza - minőségellenőr - 1000 Ft", employee.toString());
    }
}
