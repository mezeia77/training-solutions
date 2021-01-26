package week13d02;

import java.time.LocalTime;

public class Flights {
    String id;
    DestinationType destinationType;
    String city;
    LocalTime time;

    public Flights(String id, DestinationType destinationType, String city, LocalTime time) {
        this.id = id;
        this.destinationType = destinationType;
        this.city = city;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public DestinationType getDestinationType() {
        return destinationType;
    }

    public String getCity() {
        return city;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "id='" + id + '\'' +
                ", destinationType=" + destinationType +
                ", city='" + city + '\'' +
                ", time=" + time +
                '}';
    }
}
