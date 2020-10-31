package classsctructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Új számlaszám 1?");
        String accountNumber = scanner.nextLine();

        System.out.println("Tulajdonos 1?");
        String owner = scanner.nextLine();

        System.out.println("Nyitó összeg 1?");
        int balance = scanner.nextInt();
        scanner.nextLine();

        BankAccount account1 = new BankAccount(accountNumber, owner, balance);

        System.out.println("Új számlaszám 2?");
        String accountNumber2 = scanner.nextLine();

        System.out.println("Tulajdonos 2?");
        String owner2 = scanner.nextLine();

        System.out.println("Nyitó összeg 2?");
        int balance2 = scanner.nextInt();

        BankAccount account2 = new BankAccount(accountNumber2, owner2, balance2);

        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());

        System.out.println("Első számlán összeg változtatás (+/-)?");
        int depositAmount = scanner.nextInt();
        account1.deposit(depositAmount);

        System.out.println("Második számlán összeg változtatás (-/+)?");
        int withdrawAmount = scanner.nextInt();
        account2.withdraw(withdrawAmount);

        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());

        System.out.println("Összeg átutalás 1 -> 2?");
        int transferAmount = scanner.nextInt();
        account1.transfer(account2, transferAmount);

        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());
    }
}
