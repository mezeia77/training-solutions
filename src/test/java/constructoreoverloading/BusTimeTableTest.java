package constructoreoverloading;

import constructoroverloading.BusTimeTable;
import constructoroverloading.SimpleTime;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusTimeTableTest {

    private static final List<SimpleTime> TIME_TABLE = Arrays.asList(
            new SimpleTime(9, 15),
            new SimpleTime(12, 45),
            new SimpleTime(14, 15),
            new SimpleTime(16, 15),
            new SimpleTime(18, 15)
    );

//    @Rule
//    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void constructorTestList() {
        //Given
        BusTimeTable timetable = new BusTimeTable(TIME_TABLE);
        // When
        assertEquals(timetable.getTimeTable().size(), 5);
        assertEquals(timetable.getTimeTable().get(0).getHours(), 9);
        assertEquals(timetable.getTimeTable().get(4).getMinutes(), 15);
    }

    @Test
    public void constructorTestHours() {
        //Given
        BusTimeTable timetable = new BusTimeTable(14, 16, 30);
        // When
        assertEquals(timetable.getTimeTable().size(), 3);
        assertEquals(timetable.getTimeTable().get(0).getHours(),14);
        assertEquals(timetable.getTimeTable().get(0).getMinutes(), 30);
        assertEquals(timetable.getTimeTable().get(2).getHours(), 16);
    }

    @Test
    public void testNextBus() {
        //Given
        BusTimeTable timetable = new BusTimeTable(TIME_TABLE);
        // When
        assertEquals(timetable.nextBus(new SimpleTime(13, 15)).toString(), "14:15");
    }

//    @Test
//    public void nextBusShouldThrowExceptionIfNone() throws IllegalStateException {
//        // Given
//        BusTimeTable timetable = new BusTimeTable(TIME_TABLE);
//        exception.expect(IllegalStateException.class);
//        exception.expectMessage("No more buses today!");
//        //When
//        timetable.nextBus(new SimpleTime(18, 16));
//    }

}
