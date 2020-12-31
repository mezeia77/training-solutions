package staticattrmeth;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTransactionTest {

    @Test
    public void testOneTransaction() {
        //Given
        BankTransaction.initTheDay();
        BankTransaction bankTransaction = new BankTransaction(10_000);
        //Then
        assertEquals(bankTransaction.getTrxValue(), 10_000L);
        assertEquals(BankTransaction.getCurrentMinValue(), 10_000L);
        assertEquals(BankTransaction.getCurrentMaxValue(), 10_000L);
        assertEquals(BankTransaction.getSumOfTrxs(), new BigDecimal("10000"));
        assertEquals(BankTransaction.averageOfTransaction(), new BigDecimal("10000"));
    }

    @Test
    public void testSeveralTransactions() {
        //Given
        BankTransaction.initTheDay();
        new BankTransaction(10_000);
        new BankTransaction(20_000);
        //Then
        assertEquals(BankTransaction.getCurrentMinValue(), 10_000L);
        assertEquals(BankTransaction.getCurrentMaxValue(), 20_000L);
        assertEquals(BankTransaction.getSumOfTrxs(), new BigDecimal("30000"));
        assertEquals(BankTransaction.averageOfTransaction(), new BigDecimal("15000"));
    }

    @Test
    public void testZeroTransaction() {
        //Given
        BankTransaction.initTheDay();
        //Then
        assertEquals(BankTransaction.getCurrentMinValue(), 0L);
        assertEquals(BankTransaction.getCurrentMaxValue(), 0L);
        assertEquals(BankTransaction.getSumOfTrxs(), new BigDecimal("0"));
    }

}
