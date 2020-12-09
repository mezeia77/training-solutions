package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumberListTest {

    @Test

    void isNumberListTest(){
        assertTrue(new NumberList().isIncreasing(Arrays.asList(1,2,3,4)));
        assertFalse(new NumberList().isIncreasing(Arrays.asList(1,2,3,4,3)));
        assertEquals(true, new NumberList().isIncreasing(Arrays.asList(1,2,3)));
        assertEquals(false, new NumberList().isIncreasing(Arrays.asList(1,2,3,2)));

    }
}
