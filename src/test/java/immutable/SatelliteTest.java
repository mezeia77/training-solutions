package immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SatelliteTest {
    /*@Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void emptyParameterShouldThrowException() throws IllegalArgumentException {
        // Given
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Register ident must not be empty!");
        // When
        new Satellite(new CelestialCoordinates(12, 23, 45), "");
    }*/

    @Test
    public void testModifyDestination() {
        // Given
        Satellite satellite = new Satellite(new CelestialCoordinates(12, 23, 45), "ASD567");
        // When
        satellite.modifyDestination(new CelestialCoordinates(2, 2, 2));
        //Then
        assertEquals(satellite.toString(), "ASD567: CelestialCoordinates: x=14, y=25, z=47");
    }
}
