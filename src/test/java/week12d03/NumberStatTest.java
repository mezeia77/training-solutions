package week12d03;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberStatTest {

    @Test
    void numberAloneTest() {
        NumberStat numberStat = new NumberStat();
        List<Integer> testNumbers = List.of(1,1,5,3,4,5,6,5,6,4,1,6,5,4);
        assertEquals(3, numberStat.numberAlone(testNumbers));
        List<Integer> testNumbers2 = List.of(5);
        assertEquals(5, numberStat.numberAlone(testNumbers2));
        List<Integer> testNumbers3 = List.of(25, 5, 99);
        assertEquals(5, numberStat.numberAlone(testNumbers3));
        List<Integer> testNumbers4 = List.of();
        assertThrows(IllegalStateException.class, ()-> numberStat.numberAlone(testNumbers4));
    }

    @Test
    void numberAlone2Test() {
        NumberStat numberStat = new NumberStat();
        List<Integer> testNumbers = List.of(1,1,5,3,4,5,6,5,6,4,1,6,5,4);
        assertEquals(3, numberStat.numberAlone2(testNumbers));
        List<Integer> testNumbers2 = List.of(5);
        assertEquals(5, numberStat.numberAlone2(testNumbers2));
        List<Integer> testNumbers3 = List.of(25, 5, 99);
        assertEquals(5, numberStat.numberAlone2(testNumbers3));
        List<Integer> testNumbers4 = List.of();
        assertThrows(IllegalStateException.class, ()-> numberStat.numberAlone2(testNumbers4));
    }

    @Test
    void numberAlone3Test() {
        NumberStat numberStat = new NumberStat();
        List<Integer> testNumbers = List.of(1,1,5,3,4,5,6,5,6,4,1,6,5,4);
        assertEquals(3, numberStat.numberAlone3(testNumbers));
        List<Integer> testNumbers2 = List.of(5);
        assertEquals(5, numberStat.numberAlone3(testNumbers2));
        List<Integer> testNumbers3 = List.of(25, 5, 99);
        assertEquals(5, numberStat.numberAlone3(testNumbers3));
        List<Integer> testNumbers4 = List.of();
        assertThrows(IllegalStateException.class, ()-> numberStat.numberAlone3(testNumbers4));
        List<Integer> testNumbers5 = List.of(5, 3);
        assertEquals(3, numberStat.numberAlone3(testNumbers5));
    }
}