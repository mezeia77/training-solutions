package algorithmscount.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionCounterTest {

    @Test
    public void countTest(){
        List<Transaction> transactions = Arrays.asList(
                new Transaction("1234", TransactionType.CREDIT, 1000),
                new Transaction("1234", TransactionType.CREDIT, 2000),
                new Transaction("1234", TransactionType.CREDIT, 3000),
                new Transaction("1234", TransactionType.CREDIT, 4000)
        );

        assertEquals(new TransactionCounter().count(transactions, 2000), 1);
        assertEquals(new TransactionCounter().count(transactions, 1000), 0);
        assertEquals(new TransactionCounter().count(transactions, 10000),4);
    }

}
