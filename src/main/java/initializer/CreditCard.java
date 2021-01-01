package initializer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    private static final List<Rate> ACTUAL_RATES = new ArrayList<>();
    private long balance;

//    public CreditCard(long balance, Currency currency, List<Rate> upload) {
//        this.balance = Math.round(balance * getConverionRate(currency));
//        ACTUAL_RATES.addAll(upload);
//    }
//
//    public CreditCard(long balance) {
//        this.balance = balance;
//    }
//
//    public long getBalance() {
//        return balance;
//    }
//
//    public boolean payment(long amount, Currency currency){
//        long value = Math.round(amount*getConverionRate(currency));
//        if(value<=balance){
//            balance = balance-value;
//            return true;
//        }
//        return false;
//    }
//
//    public boolean payment (long amount){
//        return payment(amount, Currency.HUF);
//    }
//
////    private double getConverionRate(Currency currency){
////        for (Rate rate : ACTUAL_RATES){
////            if(rate.getCurrency() == currency){
////                return rate.getConversionfactor();
////            }
////        } return 1;
////    }
}
