package week10d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void getPlusElevation() {
        List<Double> heights = Arrays.asList(10.0,20d,15d,18.0);
        assertEquals(13.0, new Hiking().getPlusElevation(heights));
    }
}