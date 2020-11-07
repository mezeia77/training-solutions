package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a:");
        int a = scanner.nextInt();

        System.out.println("b:");
        int b = scanner.nextInt();

        System.out.println("c:");
        int c = scanner.nextInt();

        System.out.println("d:");
        int d = scanner.nextInt();

        System.out.println("e:");
        int e = scanner.nextInt();

        //int sum = a+b+c+d+e;
        System.out.println("Sum: " + (a+b+c+d+e));
    }
}
