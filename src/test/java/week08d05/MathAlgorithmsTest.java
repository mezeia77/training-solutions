package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathAlgorithmsTest {
    MathAlgorithms mathAlgorithms = new MathAlgorithms();
    @Test
    public void gretestCommonDivisorTest(){
        assertEquals (mathAlgorithms.greatestCommonAdvisor(8, 6), 2);
    }


}
