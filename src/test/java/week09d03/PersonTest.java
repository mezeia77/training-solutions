package week09d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testOverFourteen(){
        Person p = new Person("A", 16);
        p.setPresent();

        assertNotEquals(null,p.getPresent());
        assertNotEquals(Present.TOY, p.getPresent());
    }

    @Test
    void testUnderFourteen(){
        Person p = new Person("B", 12);
        p.setPresent();

        assertNotEquals(null, p.getPresent());
    }
}