package introconstructor;

import java.util.Arrays;
import java.util.List;

public class Restaurant {

    List<String> menu;
    String name;
    int capacity;
    public static final int SEATS = 4;

    public Restaurant(String name, int capacity) {
        this.name = name;
        this.capacity = capacity*SEATS;
    }

    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private List<String> nMenu() {
        return Arrays.asList("pizza", "meat soup");
    }
}
