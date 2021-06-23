package lambdaintro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testCreate(){
        BankAccount bankAccount = new BankAccount("12345678-00000000-87654321", "John Doe", 100000);

        assertEquals("12345678-00000000-87654321", bankAccount.getAccountNumber());
        assertEquals("John Doe", bankAccount.getNameOfOwner());
        assertEquals(100000, bankAccount.getBalance());
    }
}