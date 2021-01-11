package week04d03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Random random = new Random(10);
        int rnd = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(rnd);

            for(int i=1; i<=6; i++){
                System.out.println("Please give me a number between 1-100");
                int guess = scanner.nextInt();

                boolean isNumberBetweenTheLimits = true;

                if (guess<1 || guess>100){
                    System.out.println("Number must be between 1-100!");
                    i--;
                    isNumberBetweenTheLimits = false;
                }

                if(guess<rnd && isNumberBetweenTheLimits){
                    System.out.println("My number is bigger");
                }

                if(guess>rnd &&isNumberBetweenTheLimits){
                    System.out.println("My number is smaller");
                }

                if(guess == rnd){
                    System.out.println("Correct! :");
                    break;
                }
            }
    }
}
