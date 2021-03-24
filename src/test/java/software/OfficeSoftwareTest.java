package software;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficeSoftwareTest {

    @Test
    void createTest(){
        OfficeSoftware officeSoftware = new OfficeSoftware("Word", 15000);
        assertEquals("Word", officeSoftware.getName());
        assertEquals(15000*1.05, officeSoftware.increasePrice());
    }

}