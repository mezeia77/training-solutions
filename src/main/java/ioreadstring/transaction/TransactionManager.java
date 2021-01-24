package ioreadstring.transaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    Path fullPath;
    List<BankAccount> bankAccountList = new ArrayList<>();

    public TransactionManager(Path fullPath) {
        this.fullPath = fullPath;
    }

    public List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public void accounts (Path fullPath){
        List<String> data;
        try {
            data = Files.readAllLines(fullPath);
            for(String s : data){
                String[] parts = s.split(";");
                BankAccount ba = new BankAccount(parts[0], parts[1], Integer.parseInt(parts[2]));
                bankAccountList.add(ba);
            }
        } catch (IOException e) {
            System.out.println("File not found: " + e);
        }
    }

    public void transactions(Path fullPath){
        List<String> data;
        try {
            data = Files.readAllLines(fullPath);
            for(String s :data){
                String[] parts = s.split(";");
                for(BankAccount ba : bankAccountList)
                if(parts[0].equals(ba.getAccountNumber())){
                    ba.setBalance(Integer.parseInt(parts[1]));
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("File not found", e);
        }

    }
}
