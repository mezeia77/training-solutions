package iowriter.music;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BandManagerTest {

    BandManager bandManager = new BandManager();

    @Test
    void findEarlierTest(){
        List<String> test2000 = List.of("Metallica", "Omega", "Pearl Jam", "The Beatles", "Edda", "Michael Jackson");
        assertEquals(test2000, bandManager.earlierBands(2000));
    }

}