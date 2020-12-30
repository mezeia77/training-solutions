package algorithmssum.transactions;

public class Transaction {

    private String accountNumber;
    private int amount;
    private TransactionOperation transactionOperation;

    public Transaction(String accountNumber, int amount, TransactionOperation transactionOperation) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.transactionOperation = transactionOperation;
    }

    public boolean isCredit(){
        return transactionOperation == TransactionOperation.CREDIT;
    }

    public boolean isDebit(){
        return transactionOperation == TransactionOperation.DEBIT;
    }

    public int getAmount() {
        return amount;
    }

}
