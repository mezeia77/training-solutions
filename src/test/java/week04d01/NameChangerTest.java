package week04d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameChangerTest {

    @Test
    void getFullName() {
        NameChanger nameChanger = new NameChanger("John Doe");
        assertEquals("John Doe", nameChanger.getFullName());
    }

    @Test
    void changeFirstName() {
        NameChanger nameChanger = new NameChanger("John Doe");
        assertEquals("Jack Doe", nameChanger.changeFirstName("Jack"));
    }

    @Test
    void emptyName() {
        assertThrows(IllegalArgumentException.class, ()-> new NameChanger("  "));
    }
}