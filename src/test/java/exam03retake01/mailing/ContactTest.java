package exam03retake01.mailing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    @Test
    void create() {
        Contact contact = new Contact("John Doe", "johndoe@example.com");
        assertEquals("John Doe", contact.getName());
        assertEquals("johndoe@example.com", contact.getEmail());
    }
}