package lambdas;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {
    @Test
    void testFindFirst(){
        List<Employee> employees = List.of(
                new Employee("John Doe"),
                new Employee("Jane Doe"),
                new Employee("Jack Doe")
                );
        Employee result = new EmployeeService().findFirst(employees,
                employee -> employee.getName().startsWith("Jane"));
//        System.out.println(result.getName());
        assertEquals(result.getName(), "Jane Doe");
//        assertEquals(new EmployeeService().findFirst(employees, employee -> employee.getName().equals("Jane Doe")), "Jane Doe");
    }
}