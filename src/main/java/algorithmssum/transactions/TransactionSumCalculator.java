package algorithmssum.transactions;

import java.util.List;

public class TransactionSumCalculator {

    public int sumAmountOfCreditEntries (List<Transaction> transactions){
        int sum = 0;
        for (Transaction transaction:transactions){
            if (transaction.isCredit()){
                sum = sum + transaction.getAmount();
            }
        } return sum;
    }
}
