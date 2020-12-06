package w06d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListSelectorTest {

    @Test
    public void test(){

        assertEquals(new ListSelector().selector(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8")), "[02468]");
    }

    @Test
    public void withNull(){
        assertThrows(IllegalArgumentException.class, ()-> new ListSelector().selector(null));
    }

    @Test
    public void withEmpty(){
        assertEquals("", new ListSelector().selector(new ArrayList<>()));
    }
}
