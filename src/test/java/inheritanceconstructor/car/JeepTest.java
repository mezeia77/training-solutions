package inheritanceconstructor.car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JeepTest {
//    @Rule
//    public final ExpectedException exception = ExpectedException.none();
//
//    @Test
//    public void incorrectParameterShouldThrowException() throws IllegalArgumentException {
//        // Given
//        exception.expect(IllegalArgumentException.class);
//        exception.expectMessage("Tank capacity is less than fuel!");
//        // When
//        new Jeep(10.0, 60.0, 50.0, 40.0, 20.0);
//    }

    @Test
    public void testCalculateRefillAmount() {
        //Given
        Jeep jeep = new Jeep(10.0, 30.0, 50.0, 40.0, 20.0);
        //Then
        assertEquals(40.0, jeep.calculateRefillAmount());
    }

    @Test
    public void testDrive() {
        //Given
        Jeep jeep = new Jeep(10.0, 30.0, 50.0, 40.0, 20.0);
        //When
        jeep.drive(300);
        //Then
        assertEquals(0, jeep.getExtraFuel());
        assertEquals(20, jeep.getFuel());
    }

//    @Test
//    public void notEnoughFuelShouldThrowException() throws RuntimeException {
//        // Given
//        Jeep jeep = new Jeep(10.0, 30.0, 50.0, 40.0, 20.0);
//        exception.expect(RuntimeException.class);
//        exception.expectMessage("Not enough fuel available!");
//        // When
//        jeep.drive(600);
//    }
}
