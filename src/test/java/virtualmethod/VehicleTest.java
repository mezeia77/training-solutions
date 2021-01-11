package virtualmethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    @Test
    public void getGrossLoad() {
        Vehicle vehicle = new Vehicle(1000);

        assertEquals(vehicle.getGrossLoad(), 1000 + Vehicle.getPersonAvarageWeight());
    }

    @Test
    public void getVehicleWeight() {
        Vehicle vehicle = new Vehicle(1000);

        assertEquals(vehicle.getVehicleWeight(), 1000 );
    }

    @Test
    public void tostring() {
        Vehicle vehicle = new Vehicle(1000);

        assertEquals(vehicle.toString(), "Vehicle{vehicleWeight=" + 1000 +'}');
    }
}
