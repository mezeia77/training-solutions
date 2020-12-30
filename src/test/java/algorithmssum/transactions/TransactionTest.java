package algorithmssum.transactions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TransactionTest {

    @Test
    void testCreateTransaction(){
        Transaction transaction = new Transaction("1234-2345-1231", 100000, TransactionOperation.CREDIT);
        assertEquals(transaction.getAmount(), 100000);
        assertEquals(transaction.isCredit(), true);
        assertTrue(transaction.isCredit());
        assertFalse(transaction.isDebit());
    }
}
