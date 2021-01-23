package exceptionclass.trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    void testCreate(){
        Trainer trainer = new Trainer("John Doe", 30);
        assertEquals(30, trainer.getAge());
        assertEquals("John Doe", trainer.getName());
    }

    @Test
    void invalidAgeTest() {
        InvalidAgeException iae = new InvalidAgeException("", 15, 18);
        assertEquals(15, iae.getParameterAge());
        assertEquals(18, iae.getMinAge());

        assertThrows(InvalidAgeException.class, ()->new Trainer("Jane Doe", 15));
    }


}