package iozip.transactions;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

class TransactionFileManagerTest {

    TransactionFileManager transactionFileManager = new TransactionFileManager();

    @Test
    void saveTransactionsTest() {
        List<Transaction> transactions = List.of(
                new Transaction(345L, LocalDateTime.of(2018, 2, 21, 12, 5, 31), "10092385-34562856-00008701", 412000.0),
                new Transaction(1297L, LocalDateTime.of(2018, 2, 21, 13, 10, 6), "10092385-23651299-00123013", -12000.0)
        );
        transactionFileManager.saveTransactions(Path.of("src\\main\\resources\\iozip\\transactions.zip"), transactions);
    }
}