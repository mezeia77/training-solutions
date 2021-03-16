package software;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperSoftwareTest {

    @Test
    void createTest(){
        DeveloperSoftware developerSoftware = new DeveloperSoftware("AutoCAD", 100_000);
        assertEquals("AutoCAD", developerSoftware.getName());
        assertEquals(100000*1.1, developerSoftware.increasePrice());
    }

}