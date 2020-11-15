package finalmodifier;

public class TaxCalculator {

    public final static float VAT = 27;

    public float vatAmount (int net){
        return net * (VAT/100);
    }

    public float total (int net){
        return net+net*(VAT/100);
    }

    public static void main(String[] args) {

        TaxCalculator taxCalculator = new TaxCalculator();

        System.out.println("ÁFA mértéke: " + TaxCalculator.VAT);
        System.out.println("ÁFA tartalom: " + taxCalculator.vatAmount(100));
        System.out.println("Bruttó összegf: " + taxCalculator.total(100));

    }
}
