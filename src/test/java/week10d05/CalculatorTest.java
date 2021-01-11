package week10d05;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void findMinSumWith5Numbers() {
        Calculator calc = new Calculator();
        int[] test = {1, 2, 5, 4, 10};

        assertEquals(12, calc.findMinSum(test));
    }

    @Test
    void findMinSumWith4Numbers() {
        Calculator calc = new Calculator();
        int[] test = {1, 2, 5, 4};

        assertEquals(12, calc.findMinSum(test));
    }

    @Test
    void findMinSumWith3Numbers() {
        Calculator calc = new Calculator();
        int[] test = {1, 2, 5};

        assertEquals(8, calc.findMinSum(test));
    }
}