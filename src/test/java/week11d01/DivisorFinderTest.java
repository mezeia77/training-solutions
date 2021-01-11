package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorFinderTest {

    @Test
    void findDivisors() {
        assertEquals(1, new DivisorFinder().findDivisors(425));
        assertEquals(1, new DivisorFinder().findDivisors(25));
        assertEquals(3, new DivisorFinder().findDivisors(1120));
        assertEquals(3, new DivisorFinder().findDivisors(555));
        assertEquals(3, new DivisorFinder().findDivisors(-555));
    }
}