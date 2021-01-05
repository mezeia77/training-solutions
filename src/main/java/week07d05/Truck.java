package week07d05;

public class Truck extends Vehicle{

    public Truck(int getNumberOfGears, TransmissionType transmissionType) {
        super(getNumberOfGears, transmissionType);
    }

    @Override
    public TransmissionType getTransmissionType() {
        return TransmissionType.MANUAL;
    }
}
