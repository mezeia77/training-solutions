package classstructureattributes;

import java.util.Scanner;

public class clientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        client client = new client();

        System.out.println("Name?");
        String name = scanner.nextLine();

        System.out.println("Year of birth?");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Address?");
        String address = scanner.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Year of birth: " + yearOfBirth);
        System.out.println("Address: " + address);
    }
}
