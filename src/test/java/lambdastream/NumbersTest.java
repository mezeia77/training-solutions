package lambdastream;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void minTest() {
        Numbers numbers = new Numbers(List.of(1, 4, 7, 2, -3, 9, -4));
        assertEquals(Optional.of(-4), numbers.min());
    }

    @Test
    void minTestForEmptyList(){
        Numbers numbers = new Numbers(Collections.EMPTY_LIST);
        assertEquals(Optional.empty(), numbers.min());
        numbers = new Numbers(Collections.emptyList());
        assertEquals(Optional.empty(), numbers.min());
    }

    @Test
    void sumTest(){
        Numbers numbers = new Numbers(List.of(1, 4, 7, 2, -3, 9, -4));
        assertEquals(16, numbers.sum());
    }

    @Test
    void sumEmptyTest(){
        Numbers numbers = new Numbers(Collections.emptyList());
        assertEquals(0, numbers.sum());
    }

    @Test
    void getDistinctElements() {
        Numbers numbers = new Numbers(List.of(1, 2, 1, 2, 1, 2, 4, 4, 4, 6));
        assertEquals(4, numbers.getDistinctElements().size());
    }

    @Test
    void isAllPositive() {
        Numbers numbers = new Numbers(List.of(1, 2, 1, 2, 1, 2, 4, 4, 4, 6));
        assertTrue(numbers.isAllPositive());
    }

    @Test
    public void isNotAllPositive() {
        Numbers numbers = new Numbers(List.of(1, 4, 7, 2, -3, 9, -4));
        assertFalse(numbers.isAllPositive());
    }
}