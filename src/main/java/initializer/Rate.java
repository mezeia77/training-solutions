package initializer;

import java.util.Currency;

public class Rate {

    private Currency currency;
    private double conversionfactor;

    public Rate(Currency currency, double conversionfactor) {
        this.currency = currency;
        this.conversionfactor = conversionfactor;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getConversionfactor() {
        return conversionfactor;
    }
}
