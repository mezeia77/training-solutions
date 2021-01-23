package exceptionclass.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Account> accounts = new ArrayList<>();

    public Bank(List<Account> accounts) {
        if(accounts.isEmpty() || accounts==null){
            throw new IllegalArgumentException("No accounts");
        }
        this.accounts = accounts;
    }

    public Account getAccount(String accountNumber){
        if(accountNumber.isEmpty() || accountNumber==null){
            throw new InvalidBankOperationException(ErrorCode.INVALID_ACCOUNT_NUMBER);
        }
        for (Account account:accounts){
            if(accountNumber.equals(account.getAccountNumber())){
                return account;
            }
        }
        throw new InvalidBankOperationException(ErrorCode.INVALID_ACCOUNT_NUMBER);
    }

    public void payment(String accountNumber, double amount){
        Account actual = getAccount(accountNumber);
        actual.subtract(amount);
    }

    public void deposit(String accountNumber, double amount){
        Account actual = getAccount(accountNumber);
        actual.deposit(amount);
    }


}
