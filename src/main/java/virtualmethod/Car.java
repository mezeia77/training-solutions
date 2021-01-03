package virtualmethod;

public class Car extends Vehicle{

    private int numberOfPassanger;

    public Car(int vehicleWeight, int numberOfPassanger) {
        super(vehicleWeight);
        this.numberOfPassanger = numberOfPassanger;
    }

    public int getNumberOfPassanger() {
        return numberOfPassanger;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + numberOfPassanger*getPersonAvarageWeight();
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfPassenger=" + numberOfPassanger + ", " +
                "vehicleWeight=" + getVehicleWeight() +
                '}';
    }
}
