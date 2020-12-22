package week09d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibCalculatorTest {

    FibCalculator fibCalculator = new FibCalculator();

    @Test
    void sumEvensTest(){
        assertEquals(10, fibCalculator.sumEvens(10));
        assertEquals(44, fibCalculator.sumEvens(11));
        assertEquals(188, fibCalculator.sumEvens(14));

    }

}
