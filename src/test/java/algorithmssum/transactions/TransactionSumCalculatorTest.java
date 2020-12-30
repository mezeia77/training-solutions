package algorithmssum.transactions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionSumCalculatorTest {
    @Test
    void testSumAmountOfCreditEntries() {

        TransactionSumCalculator calculator = new TransactionSumCalculator();

        List<Transaction> transactions = Arrays.asList(
                new Transaction("1234-2345-1231", 100000, TransactionOperation.CREDIT),
                new Transaction("1234-2345-1231", 500, TransactionOperation.DEBIT),
                new Transaction("1234-2345-1231", 0, TransactionOperation.CREDIT),
                new Transaction("1234-2345-1231", 1, TransactionOperation.CREDIT),
                new Transaction("1234-2345-1231", -200, TransactionOperation.CREDIT),
                new Transaction("1234-2345-1231", 100000, TransactionOperation.DEBIT)
        );

        assertEquals(calculator.sumAmountOfCreditEntries(transactions), 99801);

    }
}
