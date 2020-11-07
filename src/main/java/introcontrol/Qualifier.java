package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Szám: ");
        int number = scanner.nextInt();

        if(number>100){
            System.out.println(number + " nagyobb, mint 100");
        } else {
            System.out.println(number + " 100 vagy kisebb, mint 100");
        }
    }
}
