package algorithmscount.bankaccounts;

import java.util.List;

public class TransactionCounter {

    public int count(List<Transaction> transactions, int max){
        int result = 0;
        for (Transaction transaction:transactions) {
            if (transaction.getAmount()<max){
                result++;
            }
        } return result;
    }

}
