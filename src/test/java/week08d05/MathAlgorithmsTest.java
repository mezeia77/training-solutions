package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathAlgorithmsTest {
    MathAlgorithms mathAlgorithms = new MathAlgorithms();
    @Test
    public void greatestCommonDivisorTest(){
        assertEquals (mathAlgorithms.greatestCommonAdvisor(4, 2), 2);
    }


}
