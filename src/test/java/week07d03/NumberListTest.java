package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberListTest {

    @Test

    void isNumberListTest(){
        assertEquals(true, new NumberList().isIncreasing(Arrays.asList(1,2,3)));
        assertEquals(false, new NumberList().isIncreasing(Arrays.asList(1,2,3,2)));

    }
}
