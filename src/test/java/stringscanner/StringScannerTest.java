package stringscanner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringScannerTest {

    @Test
    public void delimiterIsSpaceOrNull(){

        assertEquals(new StringScanner().readAndSumValues("2 4 5"," "),11);
        assertEquals(new StringScanner().readAndSumValues("2 4 5",null),11);
    }


    @Test
    public void readAndSumValues() {

        assertEquals(new StringScanner().readAndSumValues("1:2:3", ":"), 6);
        assertEquals(new StringScanner().readAndSumValues("1:2:3", ":"), 6);
    }

    @Test
    public void readAndSumValuesWithoutDelimiter() {

        assertEquals(new StringScanner().readAndSumValues("1 2 3"), 6);
        new StringScanner().readAndSumValues("3:2:4", null);
    }

    @Test
    public void filterLinesWithWordOccurrences() {
        assertEquals(new StringScanner().filterLinesWithWordOccurrences("first word\napple\nnext word", "word"), "first word\nnext word");
        assertEquals(new StringScanner().filterLinesWithWordOccurrences("first\napple\nnext", "word"), "");
        assertEquals(new StringScanner().filterLinesWithWordOccurrences("first\napple\nnext", " "), "");
    }

    @Test
    public void textIsEmptyShouldThrowException() throws IllegalArgumentException{

        new StringScanner().filterLinesWithWordOccurrences("", "word");
    }

    @Test
    public void textIsJustSpacesShouldThrowException() throws IllegalArgumentException{

        new StringScanner().filterLinesWithWordOccurrences("       ", "word");
    }

    @Test
    public void textIsNullShouldThrowException() throws IllegalArgumentException{

        new StringScanner().filterLinesWithWordOccurrences(null, "word");
    }

    @Test
    public void wordIsNullShouldThrowException() throws IllegalArgumentException{

        new StringScanner().filterLinesWithWordOccurrences("a\nbc", null);
    }

    @Test
    public void wordIsEmptyShouldThrowException() throws IllegalArgumentException{

        new StringScanner().filterLinesWithWordOccurrences("a\nbc", "");
    }

}
