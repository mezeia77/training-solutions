package abstractclass;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class ArcherTest {

    @Test
    public void creation()  {
        Random random = new Random(123);
        Character character = new Archer(new Point(5, 10), random);

        assertEquals(character.getHitPoint(), 100);
        assertTrue(character.isAlive());
        assertEquals(character.getPosition().getX(), 5L);
        assertEquals(character.getPosition().getY(), 10L);
    }

    @Test
    public void kill()  {
        Random random = new Random(123);
        Archer offender = new Archer(new Point(0,0), random);
        Character defender = new Archer(new Point(12,0), random);

        while (defender.getHitPoint() > 0) {
            offender.secondaryAttack(defender);
        }

        assertEquals(defender.getHitPoint(), -1);
        assertFalse(defender.isAlive());
    }

    @Test
    public void secondaryAttack() throws Exception {
        Random random = new Random(123);
        Archer offender = new Archer(new Point(0,0), random);
        Character defender = new Archer(new Point(12,0), random);

        offender.secondaryAttack(defender);

        assertEquals(offender.getHitPoint(),100);
        assertEquals(defender.getHitPoint(), 97);
        assertEquals(offender.getNumberOfArrow(), 99);
    }
}
