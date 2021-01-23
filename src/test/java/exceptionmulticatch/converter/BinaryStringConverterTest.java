package exceptionmulticatch.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryStringConverterTest {

    @Test
    void invalidStringTest(){
        BinaryStringConverter bsc = new BinaryStringConverter();
        assertThrows(InvalidBinaryStringException.class, ()-> bsc.binaryStringToBooleanArray(""));
        assertThrows(InvalidBinaryStringException.class, ()-> bsc.binaryStringToBooleanArray(null));
        assertThrows(InvalidBinaryStringException.class, ()-> bsc.binaryStringToBooleanArray("012"));
    }

    @Test
    void binaryStringToBooleanArrayTest() {
        BinaryStringConverter bsc = new BinaryStringConverter();
        boolean[] expected = new boolean[]{false, true};
        String data = "01";
//        assertEquals(expected, bsc.binaryStringToBooleanArray("01"));
        assertEquals(2, bsc.binaryStringToBooleanArray("01").length);
    }

    @Test
    void invalidBooleanTest(){
        BinaryStringConverter bsc = new BinaryStringConverter();
        assertThrows(NullPointerException.class, ()->bsc.booleanArrayToBinaryString(null));
        boolean[] data =new boolean[]{};
        assertThrows(IllegalArgumentException.class, ()->bsc.booleanArrayToBinaryString(data));
    }

    @Test
    void booleanArrayToBinaryStringTest() {
        BinaryStringConverter bsc = new BinaryStringConverter();
        boolean[] data =new boolean[]{false, true, false};
        assertEquals("010", bsc.booleanArrayToBinaryString(data));
    }
}