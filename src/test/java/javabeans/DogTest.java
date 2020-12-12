package javabeans;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest {
    @Test
    public void getSetName() {
        final String name = "Bodri";
        Dog dog = new Dog();
        dog.setName(name);

        assertEquals(dog.getName(), name);
    }

    @Test
    public void isSetPedigree() {
        Dog dog = new Dog();
        dog.setPedigree(true);

        assertEquals(dog.isPedigree(), true);
    }

    @Test
    public void getSetAge() {
        final int age = 3;
        Dog dog = new Dog();
        dog.setAge(age);

        assertEquals(dog.getAge(), age);
    }

    @Test
    public void getSetWeight() {
        final double weight = 6.5;
        Dog dog = new Dog();
        dog.setWeight(weight);

        assertEquals(dog.getWeight(), weight);
    }
}
