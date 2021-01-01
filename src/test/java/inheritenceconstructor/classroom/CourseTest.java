package inheritenceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseTest {
    @Test
    public void constructorTest() {
        //Given
        Course course = new Course(20, Facility.COMPUTERS);
        //Then
        assertEquals(course.getParticipants(), 20);
        assertEquals(course.getFacilityNeeded(), Facility.COMPUTERS);
    }
}
