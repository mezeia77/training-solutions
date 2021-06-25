package lambdastream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    List<Employee> employees = List.of(
            new Employee("John Doe"),
            new Employee("Jane Doe"),
            new Employee("Joe Doe"),
            new Employee("John Smith")
    );

    @Test
    void testCount() {
        assertEquals(0, Stream.empty().count());
        assertEquals(2, Stream.of(
                new Employee("John Doe"),
                new Employee("Jack Doe")
        ).count());
        Stream<Employee> s = Stream.of(new Employee("John Doe"), new Employee("Jack Doe"));
        assertEquals(2, s.count());

        assertEquals(4, employees.size());
        assertEquals(4, employees.stream().count());
    }

    @Test
    void testMin() {
        Employee employee = employees.stream().min(Comparator.comparing(Employee::getName)).get();
        assertEquals("Jane Doe", employee.getName());
    }

    @Test
    void testFindFirst() {
        Employee employee = employees.stream().findFirst().get();
        assertEquals("John Doe", employee.getName());
    }

    @Test
    void testALlMatch(){
        boolean result = employees.stream().allMatch(e->e.getName().length()>5);
        assertTrue(result);

        assertFalse( employees.stream().allMatch(e->e.getName().startsWith("a")));
        System.out.println(employees.stream().allMatch(e->e.getName().startsWith("j")));
    }

    @Test
    void testForEach(){
        employees.stream().forEach(System.out::println);
        employees.stream().forEach(e->e.setName(e.getName().toUpperCase()));
        employees.stream().forEach(System.out::println);
    }

}