package week11d02;

public class Ride {

    private int day;
    private int number;
    private int distance;

    public Ride(int day, int number, int distance) {
        this.day = day;
        this.number = number;
        this.distance = distance;
    }

    public int getDay() {
        return day;
    }

    public int getNumber() {
        return number;
    }

    public int getDistance() {
        return distance;
    }
}
