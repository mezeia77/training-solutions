package classstructureio;

import java.util.Scanner;

public class registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name?");
        String name = scanner.nextLine();

        System.out.println("Email?");
        String email = scanner.nextLine();

        System.out.println("Registration name: " + name);
        System.out.println("Registration email: " + email);
    }
}
