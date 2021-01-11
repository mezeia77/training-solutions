package week04d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    @Test
    void getIndexesOfChar() {
        Search search = new Search();

        assertEquals(3, search.getIndexesOfChar("Almafa", 'a').size());
        assertEquals(Arrays.asList(0, 3, 5), search.getIndexesOfChar("Almafa", 'a'));
    }
}