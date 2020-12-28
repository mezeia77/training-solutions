package algorithmsmax.integers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerMaxCalculatorTest {
    @Test
    void maxValueTest(){
        List<Integer> numbers = Arrays.asList(
                new Integer(50),
                new Integer(10),
                new Integer(75),
                new Integer(25)
        );
        assertEquals(new IntegerMaxCalculator().maxNumber(numbers), 75);
    }
}
