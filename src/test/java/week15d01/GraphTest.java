package week15d01;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    public void findMaxTest(){
        Map<Integer, Integer> integerMap = new HashMap<>();
        List<Integer> keys = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> values = List.of(10, 20, 30, 40, 50, 45, 90, 20);
        for (int i = 0; i< keys.size(); i++){
            integerMap.put(keys.get(i), values.get(i));
        }
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(7, 90);
        assertEquals(expected, new Graph().findMax(integerMap));
    }
}