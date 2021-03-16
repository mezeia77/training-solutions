package software;

public class Software {

    private String name;
    private int price;

    public Software(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double increasePrice(){
        System.out.println(getClass().getName());
        if(getClass().getName().equals("software.OfficeSoftware")){
            return getPrice()*1.05;
        } else {
            return getPrice()*1.1;
        }
    }

}
