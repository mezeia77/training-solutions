package controlselection.month;

import controlselection.month.DayInMonth;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayInMonthTest {

    DayInMonth a = new DayInMonth();

    @Test
    void isLeapYearTest(){
        assertTrue(a.isLeapYear(2020));
        assertTrue(a.isLeapYear(2400));
        assertTrue(a.isLeapYear(1976));
        assertTrue(a.isLeapYear(400));
        assertFalse(a.isLeapYear(2022));
        assertFalse(a.isLeapYear(100));
    }

    @Test
    void numberOfDaysTest(){
        assertEquals(31, a.numberOfDays(1, "Január"));
        assertEquals(31, a.numberOfDays(2000, "január"));
        assertEquals(30, a.numberOfDays(2000, "április"));
        assertEquals(31, a.numberOfDays(1, "mÁrCiUs"));
        assertEquals(28, a.numberOfDays(1, "fEbRuÁr"));
        assertEquals(29, a.numberOfDays(2020, "fEbRuÁr"));
    }
}
