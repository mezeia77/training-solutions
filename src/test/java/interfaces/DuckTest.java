package interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuckTest {

    @Test
    public void getNumberofLegs() throws Exception {
        Duck duck = new Duck();

        assertEquals(duck.getNumberOfLegs(), 2);
    }

    @Test
    public void getName() throws Exception {
        Duck duck = new Duck();

        assertEquals(duck.getName(), "Duck");
    }
}
