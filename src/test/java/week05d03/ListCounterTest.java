package week05d03;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListCounterTest {

    @Test
    void ListCounter(){
        assertEquals(4, new ListCounter().counter(Arrays.asList("Valami Amerika")));
    }

}
