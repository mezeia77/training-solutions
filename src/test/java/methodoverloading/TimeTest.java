package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {

    @Test
    public void testCreateTimeWith3Parameters() {
        //Given
        Time time = new Time(13, 14, 15);
        //Then
        assertEquals(time.getHours(), 13);
        assertEquals(time.getMinutes(), 14);
        assertEquals(time.getSeconds(), 15);
    }

    @Test
    public void testCreateTimeWith2Parameters() {
        //Given
        Time time = new Time(13, 14);
        //Then
        assertEquals(time.getHours(), 13);
        assertEquals(time.getMinutes(), 14);
        assertEquals(time.getSeconds(), 0);
    }

    @Test
    public void testCreateTimeWith1Parameter() {
        //Given
        Time time = new Time(13);
        //Then
        assertEquals(time.getHours(), 13);
        assertEquals(time.getMinutes(), 0);
        assertEquals(time.getSeconds(), 0);

    }

    @Test
    public void testCreateTimeWithTimeParameter() {
        //Given
        Time anotherTime = new Time(13, 14, 15);
        //When
        Time time = new Time(anotherTime);

        assertEquals(time.getHours(), 13);
        assertEquals(time.getMinutes(), 14);
        assertEquals(time.getSeconds(), 15);
    }

    @Test
    public void testIsEqualWith3Parameters() {
        //Given
        Time time = new Time(13, 14, 15);
        //Then
        assertEquals(time.isEqual(13, 14, 15), true);
        assertEquals(time.isEqual(15, 10, 10), false);
    }

    @Test
    public void testIsEqualWithTimeParameter() {
        //Given
        Time time = new Time(13, 14, 15);
        Time anotherTime = new Time(13, 14, 15);
        Time laterTime = new Time(14, 14, 15);
        //Then
        assertEquals(time.isEqual(anotherTime), true);
        assertEquals(time.isEqual(laterTime), false);
    }

    @Test
    public void testIsEarlierWith3Parameters() {
        //Given
        Time time = new Time(13, 14, 15);
        //Then
        assertEquals(time.isEarlier(15, 10, 10),true);
        assertEquals(time.isEarlier(10, 10, 10), false);
    }

    @Test
    public void testIsEarlierWithTimeParameter() {
        //Given
        Time time = new Time(13, 14, 15);
        Time laterTime = new Time(15, 14, 15);
        Time earlierTime = new Time(10, 14, 15);
        //Then
        assertEquals(time.isEarlier(laterTime), true);
        assertEquals(time.isEarlier(earlierTime), false);
    }

}
