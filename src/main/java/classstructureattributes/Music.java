package classstructureattributes;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();

        System.out.println("Band?");
        String band = scanner.nextLine();

        System.out.println("Title?");
        String title = scanner.nextLine();

        System.out.println("Length (min.)");
        int lenght = scanner.nextInt();

        System.out.println("Band: " + band + " Title: " + title + " Length: " + lenght + " min.");

    }
}
