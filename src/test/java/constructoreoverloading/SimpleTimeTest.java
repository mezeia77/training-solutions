package constructoreoverloading;

import constructoroverloading.SimpleTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTimeTest {

    @Test
    public void constructorTest2Parameters() {
        //Given
        SimpleTime time = new SimpleTime(15, 16);
        //Then
        assertEquals(time.getHours(), 15);
        assertEquals(time.getMinutes(), 16);
    }

    @Test
    public void constructorTest1Parameter() {
        //Given
        SimpleTime time = new SimpleTime(15);
        //Then
        assertEquals(time.getHours(), 15);
        assertEquals(time.getMinutes(), 0);
    }

    @Test
    public void constructorTestSimpleTimeParameter() {
        //Given
        SimpleTime time = new SimpleTime(new SimpleTime(15, 16));
        //Then
        assertEquals(time.getHours(), 15);
        assertEquals(time.getMinutes(), 16);
    }

    @Test
    public void differenceAfter() {
        //Given
        SimpleTime time = new SimpleTime(new SimpleTime(15, 16));
        SimpleTime anotherTime = new SimpleTime(new SimpleTime(14, 10));
        //Then
        assertEquals(time.difference(anotherTime), 66);
    }

    @Test
    public void differenceIfEqual() {
        //Given
        SimpleTime time = new SimpleTime(new SimpleTime(15, 16));
        SimpleTime anotherTime = new SimpleTime(new SimpleTime(15, 16));
        //Then
        assertEquals(time.difference(anotherTime), 0);
    }

    @Test
    public void differenceEarlier() {
        //Given
        SimpleTime time = new SimpleTime(new SimpleTime(15, 16));
        SimpleTime anotherTime = new SimpleTime(new SimpleTime(17, 26));
        //Then
        assertEquals(time.difference(anotherTime), -130);
    }

    @Test
    public void toStringTest() {
        //Given
        SimpleTime time = new SimpleTime(new SimpleTime(15, 16));
        //Then
        assertEquals(time.toString(),"15:16");
    }
}
