package exceptionclass.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTimeTest {

    @Test
    void constructorTest() {
        SimpleTime st = new SimpleTime(10, 25);
        assertEquals(10, st.getHour());
        assertEquals(25, st.getMinute());

        SimpleTime st2 = new SimpleTime("10:25");
        assertEquals(10, st2.getHour());
        assertEquals(25, st2.getMinute());
    }

    @Test
    void invalidTimeTest(){
        assertThrows(InvalidTimeException.class, ()->new SimpleTime(""));
        assertThrows(InvalidTimeException.class, ()->new SimpleTime("1230"));
        assertThrows(InvalidTimeException.class, ()->new SimpleTime("a:b"));
        assertThrows(InvalidTimeException.class, ()->new SimpleTime("123:50"));
        assertThrows(IllegalStateException.class, ()->new SimpleTime(24, 12));
        assertThrows(IllegalStateException.class, ()->new SimpleTime(23, 60));
        assertThrows(IllegalStateException.class, ()->new SimpleTime(25, 60));
    }
}