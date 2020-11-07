package stringtype;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Név:");
        String username = scanner.nextLine();

        System.out.println("jelszó:");
        String password1 = scanner.nextLine();

        System.out.println("jelszó újra:");
        String password2 = scanner.nextLine();

        System.out.println("Email:");
        String email = scanner.nextLine();

        userValidator uservalidator = new userValidator (username, password1, password2, email);

        System.out.println(uservalidator.isValidUserName(username) ? "Név OK" : "Nem adott meg nevet");
        System.out.println(uservalidator.pswLenght(password1) ? "Jelszó elég hosszú" : "Túl rövid jelszó");
        System.out.println(uservalidator.pswEquals(password1, password2) ? "Jelszó egyezik" : "Jelszó nem egyezik");
        System.out.println(uservalidator.isValidEmail(email) ? "Email OK" : "Email nem jó");

    }
}
