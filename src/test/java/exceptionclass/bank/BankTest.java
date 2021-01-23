package exceptionclass.bank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void emptyListTest() {
        List<Account> accounts = List.of();
        assertThrows(IllegalArgumentException.class, ()->new Bank(accounts));
    }

    @Test
    void getAccountTest(){
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("12345678", 100_000));
        Bank bank = new Bank(accounts);
        assertThrows(InvalidBankOperationException.class, ()-> bank.getAccount(""));

        accounts.add(new Account("12345678", 100_000));
        assertThrows(InvalidBankOperationException.class, ()-> bank.getAccount("1234567"));
    }
}