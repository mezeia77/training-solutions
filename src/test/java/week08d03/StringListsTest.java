package week08d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    StringLists stringLists = new StringLists();
    List<String> first = Arrays.asList("a", "b", "c");
    List<String> second = Arrays.asList("a", "d");

    @Test
    void stringListsUnion() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(new StringLists().stringListsUnion(first, second));
        assertEquals(Arrays.asList("a", "b", "c", "d"), stringLists.stringListsUnion(first, second));

    }
}