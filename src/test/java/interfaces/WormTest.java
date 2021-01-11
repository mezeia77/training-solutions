package interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WormTest {
    @Test
    public void getNumberofLegs() {
        Worm worm = new Worm();

        assertEquals(worm.getNumberOfLegs(), 0);
    }

    @Test
    public void getName() {
        Worm worm = new Worm();

        assertEquals(worm.getName(), "Worm");
    }
}
