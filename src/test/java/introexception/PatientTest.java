package introexception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientTest {


    @Test
    void Patient() {
        Patient patient = new Patient("John Doe", "123456788", 1901);
        assertEquals(patient.getName(), ("John Doe"));
        assertEquals(patient.getSocialSecurityNumber(), ("123456788"));
        assertEquals(patient.getYearOfBirth(), (1901));
    }
}
