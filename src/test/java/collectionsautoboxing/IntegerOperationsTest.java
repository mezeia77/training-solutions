package collectionsautoboxing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegerOperationsTest {
    @Test
    public void checkElementTypeInList() {
        List<Integer> numbers = new IntegerOperations().createList(2, 4, 6);

        assertEquals(3, numbers.size());
        assertEquals(2, numbers.get(0));
        assertEquals(4, numbers.get(1));
        assertEquals(6, numbers.get(2));
        System.out.println(numbers.toString());
    }

    @Test
    public void checkSumValueInList() {
        IntegerOperations abox = new IntegerOperations();
        assertEquals(12, abox.sumIntegerList(abox.createList(2, 4, 6)));
        System.out.println(abox.toString());
    }

    @Test
    public void sumIntegerObjects() {
        IntegerOperations x = new IntegerOperations();
        assertEquals(12, new IntegerOperations().sumIntegerObjects(2, 4, 6));
        System.out.println(x.toString());
    }
}