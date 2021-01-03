package virtualmethod;

public class Van extends Car{

    private int cargoWeight;

    public Van(int vehicleWeight, int numberOfPassanger, int cargoWeight) {
        super(vehicleWeight, numberOfPassanger);
        this.cargoWeight = cargoWeight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + cargoWeight;
    }

    @Override
    public String toString() {
        return "Van{" +
                "cargoWeight=" + cargoWeight +
                ", numberOfPassenger=" + getNumberOfPassanger() +
                ", vehicleWeight=" + getVehicleWeight() +
                '}';
    }
}
