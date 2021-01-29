package iostringwrites;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LongwordsTest {

    Longwords longwords = new Longwords();

    @Test
    void longWordManagerTest() {
        List<String> testWords = List.of(
                "megszentségteleníthetetlenségeitekért",
                "megszokhatatlanságul",
                "Kispál");
        String s = longwords.useStringWriter(testWords);
        String[] test = s.split("\n");
        assertEquals(3, test.length);
        assertTrue(test[0].contains("37"));
        assertTrue(test[1].contains("20"));
        assertTrue(test[2].contains("6"));
    }
}