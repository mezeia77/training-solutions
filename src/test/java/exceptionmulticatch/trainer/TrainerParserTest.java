package exceptionmulticatch.trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerParserTest {

    @Test
    void constructorTest() {
        TrainerParser trainerParser = new TrainerParser();
        assertEquals("John Doe", trainerParser.parse("John Doe;1980").getName());
        assertEquals(1980, trainerParser.parse("John Doe;1980").getYear());
    }

    @Test
    void noRegexTest() {
        TrainerParser trainerParser = new TrainerParser();
        assertThrows(ParserException.class, () ->trainerParser.parse("John Doe1980"));
        assertThrows(ParserException.class, () ->trainerParser.parse("John Doe, asdf"));
        assertThrows(ParserException.class, () ->trainerParser.parse(""));
        assertThrows(ParserException.class, () ->trainerParser.parse(null));
    }
}