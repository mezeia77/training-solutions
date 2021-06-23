package lambdaoptional;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {

    @Test
    void testFindFirst() {
        List<Employee> employees =
                List.of(
                        new Employee("John Doe"),
                        new Employee("Jane Doe"),
                        new Employee("Jack Doe")
                );

        Optional<Employee> result = new EmployeeService().findFirst(employees,
                employee -> employee.getName().startsWith("Jane"));

        assertTrue(result.isPresent());
        assertEquals("Jane Doe", result.get().getName());
    }

    @Test()
    void testNotFound() {
        List<Employee> employees =
                List.of(
                        new Employee("John Doe"),
                        new Employee("Jane Doe"),
                        new Employee("Jack Doe")
                );

//        new EmployeeService().findFirst(employees,
//                employee -> employee.getName().startsWith("Joe")).orElseThrow(() -> new IllegalArgumentException("Not found"));

        assertThrows(IllegalArgumentException.class, ()->new EmployeeService().findFirst(employees,
                employee -> employee.getName().startsWith("Joe")).orElseThrow(()-> new IllegalArgumentException("Not found")));
    }

    @Test
    void testDefault() {
        List<Employee> employees =
                List.of(
                        new Employee("John Doe"),
                        new Employee("Jane Doe"),
                        new Employee("Jack Doe")
                );

        Employee result = new EmployeeService().findFirst(employees,
                employee -> employee.getName().startsWith("Joe"))
                .orElseGet(() -> new Employee("Anonymous"));

        assertEquals("Anonymous", result.getName());
    }
}