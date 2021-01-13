package week11d02;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    Courier courier = new Courier();

    @Test
    void add() {
        courier.addRide(new Ride(1, 1, 10));
        courier.addRide(new Ride(2, 1, 20));
        assertEquals(2, courier.getRides().size());
    }

    @Test
    void invalidDayNumberDistanceTest() {
        Ride ride1 = new Ride(0, 1, 10);
        Ride ride2 = new Ride(1, 0, 20);
        Ride ride3 = new Ride(1, 1, 0);
        Ride ride4 = new Ride(8, 1, 1);
        assertThrows(IllegalArgumentException.class, ()-> courier.addRide(ride1));
        assertThrows(IllegalArgumentException.class, ()-> courier.addRide(ride2));
        assertThrows(IllegalArgumentException.class, ()-> courier.addRide(ride3));
        assertThrows(IllegalArgumentException.class, ()-> courier.addRide(ride4));
    }

    @Test
    void dayEarlierTest(){
        courier.addRide(new Ride(1, 1, 10));
        courier.addRide(new Ride(2, 1, 20));
        assertThrows(IllegalArgumentException.class, ()-> courier.addRide(new Ride(1, 2, 30)));
    }

    @Test
    void numberEarlierTest(){
        courier.addRide(new Ride(1, 1, 10));
        courier.addRide(new Ride(1, 2, 20));
        assertThrows(IllegalArgumentException.class, ()-> courier.addRide(new Ride(1, 2, 30)));
        assertThrows(IllegalArgumentException.class, ()-> courier.addRide(new Ride(1, 1, 30)));
    }

    @Test
    void numberNotFollowingTest(){
        courier.addRide(new Ride(1, 1, 10));
        courier.addRide(new Ride(1, 2, 20));
        assertThrows(IllegalArgumentException.class, ()-> courier.addRide(new Ride(1, 4, 30)));
    }


    @Test
    void noFreeDay() {
        List<Ride> rides = new ArrayList<>();
        rides.add(new Ride(2, 1, 10));
        rides.add(new Ride(3, 1, 10));
        rides.add(new Ride(4, 1, 10));
        assertEquals(-1, courier.firstFreeDay(rides));
    }

    @Test
    void firstFreeDay() {
        List<Ride> rides = new ArrayList<>();
        rides.add(new Ride(2, 1, 10));
        rides.add(new Ride(4, 1, 10));
        rides.add(new Ride(6, 1, 10));
        assertEquals(3, courier.firstFreeDay(rides));
    }
}