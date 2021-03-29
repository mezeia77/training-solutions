package exam04retake01.cleaning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseTest {
    @Test
    void create() {
        House house = new House("Budapest, Fo ut. 1.", 100);
        assertEquals("Budapest, Fo ut. 1.", house.getAddress());
    }

    @Test
    void clean() {
        House house = new House("Budapest, Fo ut. 1.", 100);
        assertEquals(8_000, house.clean());
    }
}
