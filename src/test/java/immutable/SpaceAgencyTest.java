package immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpaceAgencyTest {
   /* @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void nullParameterShouldThrowException() throws NullPointerException {
        // Given
        exception.expect(NullPointerException.class);
        exception.expectMessage("Parameter must not be null!");
        // When
        new SpaceAgency().registerSatellite(null);
    }*/

    @Test
    public void testRegisterSatellite() {
        // Given
        SpaceAgency sa = new SpaceAgency();
        // When
        sa.registerSatellite((new Satellite(new CelestialCoordinates(12, 23, 45), "ASD345")));
        sa.registerSatellite((new Satellite(new CelestialCoordinates(22, 33, 44), "QWE789")));
        //Then
        assertEquals(sa.toString(), "[ASD345: CelestialCoordinates: x=12, y=23, z=45, QWE789: CelestialCoordinates: x=22, y=33, z=44]");
    }

    /*@Test
    public void testNotFoundSatelliteByRegisterIdent() throws IllegalArgumentException {
        // Given
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Satellite with the given registration cannot be found!");
//        SpaceAgency sa = new SpaceAgency();
//        sa.registerSatellite((new Satellite(new CelestialCoordinates(12, 23, 45), "ASD345")));
//        sa.registerSatellite((new Satellite(new CelestialCoordinates(22, 33, 44), "QWE789")));
        // When
        new SpaceAgency().findSatelliteByRegisterIdent("XXX123");
    }*/

    @Test
    public void testFindSatelliteByRegisterIdent() {
        // Given
        SpaceAgency sa = new SpaceAgency();
        // When
        sa.registerSatellite((new Satellite(new CelestialCoordinates(12, 23, 45), "ASD345")));
        sa.registerSatellite((new Satellite(new CelestialCoordinates(22, 33, 44), "QWE789")));
        //Then
        assertEquals(sa.findSatelliteByRegisterIdent("QWE789").toString(), "QWE789: CelestialCoordinates: x=22, y=33, z=44");
    }
}
