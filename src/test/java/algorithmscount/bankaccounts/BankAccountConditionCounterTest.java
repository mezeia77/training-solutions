package algorithmscount.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountConditionCounterTest {
    @Test
    void numberOfAccountsOverTheLimitTest(){
        List<BankAccount> bankAccounts = Arrays.asList(
                new BankAccount("John Doe", "1", 300000),
                new BankAccount("Jack Doe", "2", 100000),
                new BankAccount("Jane Doe", "2", 500000),
                new BankAccount("Johann Doe", "2", 7500000));

        assertEquals(new BankAccountConditionCounter().numberOfAccountsOverTheLimit(bankAccounts, 100), 4);
        assertEquals(new BankAccountConditionCounter().numberOfAccountsOverTheLimit(bankAccounts, 300000), 2);

    }
}
