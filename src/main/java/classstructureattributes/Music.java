package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();

        System.out.println("Band?");
        song.band = scanner.nextLine();

        System.out.println("Title?");
        song.title = scanner.nextLine();

        System.out.println("Length (min.)");
        song.lenght = scanner.nextInt();

        System.out.println(song.band + " - " + song.title + " (" + song.lenght + " perc" + ")");

    }
}
