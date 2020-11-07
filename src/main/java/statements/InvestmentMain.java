package statements;
import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Befektetés összege:");
        int fund = scanner.nextInt();

        System.out.println("Kamatláb:");
        int interestRate = scanner.nextInt();

        System.out.println("Napok:");
        int days = scanner.nextInt();

        Investment investment = new Investment (fund, interestRate);

        System.out.println("Tőke: " + fund);
        System.out.println("Hozam " + days + " napra: " + investment.interest(days));
        System.out.println("Kivett összeg " + days + " nap után: " + investment.close(days));
        System.out.println("Számlaegyenleg: " + investment.close(days));

    }
}
