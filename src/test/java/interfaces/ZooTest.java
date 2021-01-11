package interfaces;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZooTest {
    @Test
    public void getNumberOfLegsWithEmptyList() {
        List<Animal> animals = new ArrayList<>();
        Zoo zoo = new Zoo(animals);

        assertEquals(zoo.getNumberOfLegs(), 0);
    }

    @Test
    public void getNumberOfLegsWithAList() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Duck());
        animals.add(new Worm());
        animals.add(new Duck());
        animals.add(new Lion());
        Zoo zoo = new Zoo(animals);

        assertEquals(zoo.getNumberOfLegs(), 8);
    }

    @Test
    public void getNumberOfAnimals() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Duck());
        animals.add(new Worm());
        animals.add(new Duck());
        animals.add(new Lion());
        Zoo zoo = new Zoo(animals);

        assertEquals(zoo.getNumberOfAnimals(), 4);
    }
}
