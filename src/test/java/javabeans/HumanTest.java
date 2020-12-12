package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanTest {
    @Test
    public void getSetName() {
        final String name = "Kovács Anna";
        Human human = new Human();
        human.setName(name);

        assertEquals(human.getName(), name);
    }

    @Test
    public void getSetWeight() {
        final double weight = 62.3;
        Human human = new Human();
        human.setWeight(weight);

        assertEquals(human.getWeight(), weight);
    }

    @Test
    public void getSetIQ() {
        final int iq = 123;
        Human human = new Human();
        human.setIq(iq);

        assertEquals(human.getIq(), iq);
    }

}
