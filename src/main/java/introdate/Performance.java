package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Performance {

    String artist;
    LocalDate date;
    LocalTime startTime;
    LocalTime endTime;

    public Performance(String artist, LocalDate date, LocalTime startTime, LocalTime endTime) {
        this.artist = artist;
        this.date = date;
        this.endTime = endTime;
        this.startTime = startTime;
    }

    public String getArtist() {
        return artist;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
}

