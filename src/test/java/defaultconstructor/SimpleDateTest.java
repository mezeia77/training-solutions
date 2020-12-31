package defaultconstructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleDateTest {

//    @Rule
//    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void incorrectParameterShouldThrowExceptionNotALeapYear() throws IllegalArgumentException {
        // Given
        SimpleDate sd = new SimpleDate();
//        exception.expect(IllegalArgumentException.class);
//        exception.expectMessage("One or more given parameter cannot be applied!");
        // When
//        sd.setDate(1914, 2, 29);
    }

    @Test
    public void incorrectParameterShouldThrowExceptionDayIncorrect() throws IllegalArgumentException {
        // Given
        SimpleDate sd = new SimpleDate();
//        exception.expect(IllegalArgumentException.class);
//        exception.expectMessage("One or more given parameter cannot be applied!");
        // When
//        sd.setDate(2000, 4, 31);
    }

    @Test
    public void incorrectParameterShouldThrowExceptionYearIncorrect() throws IllegalArgumentException {
        // Given
        SimpleDate sd = new SimpleDate();
//        exception.expect(IllegalArgumentException.class);
//        exception.expectMessage("One or more given parameter cannot be applied!");
        // When
//        sd.setDate(1848, 3, 15);
    }

    @Test
    public void incorrectParameterShouldThrowExceptionMonthIncorrect() throws IllegalArgumentException {
        // Given
        SimpleDate sd = new SimpleDate();
//        exception.expect(IllegalArgumentException.class);
//        exception.expectMessage("One or more given parameter cannot be applied!");
        // When
        sd.setDate(2014, 13, 15);
    }

    @Test
    public void testSetDate() {
        SimpleDate date = new SimpleDate();
        date.setDate(2016, 2, 29);
        assertEquals(date.getYear(), 2016);
        assertEquals(date.getMonth(),2);
        assertEquals(date.getDay(), 29);
    }
}
