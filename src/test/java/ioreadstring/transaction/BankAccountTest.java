package ioreadstring.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void constructorTest() {
        BankAccount ba = new BankAccount("John Doe","1234-1234-1234-1234",2500);
        assertEquals("John Doe", ba.getName());
        assertEquals("1234-1234-1234-1234", ba.getAccountNumber());
        assertEquals(2500, ba.getBalance());
    }

    @Test
    void setBalance() {
        BankAccount ba = new BankAccount("John Doe","1234-1234-1234-1234",2500);
        ba.setBalance(5000);
        assertEquals(7500, ba.getBalance());
        ba.setBalance(-5000);
        assertEquals(2500, ba.getBalance());
    }
}