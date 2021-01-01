package objectclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleBagTest {

    @Test
    public void testConstructor() {
        //Given
        SimpleBag bag = new SimpleBag();
        //Then
        assertTrue(bag.isEmpty());
        assertEquals(bag.size(), 0);
    }


    @Test
    public void testPut() {
        //Given
        SimpleBag bag = new SimpleBag();
        //When
        bag.putItem("alma");
        bag.putItem((new Book("Rejtő Jenő", "Az ellopott cirkáló")));
        bag.putItem(new Beer("Borsodi", 239));
        //Then
        assertEquals(bag.isEmpty(),false);
        assertEquals(bag.size(), 3);

    }

//    @Test
//    public void testIteration() {
//        //Given
//        SimpleBag bag = new SimpleBag();
//        //When
//        bag.putItem(new Beer("Heineken", 250));
//        bag.putItem(new Book("Rejtő Jenő", "Az ellopott cirkáló"));
//        bag.putItem(new Beer("Borsodi", 239));
//        //Then
////        while (bag.hasNext()) {
////            assertEquals(bag.next().getClass().toString(), "class objectclass.B");
////        }
//        assertEquals(bag.getCursor(), 2);
//    }

    @Test
    public void testContains() {
        //Given
        SimpleBag bag = new SimpleBag();
        //When
        bag.putItem(new Beer("Borsodi", 239));
        bag.putItem(new Book("Rejtő Jenő", "Az ellopott cirkáló"));
        //Then
        //assertTrue(bag.isContains(new Beer("Borsodi", 239)));
        //assertTrue(bag.isContains(new Book("Rejtő Jenő", "Az ellopott cirkáló")));
        assertFalse(bag.isContains(new Book("Rejtő Jenő", "A megkerült cirkáló")));
    }
}
