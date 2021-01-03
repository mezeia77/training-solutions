package statemachine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeatHeaterTest {

    @Test
    void testNext(){
        assertEquals(SeatHeater.MEDIUM, SeatHeater.MAXIMUM.next());
        assertEquals(SeatHeater.MINIMUM, SeatHeater.MEDIUM.next());
        assertEquals(SeatHeater.OFF, SeatHeater.MINIMUM.next());
        assertEquals(SeatHeater.MAXIMUM, SeatHeater.OFF.next());
    }
}
