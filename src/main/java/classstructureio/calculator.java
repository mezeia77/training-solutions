package classstructureio;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number 1?");
        int number1 = scanner.nextInt();

        System.out.println("Number 2?");
        int number2 = scanner.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));

    }
}
