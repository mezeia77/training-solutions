package algorithmsmax.sales;

public class SalesPerson {

    private String name;
    private int amount;
    private int target;

    public SalesPerson(String name, int amount, int target) {
        this.name = name;
        this.amount = amount;
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getTarget() {
        return target;
    }

    public int getDifferentFromTarget(){
        return amount - target;
    }
}
