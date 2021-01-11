package virtualmethod;

public class Vehicle {

    private int vehicleWeight;
    private static final int PERSON_AVARAGE_WEIGHT=75;

    public Vehicle(int vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    public int getVehicleWeight() {
        return vehicleWeight;
    }

    public int getGrossLoad(){
        return vehicleWeight + PERSON_AVARAGE_WEIGHT;
    }

    public static int getPersonAvarageWeight() {
        return PERSON_AVARAGE_WEIGHT;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleWeight=" + vehicleWeight +
                '}';
    }
}
