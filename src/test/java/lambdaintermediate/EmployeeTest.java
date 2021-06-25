package lambdaintermediate;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
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
    void testFilter(){
        List<Employee> filtered = employees.stream().filter(e->e.getName().startsWith("John")).collect(Collectors.toList());
        System.out.println(filtered);
        assertEquals(2, filtered.size());
        assertEquals("John Smith", filtered.get(1).getName());
    }

    @Test
    void testDistinct(){
        List<String> filtered = Stream.of("John", "John", "Jane", "John").distinct().collect(Collectors.toList());
        assertEquals(List.of("John", "Jane"), filtered);
    }

    @Test
    void testLimitSkip(){
        List<Employee> filtered = employees.stream().skip(1).limit(2).collect(Collectors.toList());
        assertEquals(2, filtered.size());
        assertEquals("Jane Doe", filtered.get(0).getName());
    }

    @Test
    void testInfinite(){
        Stream.generate(Math::random).limit(5).forEach(System.out::println);
        Stream.iterate(1, n->n+2).skip(2).limit(3).forEach(System.out::println);
    }

    @Test
    void testMap(){
//        List<String> names = employees.stream().limit(2).map(Employee::getName).collect(Collectors.toList());
        List<String> names = employees.stream().limit(2).map(e->e.getName()).collect(Collectors.toList());
        assertEquals(List.of("John Doe", "Jane Doe"), names);
    }

    @Test
    void testFlatMap(){
        List<String> s1 = List.of("John Doe", "Jane Doe");
        List<String> s2 = List.of("Jack Doe", "Joe Doe");
        List<String> names = Stream.of(s1, s2).flatMap(l->l.stream()).collect(Collectors.toList());
        assertEquals(List.of("John Doe", "Jane Doe", "Jack Doe", "Joe Doe"),names);
    }

    @Test
    void testSorted(){
        List<Employee> sorted = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(sorted);
    }

    @Test
    void testPeek(){
        List<String> names = employees.stream()
                .map(e->e.getName())
                .sorted().peek(System.out::println)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(names);
    }
}