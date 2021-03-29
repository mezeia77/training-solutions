package exam04retake01.cleaning;

public class Office implements Cleanable{

    private String address;
    private int size;
    private int levels;

    public Office(String address, int size, int levels) {
        this.address = address;
        this.size = size;
        this.levels = levels;
    }

    public int getSize() {
        return size;
    }

    public int getLevels() {
        return levels;
    }

    @Override
    public int clean() {
        return 100*size*levels;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
