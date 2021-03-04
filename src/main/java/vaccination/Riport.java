package vaccination;

public class Riport {

    private String ZIP;
    private int zero;
    private int one;
    private int two;

    public Riport(String ZIP, int zero, int one, int two) {
        this.ZIP = ZIP;
        this.zero = zero;
        this.one = one;
        this.two = two;
    }

    public String getZIP() {
        return ZIP;
    }

    public int getZero() {
        return zero;
    }

    public int getOne() {
        return one;
    }

    public int getTwo() {
        return two;
    }

    @Override
    public String toString() {
        return "ZIP='" + ZIP + '\'' +
                ", beoltatlan=" + zero +
                ", egyszer beoltott=" + one +
                ", kétszer beoltott=" + two;
    }
}
