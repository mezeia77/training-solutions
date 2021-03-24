package exam04retake01.people;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeopleTest {
    @Test
    void getNumberOfMales() {
        People people = new People();
        int males = people.getNumberOfMales("src/main/resources/exam04retake01/people.csv");
        assertEquals(545, males);
    }
}
