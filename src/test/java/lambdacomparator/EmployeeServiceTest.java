package lambdacomparator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {

    private List<Employee> employees = Collections.unmodifiableList(List.of(
            new Employee("John Doe", 180_000, null),
            new Employee("Jane Doe", 200_000, "bbb-123"),
            new Employee("Joe Doe", 100_000, null),
            new Employee("John Smith", 100_000, "aaa-123")));

    private EmployeeService employeeService = new EmployeeService();

    @Test
    void testSortByName() {
        List<Employee> sorted = employeeService.sortByName(new ArrayList<>(this.employees));

        assertEquals(List.of("Jane Doe", "Joe Doe", "John Doe", "John Smith"), toNames(sorted));
    }

    private List<String> toNames(List<Employee> employees) {
        List<String> result = new ArrayList<>();
        for(Employee employee:employees){
            result.add(employee.getName());
        }
        return result;
    }

    @Test
    void testSortBySalaryThanName() {
        List<Employee> sorted = employeeService.sortBySalaryThanName(new ArrayList<>(this.employees));

        assertEquals(List.of("Joe Doe", "John Smith", "John Doe", "Jane Doe"), toNames(sorted));
    }

    @Test
    void testSortByCardNumberNullsFirst() {
        List<Employee> sorted = employeeService.sortByCardNumberNullsFirst(new ArrayList<>(this.employees));
        assertEquals(List.of("Joe Doe", "John Doe", "John Smith", "Jane Doe"), toNames(sorted));
    }

    @Test
    void testSortByNameReversed() {
        List<Employee> sorted = employeeService.sortByNameReversed(new ArrayList<>(this.employees));
        assertEquals(List.of("John Smith", "John Doe", "Joe Doe", "Jane Doe"), toNames(sorted));
    }


}