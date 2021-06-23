package lambdacomparator;

public class CloudStorage implements Comparable<CloudStorage>{

    private String provider;
    private int space;
    private double price;
    private PayPeriod period;

    private static final int STANDARD_SIZE = 1000;
    private static final int STANDARD_PERIOD = 12;

    public CloudStorage(String provider, int space, PayPeriod period, double price) {
        this.provider = provider;
        this.space = space;
        this.price = price;
        this.period = period;
    }

    public CloudStorage(String provider, int space) {
        this.provider = provider;
        this.space = space;
    }

    public String getProvider() {
        return provider;
    }

    public int getSpace() {
        return space;
    }

    public double getPrice() {
        return price;
    }

    public PayPeriod getPeriod() {
        return period;
    }

    @Override
    public int compareTo(CloudStorage o) {
        double currentValue = this.period != null ? this.price * STANDARD_PERIOD / this.period.getLength() / this.space * STANDARD_SIZE : 0;
        double otherValue = o.period != null ? o.price * STANDARD_PERIOD / o.period.getLength() / o.space * STANDARD_SIZE : 0;
        return Double.compare(currentValue, otherValue);
    }

    @Override
    public String toString() {
        return "CloudStorage{" +
                "provider='" + provider + '\'' +
                ", space=" + space +
                ", price=" + price +
                ", period=" + period +
                '}';
    }
}
