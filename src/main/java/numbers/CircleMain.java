package numbers;

import java.util.Scanner;

public class CircleMain {

    public static void main(String[] args) {

        Circle circle = new Circle();
        Scanner scanner = new Scanner(System.in);
        int diameter = scanner.nextInt();


        System.out.println(circle.perimeter(diameter));
        System.out.println(circle.area(diameter));

    }



}
