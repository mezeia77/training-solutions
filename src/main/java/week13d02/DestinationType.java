package week13d02;

public enum DestinationType {
    ARRIVAL(1), DEPARTURE(2);

    private int destinationValue;

    DestinationType(int destinationValue) {
        this.destinationValue = destinationValue;
    }

    public int getDestinationValue() {
        return destinationValue;
    }
}
