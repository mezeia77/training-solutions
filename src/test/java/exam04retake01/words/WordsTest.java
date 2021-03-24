package exam04retake01.words;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordsTest {
    @Test
    void hasMoreDigits() {
        Words words = new Words();
        assertTrue(words.hasMoreDigits("1"));
        assertTrue(words.hasMoreDigits("11a"));
        assertTrue(words.hasMoreDigits("111aa"));
        assertTrue(words.hasMoreDigits("1aa111"));
        assertFalse(words.hasMoreDigits(""));
        assertFalse(words.hasMoreDigits("1a"));
    }
}
