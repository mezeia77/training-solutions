package iodatastream.statistics;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightStatisticsTest {

    HeightStatistics hs = new HeightStatistics();

    @Test
    void saveHeightsTest() {
        hs.saveHeights(List.of(185, 190, 195, 200, 205, 207, 210), "heights.dat");
    }

    @Test
    void loadHeights(){
        System.out.println(hs.loadHeights("heights.dat"));
    }
}