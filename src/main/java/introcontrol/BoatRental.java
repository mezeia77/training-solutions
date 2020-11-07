package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vendégek száma:");
        int visitors = scanner.nextInt();

        if (visitors<=2){
            System.out.println("Elvitt: 2 személyes");
            System.out.println("Maradt: 3 + 5 személyes");
        }

        if (visitors==3){
            System.out.println("Elvitt: 3 személyes");
            System.out.println("Maradt: 2 + 5 személyes");
        }

        if (visitors>3 && visitors <=5){
            System.out.println("Elvitt: 5 személyes");
            System.out.println("Maradt: 2 + 3 személyes");
        }

        if (visitors>5 && visitors <=7){
            System.out.println("Elvitt: 5 + 2 személyes");
            System.out.println("Maradt: 3 személyes");
        }

        if (visitors>7 && visitors <=8){
            System.out.println("Elvitt: 5 + 3 személyes");
            System.out.println("Maradt: 2 személyes");
        }

        if (visitors>8 && visitors <=10){
            System.out.println("Elvitt: 5 + 3 + 2 személyes");
            System.out.println("Maradt: 0");
        }

        if (visitors>10){
            System.out.println("Maradtak még a parton!");
        }



    }

}
