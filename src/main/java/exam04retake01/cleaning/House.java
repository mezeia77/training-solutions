package exam04retake01.cleaning;

public class House implements Cleanable{

    private String address;
    private int size;

    public House(String address, int size) {
        this.address = address;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public int clean() {
        return 80*size;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
