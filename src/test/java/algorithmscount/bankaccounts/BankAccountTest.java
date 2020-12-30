package algorithmscount.bankaccounts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    void createBankAccount(){
        BankAccount bankAccount = new BankAccount("John Doe", "12345678-00000000-87654321", 300000);
        assertEquals(bankAccount.getNameOfOwner(), "John Doe");
        assertEquals(bankAccount.getAccountNumber(), "12345678-00000000-87654321");
        assertEquals(bankAccount.getBalance(), 300000);
    }
}
