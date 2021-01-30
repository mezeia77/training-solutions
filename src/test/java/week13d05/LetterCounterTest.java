package week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCounterTest {

    @Test
    void countLetters() {
        LetterCounter letterCounter = new LetterCounter();
        assertThrows(IllegalArgumentException.class, ()-> letterCounter.countLetters(null));
        assertThrows(IllegalArgumentException.class, ()-> letterCounter.countLetters(""));
        assertEquals(3, letterCounter.countLetters(" alma 12"));
        assertEquals(26, letterCounter.countLetters("abcdefghijklmnopqrstuvwxyz"));
        assertEquals(26, letterCounter.countLetters("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));
    }
}