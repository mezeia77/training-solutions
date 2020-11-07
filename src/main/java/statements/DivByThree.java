package statements;
import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Kérem a számot");
        int number = scanner.nextInt();

        int result = number % 3;
        if (result != 0) {
            System.out.println("Nem osztható 3-al");
        }else {
            System.out.println("Osztható 3-al");}
    }
}
