package exceptionclass.bank;

public class Account {
    private String accountNumber;
    private double balance;
    private static final double originalMaxSubtract = 100_000;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if(accountNumber.isEmpty() || accountNumber==null){
            throw new IllegalArgumentException("Invalid account number");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = originalMaxSubtract;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double newMaxSubtract){
        if(newMaxSubtract<1){
            throw new InvalidBankOperationException(ErrorCode.INVALID_AMOUNT);
        }
        maxSubtract = newMaxSubtract;
    }

    public double subtract(double value){
        if(value>maxSubtract || value<=0){
            throw new InvalidBankOperationException(ErrorCode.INVALID_AMOUNT);
        }
        double newBalance = balance-value;
        if(newBalance<=0){
            throw new InvalidBankOperationException(ErrorCode.LOW_BALANCE);
        }
        return newBalance;
    }

    public double deposit(double value){
        if(value<=0){
            throw new InvalidBankOperationException(ErrorCode.INVALID_AMOUNT);
        }
        return balance+value;
    }
}
