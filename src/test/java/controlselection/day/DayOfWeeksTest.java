package controlselection.day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfWeeksTest {
    DayOfWeeks dayOfWeeks = new DayOfWeeks();

    @Test

    void dayOfWeeksTest(){
        assertEquals("hét eleje", dayOfWeeks.dayOfWeek("HéTfŐ"));
        assertEquals("hét közepe", dayOfWeeks.dayOfWeek("KEDD"));
        assertEquals("hét közepe", dayOfWeeks.dayOfWeek("csÜtörtÖk"));
        assertEquals("majdnem hétvége", dayOfWeeks.dayOfWeek("pénteK"));
        assertEquals("hétvége", dayOfWeeks.dayOfWeek("szomBAT"));
        assertEquals("hétvége", dayOfWeeks.dayOfWeek("Vasárnap"));
    }

}
