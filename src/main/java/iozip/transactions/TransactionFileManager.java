package iozip.transactions;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class TransactionFileManager {

    public void saveTransactions(Path path, List<Transaction> transactions){
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            for(Transaction transaction:transactions) {
                zipOutputStream.putNextEntry(new ZipEntry(Long.toString(transaction.getId())));
                String s = transaction.getTime().toString() + "\n" + transaction.getAccount() + "\n" + Double.toString(transaction.getAmount());
                zipOutputStream.write(s.getBytes(StandardCharsets.UTF_8));
                zipOutputStream.closeEntry();
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't write file", ioe);
        }
    }
}
