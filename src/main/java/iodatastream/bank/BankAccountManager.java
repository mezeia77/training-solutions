package iodatastream.bank;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class BankAccountManager {

    public void saveAccount(BankAccount account, Path folder){
        Path path = folder.resolve(account.getAccountNumber() + ".dat");

        try (DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            outputStream.writeUTF(account.getAccountNumber());
            outputStream.writeUTF(account.getName());
            outputStream.writeDouble(account.getBalance());
        } catch (IOException ioException){
            throw new IllegalStateException("Can't save data ", ioException);
        }
    }

    public BankAccount loadAccount(InputStream inputStream){
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream))) {
            return new BankAccount(dataInputStream.readUTF(), dataInputStream.readUTF(), dataInputStream.readDouble());
        } catch (IOException ioe){
            throw new IllegalStateException("Can't read data ", ioe);
            }
        }
    }
