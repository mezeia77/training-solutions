package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathAlgorithmsTest {
    MathAlgorithms mathAlgorithms = new MathAlgorithms();
    @Test
        public void isPrime(){
        assertEquals(mathAlgorithms.isPrime(5), true);
        assertEquals(mathAlgorithms.isPrime(127), true);
        assertEquals(mathAlgorithms.isPrime(907), true);
        assertEquals(mathAlgorithms.isPrime(1063), true);
        assertEquals(mathAlgorithms.isPrime(12000), false);

    }
}
