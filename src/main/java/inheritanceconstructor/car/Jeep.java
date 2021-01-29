package inheritanceconstructor.car;

public class Jeep extends Car{

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        if (extraFuel > extraCapacity){
            throw new IllegalArgumentException("Too much fuel" + extraCapacity);
        }
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    private boolean isEnoughFuelJeep(int distance) {
        return ((super.getFuel() + extraFuel) - distance * super.getFuelRate() / 100) >= 0.0;
    }

    public void drive(int km) {
        if (!isEnoughFuelJeep(km)) {
            throw new RuntimeException("Not enough fuel available!");
        }
        double usedFuel = km * getFuelRate() / 100;
        extraFuel -= usedFuel;
        if (extraFuel < 0) {
            modifyFuelAmount(extraFuel);
            extraFuel = 0;
        }
    }

    public double calculateRefillAmount() {
        return getTankCapacity() + extraCapacity - getFuel() - extraFuel;
    }
}
