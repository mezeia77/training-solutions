package formatlocaleprintf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintfTest {

    @Test
    public void testPrintFormattedTextWDouble() {
        // Given
        Double d = 561123.201;

        //Then
        assertEquals(new Printf().printFormattedText(d), "Total is: 561 123,20 Ft");
    }

    @Test
    public void testPrintFormattedTextWIntString() {
        // Given
        String fruit = "APPLES";
        int count = 6;

        //Then
        assertEquals(new Printf().printFormattedText(count, fruit), "We counted 6 APPLES in the basket");
    }

    @Test
    public void testPrintFormattedTextWIntegerRightEdge() {
        // Given
        int i = 6;
        int j = 66;
        int k = 666666;   //overflow to the right expected!

        //Then
        assertEquals(new Printf().printFormattedText(i), "Right edge of numbers set at 4 spaces from text:   " + i);
        assertEquals(new Printf().printFormattedText(j), "Right edge of numbers set at 4 spaces from text:  " + j);
        assertEquals(new Printf().printFormattedText(k), "Right edge of numbers set at 4 spaces from text:" + k);
    }

    @Test
    public void testPrintFormattedTextWMultipleObject() {
        // Given
        int i = 6;
        int j = 7;
        int k = 8;

        //Then
        assertEquals(new Printf().printFormattedText(i, j, k), "Multiple objects containing text:" + i + "\t" + j + "\t" + k);
    }
}
