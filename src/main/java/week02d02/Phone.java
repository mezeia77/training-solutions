package week02d02;

public class Phone {

    private String type;
    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public static void main(String[] args) {
        Phone phone = new Phone("Nokia", 128);
        System.out.println("Type: " + phone.type + '\n' + "Memory: " + phone.mem);
    }
}
