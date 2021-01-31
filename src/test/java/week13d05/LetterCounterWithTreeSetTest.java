package week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCounterWithTreeSetTest {

    @Test
    void countLetters() {
            LetterCounterWithTreeSet letterCounterWithTreeSet = new LetterCounterWithTreeSet();
            assertThrows(IllegalArgumentException.class, ()-> letterCounterWithTreeSet.countLetters(null));
            assertThrows(IllegalArgumentException.class, ()-> letterCounterWithTreeSet.countLetters(""));
            assertEquals(3, letterCounterWithTreeSet.countLetters(" alma 12"));
            assertEquals(26, letterCounterWithTreeSet.countLetters("abcdefghijklmnopqrstuvwxyz"));
            assertEquals(26, letterCounterWithTreeSet.countLetters("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));
    }
}