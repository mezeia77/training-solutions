package lambdaintro;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class FamilyBirthdaysTest {

    FamilyBirthdays familyBirthdays = new FamilyBirthdays(
            LocalDate.of(2000, 5, 5),
            LocalDate.of(2010, 10, 20),
            LocalDate.of(1980, 6,15)
    );

    @Test
    void testIsFamilyBirthday() {

        assertEquals(false, LocalDate.of(2017, 5, 4).query(familyBirthdays::isFamilyBirthday));
        assertEquals(true, LocalDate.of(2017, 5, 5).query(familyBirthdays::isFamilyBirthday));
        assertEquals(true, LocalDate.of(2017, 6, 15).query(familyBirthdays::isFamilyBirthday));

        assertFalse(familyBirthdays.isFamilyBirthday(LocalDate.of(2017, 5, 4)));
        assertTrue(familyBirthdays.isFamilyBirthday(LocalDate.of(2017, 5, 5)));
        assertTrue(familyBirthdays.isFamilyBirthday(LocalDate.of(2017, 6, 15)));
    }

    @Test
    void testNextFamilyBirthDay() {

        assertEquals(1, LocalDate.of(2017, 5, 4).query(familyBirthdays::nextFamilyBirthday));
        assertEquals(5, LocalDate.of(2017, 6, 10).query(familyBirthdays::nextFamilyBirthday));
        assertEquals(0, LocalDate.of(2017, 10, 20).query(familyBirthdays::nextFamilyBirthday));
        assertEquals(176, LocalDate.of(2017, 11, 10).query(familyBirthdays::nextFamilyBirthday));
    }

}