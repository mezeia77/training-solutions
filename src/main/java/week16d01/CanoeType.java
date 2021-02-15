package week16d01;

public enum CanoeType {
    RED(1), GREEN(1.2), BLUE(1.5);

    private double multiplication;

    CanoeType(double multiplication) {
        this.multiplication = multiplication;
    }

    public double getMultiplication() {
        return multiplication*5000;
    }
}
