package numbers;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("5*2-10/5+3=?");

        int number = scanner.nextInt();

        System.out.println("A számított eredmény: " + (5*2-10/5+3));
        System.out.println("Az eredmény: " + ((5*2-10/5+3)==number));
        System.out.println("A különbség: " + (Math.abs((5*2-10/5+3))-number));
        System.out.println((Math.abs((5*2-10/5+3)-number))<1e-4);


    }

}
