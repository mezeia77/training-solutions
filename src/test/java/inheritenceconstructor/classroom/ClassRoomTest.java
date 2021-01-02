package inheritenceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClassRoomTest {
    @Test
    public void isSuitableSuccess() {
        //Given
        ClassRoom classroom = new ClassRoom("122", 20, Facility.COMPUTERS);
        Course course = new Course(15, Facility.COMPUTERS);
        //Then
        assertTrue(classroom.isSuitable(course));

    }

    @Test
    public void isSuitableFail() {
        //Given
        ClassRoom classroom = new ClassRoom("122", 20, Facility.COMPUTERS);
        Course course = new Course(15, Facility.WHITEBOARD);
        //Then
        assertFalse(classroom.isSuitable(course));
    }
}
