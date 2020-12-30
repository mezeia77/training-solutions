package methodstructure.pendrives;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }

    public void risePrice(int percent){
        price += getPrice() * (percent / 100.0);
    }

    public int comparePricePerCapacity(Pendrive other){
        double pricePerCapacity = price/capacity;
        double otherPricePerCapacity = other.price/capacity;
        if (pricePerCapacity>otherPricePerCapacity){
            return 1;
        }if (pricePerCapacity<otherPricePerCapacity){
            return -1;
        }
        return 0;
    }

    public boolean cheaperThan(Pendrive other){
        return price< other.price;
    }

}
