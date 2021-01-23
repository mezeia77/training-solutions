package exceptionmulticatch.trainer;

public class Trainer {

    private String name;
    private int year;

    public Trainer(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
