package ioreadstring.transaction;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class TransactionManagerTest {
    Path fullPath = Path.of("src/main/resources/ioreadstring/accounts.txt");
    TransactionManager tm = new TransactionManager(fullPath);

    @Test
    void accountsTest() {
        assertEquals(0, tm.getBankAccountList().size());
        tm.accounts(fullPath);
        assertEquals("John Doe", tm.getBankAccountList().get(0).getName());
        assertEquals(720010, tm.getBankAccountList().get(3).getBalance());
    }

    @Test
    void transactionTest(){
        tm.accounts(fullPath);
        tm.transactions(Path.of("src/main/resources/ioreadstring/transactions.txt"));
        assertEquals(1201000,tm.getBankAccountList().get(0).getBalance());
        assertEquals(721220,tm.getBankAccountList().get(3).getBalance());
    }
}