package exceptionmulticatch.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnswerStatTest {

    @Test
    void answerTruePercentTest() {
        AnswerStat as = new AnswerStat(new BinaryStringConverter());
        assertThrows(InvalidBinaryStringException.class, ()->as.convert(""));
        assertThrows(InvalidBinaryStringException.class, ()->as.convert(null));

        assertEquals(50, as.answerTruePercent("01"));
    }

    @Test
    void convertTest() {
    }
}