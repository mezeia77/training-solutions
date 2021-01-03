package virtualmethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FerryBoatTest {

    @Test
    void canCarryTrue() {
        FerryBoat ferryBoat = new FerryBoat(2000);
        Car car = new Car(1200, 0);

        assertTrue(ferryBoat.canCarry(car));

        car = new Van(1200, 1, 200);

        assertTrue(ferryBoat.canCarry(car));
    }

    @Test
    void canCarryFalse() {
        FerryBoat ferryBoat = new FerryBoat(2000);
        Car car = new Car(2000, 0);

        assertFalse(ferryBoat.canCarry(car));

        car = new Van(1, 2000, 200);

        assertFalse(ferryBoat.canCarry(car));
    }

    @Test
    void loadSuccess() {
        FerryBoat ferryBoat = new FerryBoat(2000);
        Car car = new Car(1200, 0);

        assertTrue(ferryBoat.load(car));
    }

    @Test
    void loadFailed() {
        FerryBoat ferryBoat = new FerryBoat(2000);
        Car car = new Car(2000, 0);

        assertFalse(ferryBoat.load(car));
    }

    @Test
    void getGrossLoad() {
        FerryBoat ferryBoat = new FerryBoat(2000);
        Car car = new Car(1234, 0);

        ferryBoat.load(car);

        assertEquals(ferryBoat.getGrossLoad() , 2000 + FerryBoat.getPersonAvarageWeight() + car.getGrossLoad());
    }

//    @Test
//    void toStringCar() {
//        FerryBoat ferryBoat = new FerryBoat(2000);
//        Car car = new Car(1234, 0);
//
//        ferryBoat.load(car);
//
//        assertEquals(ferryBoat.toString(),
//                ("FerryBoat{" +
//                        "car=" +
//                        "Car{numberOfPassenger=" + 0 + ", vehicleWeight=" + 1234 +'}' +
//                        '}')
//        );
//    }
//
//    @Test
//    void toStringVan() {
//        FerryBoat ferryBoat = new FerryBoat(2000);
//        Van van = new Van(1200, 1, 200);
//
//        ferryBoat.load(van);
//
//        assertEquals(ferryBoat.toString(),
//                ("FerryBoat{car=Van{cargoWeight=" + 200 + ", numberOfPassenger=" + 1 + ", vehicleWeight=" + 1200 +"}}")
//        );
//
//    }
}
