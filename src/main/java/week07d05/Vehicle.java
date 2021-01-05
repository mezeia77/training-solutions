package week07d05;

public class Vehicle {

    private int getNumberOfGears;
    TransmissionType transmissionType;


    public Vehicle(int getNumberOfGears, TransmissionType transmissionType) {
        this.getNumberOfGears = getNumberOfGears;
        this.transmissionType = transmissionType;
    }

    public int getGetNumberOfGears() {
        return 5;
    }

    public TransmissionType getTransmissionType() {
        return TransmissionType.MANUAL;
    }
}
