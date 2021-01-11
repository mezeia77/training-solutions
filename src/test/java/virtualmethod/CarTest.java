package virtualmethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void getGrossLoadWithRealValues() {
        Car car = new Car(1700, 4);

        assertEquals(car.getGrossLoad(),(4 + 1) * Car.getPersonAvarageWeight() + 1700);
    }

    @Test
    public void tostring() {
        Car car = new Car(1700, 4);

        assertEquals(car.toString(), "Car{numberOfPassenger=" + 4 + ", vehicleWeight=" + 1700 +'}');
    }
}
