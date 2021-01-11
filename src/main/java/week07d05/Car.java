package week07d05;

public class Car extends Vehicle{

    private int numberOfGears;

    public Car(int getNumberOfGears, TransmissionType transmissionType, int numberOfGears) {
        super(getNumberOfGears, transmissionType);
        this.numberOfGears = numberOfGears;
    }

    @Override
    public TransmissionType getTransmissionType() {
        return TransmissionType.AUTOMATIC;
    }
}
