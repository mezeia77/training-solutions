package statements;
import java.util.Scanner;

public class timeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( "Kérem az első órát");
        int hour1 = scanner.nextInt();

        System.out.println( "Kérem az első percet");
        int minute1 = scanner.nextInt();

        System.out.println( "Kérem az első másodpercet");
        int second1 = scanner.nextInt();

        System.out.println( "Kérem a második órát");
        int hour2 = scanner.nextInt();

        System.out.println( "Kérem a második percet");
        int minute2 = scanner.nextInt();

        System.out.println( "Kérem a második másodpercet");
        int second2 = scanner.nextInt();

        Time time1 = new Time(hour1, minute1, second1);
        Time time2 = new Time(hour2, minute2, second2);


        System.out.println("Az első időpont: " + hour1 + ":" + minute1 + ":" + second1);
        System.out.println(time1.getMinute() + " perc");

        System.out.println("A második időpont: " + hour2 + ":" + minute2 + ":" + second2);
        System.out.println(time2.getSecond() + " másodperc");

        if ((hour1*3600 + minute1*60 + second1) < (hour2*3600+minute2*60 + second2)) {
            System.out.println("1. a korábbi");
        } else {
            System.out.println("2. a korábbi ");
        }

    }
}
