package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitSumTest {
    DigitSum d = new DigitSum();

    @Test
    public void sumOfDigitsTest(){
        assertEquals(10, d.sumOfDigits(-1234));
    }
}
