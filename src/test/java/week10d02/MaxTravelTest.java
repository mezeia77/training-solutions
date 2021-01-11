package week10d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxTravelTest {

    @Test
    void getMaxIndex() {

        MaxTravel maxTravel = new MaxTravel();

        List<Integer> stations = List.of(12,12,0,3,12,4,4,4,12,12);

        assertEquals(12, maxTravel.getMaxIndex(stations));
        assertEquals(12, new MaxTravel().getMaxIndex(stations));
    }
}