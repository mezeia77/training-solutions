package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialCalculatorTest {

    @Test
    public void isFactorialCorrect(){

        assertEquals(new FactorialCalculator().getFactorial(5), 120);
    }
}
