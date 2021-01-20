package week11d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RideTest {
    Ride ride = new Ride(1, 2, 30);

    @Test
    void getDay() {
        assertEquals(1, ride.getDay());
    }

    @Test
    void getNumber() {
        assertEquals(2, ride.getNumber());
    }

    @Test
    void getDistance() {
        assertEquals(30, ride.getDistance());
    }
}