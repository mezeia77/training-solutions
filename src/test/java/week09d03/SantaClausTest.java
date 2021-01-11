package week09d03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SantaClausTest {

    private List<Person> persons;
    private SantaClaus santaClaus;

    @BeforeEach
    void setUp() {
        persons = List.of(
                new Person("John Doe", 16),
                new Person("Jack Doe", 12),
                new Person("Jane Doe", 10));
        santaClaus = new SantaClaus(persons);
    }

    @Test
    void getPersons() {
        assertEquals(3, santaClaus.getPersons().size());
    }
}