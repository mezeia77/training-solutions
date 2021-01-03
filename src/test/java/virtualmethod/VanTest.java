package virtualmethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VanTest {
    @Test
    public void getGrossLoad() throws Exception {
        Van van = new Van(1200, 1, 200);

        assertEquals(van.getGrossLoad() , (1 + 1) * Car.getPersonAvarageWeight() + 1200 + 200);
    }

    @Test
    public void tostring() {
        Van van = new Van(1200, 1, 200);

        assertEquals(van.toString(),
                "Van{cargoWeight=" + 200 + ", numberOfPassenger=" + 1 + ", vehicleWeight=" + 1200 +'}');
    }
}
