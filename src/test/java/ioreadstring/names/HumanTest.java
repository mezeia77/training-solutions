package ioreadstring.names;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void getNameTest() {
        Human human = new Human("John", "Doe");
        assertEquals("John", human.getFamilyName());
        assertEquals("Doe", human.getGivenName());
    }


}