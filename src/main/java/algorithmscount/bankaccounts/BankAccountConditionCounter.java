package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {

    public int numberOfAccountsOverTheLimit(List<BankAccount> bankAccounts, int limit){
        int result = 0;
        for (BankAccount bankAccount:bankAccounts){
            if (bankAccount.getBalance()>limit){
                result ++;
            }
        } return result;
    }
}
