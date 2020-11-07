package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PerformanceTest {

    public static void main(String[] args) {

        Performance performance = new Performance("Fleetwood Mac", LocalDate.of(1986, 02,05), LocalTime.of(19, 21), LocalTime.of(22, 45));

        System.out.println(performance.artist + ": " + performance.date + " " + performance.startTime + " - " + performance.endTime);


    }
}
