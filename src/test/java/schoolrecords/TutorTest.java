package schoolrecords;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;


public class TutorTest {

    @Test
    public void testTutorTeachingSubject() {
        Tutor tutor = new Tutor("Nagy Csilla", Arrays.asList(new Subject("matematika"), new Subject("fizika")));
        assertEquals("Nagy Csilla", tutor.getName());
        assertTrue(tutor.tutorTeachingSubject(new Subject("fizika")));
    }

    @Test
    public void testTutorDoesNotTeachingSubject() {
        Tutor tutor = new Tutor("Nagy Csilla", Arrays.asList(new Subject("matematika"), new Subject("fizika")));

        assertFalse(tutor.tutorTeachingSubject(new Subject("biológia")));
    }
}