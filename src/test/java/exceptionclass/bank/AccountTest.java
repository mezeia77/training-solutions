package exceptionclass.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void constructorTest() {
        Account account = new Account("12345678-00000000", 10_000);
        assertEquals(10_000, account.getBalance());
        assertEquals("12345678-00000000", account.getAccountNumber());
        assertEquals(100_000, account.getMaxSubtract());
        account.setMaxSubtract(200_000);
        assertEquals(200_000, account.getMaxSubtract());

        assertThrows(IllegalArgumentException.class, ()->new Account("", 10_000));
    }

    @Test
    void setInvalidMaxSubtractTest(){
        assertThrows(InvalidBankOperationException.class, ()->new Account("1", 1).setMaxSubtract(0));
    }

    @Test
    void subtractTest(){
        Account account = new Account("1", 100_000);
        System.out.println("MaxSubtract: " + account.getMaxSubtract());
        assertThrows(InvalidBankOperationException.class, ()-> account.subtract(-1));
        assertThrows(InvalidBankOperationException.class, ()-> account.subtract(150_000));

        assertEquals(85_000, account.subtract(15_000));

        assertThrows(InvalidBankOperationException.class, ()->account.subtract(150_000));
    }

    @Test
    void depositTest(){
        Account account = new Account("1", 100_000);
        assertThrows(InvalidBankOperationException.class, ()-> account.subtract(-1));

        assertEquals(115_000, account.deposit(15_000));
    }
}