package iowriter.music;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BandTest {

    Band band = new Band("Fleetwood Mac", 1967);

    @Test
    void getterTest(){
        assertEquals("Fleetwood Mac", band.getName());
        assertEquals(1967, band.getYear());
    }

}