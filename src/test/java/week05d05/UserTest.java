package week05d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void EmailTest(){

        assertTrue(new User().isValidEmail("nev@valami.orszag"),"true");
        assertFalse(new User().isValidEmail("nevvalami.orszag"), "false");
        assertFalse(new User().isValidEmail("nev@valamiorszag"), "false");
    }

    @Test
    void NameTest(){
        assertEquals(new User().fullName("John", "Doe"), "John Doe");
    }


}
