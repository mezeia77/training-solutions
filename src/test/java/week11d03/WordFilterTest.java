package week11d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {

    @Test
    void wordsWithCharTest() {
        WordFilter wordFilter = new WordFilter();
        List<String> words = new ArrayList<>();
        words.add("door");
        words.add("Window");
        words.add("table");
        words.add("chair");
        words.add("computer");
        assertEquals(3, wordFilter.wordsWithChar(words, 'o').size());
        assertEquals(1, wordFilter.wordsWithChar(words, 'w').size());
        assertEquals(2, wordFilter.wordsWithChar(words, 'a').size());
    }

    @Test
    void wordsWithCharTest2() {
        WordFilter wordFilter = new WordFilter();
        List<String> words = new ArrayList<>();
        words.add("door");
        words.add("Window");
        words.add("table");
        words.add("chair");
        words.add("computer");
        assertEquals(3, wordFilter.wordsWithChar2(words, 'o').size());
        assertEquals(1, wordFilter.wordsWithChar2(words, 'w').size());
        assertEquals(2, wordFilter.wordsWithChar2(words, 'a').size());
    }

    @Test
    void wordsWithCharTest3() {
        WordFilter wordFilter = new WordFilter();
        List<String> words = new ArrayList<>();
        words.add("door");
        words.add("Window");
        words.add("table");
        words.add("chair");
        words.add("computer");
        assertEquals(3, wordFilter.wordsWithChar3(words, 'o').size());
        assertEquals(1, wordFilter.wordsWithChar3(words, 'w').size());
        assertEquals(2, wordFilter.wordsWithChar3(words, 'a').size());
    }

    @Test
    void wordsWithCharTest4() {
        WordFilter wordFilter = new WordFilter();
        List<String> words = new ArrayList<>();
        words.add("door");
        words.add("Window");
        words.add("table");
        words.add("chair");
        words.add("computer");
        assertEquals(3, wordFilter.wordsWithChar4(words, 'o').size());
        assertEquals(1, wordFilter.wordsWithChar4(words, 'w').size());
        assertEquals(2, wordFilter.wordsWithChar4(words, 'a').size());
    }
}