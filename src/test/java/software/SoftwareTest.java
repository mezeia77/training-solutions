package software;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoftwareTest {

    @Test
    void createTest(){
        Software software = new Software("AutoCAD", 100000);
        assertEquals("AutoCAD", software.getName());
        assertEquals(100000, software.getPrice());
    }

}