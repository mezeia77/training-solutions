package exceptionclass.bank;

import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        if(accounts==null || accounts.isEmpty()){
            throw new IllegalArgumentException("No accounts");
        }
        this.accounts = accounts;
    }

    public Account getAccount(String accountNumber){
        if(accountNumber==null || accountNumber.isEmpty()){
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
