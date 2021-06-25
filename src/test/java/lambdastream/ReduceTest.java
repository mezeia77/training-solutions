package lambdastream;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ReduceTest {
    List<Employee> employees = List.of(
            new Employee("John Doe"),
            new Employee("Jane Doe"),
            new Employee("Joe Joe Doe"),
            new Employee("John Smith")
    );

    @Test
    void testReduce(){
        int lenght = employees.stream().reduce(0, (i, e)->i+e.getName().length(), (i1, i2)->i1+i2);
        lenght = employees.stream().reduce(0, (i, e)->i+e.getName().length(), Integer::sum);
        System.out.println(lenght);
    }

    @Test
    void testNameCounter(){
        NameCounter nameCounter = employees.stream().reduce(
          new NameCounter(),
                (nc, e)->nc.add(e),
                (nc1, nc2)->nc1.add(nc2)
        );
        System.out.println(nameCounter.getTwoPartName());
        System.out.println(nameCounter.getThreePartName());
    }
}
