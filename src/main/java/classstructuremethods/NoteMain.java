package classstructuremethods;

import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a nevét");
        String name = scanner.nextLine();
        System.out.println(name);

        note.setName("Kiss Pista");
        note.setTopic("Életrajz");
        note.setText("Az egész úgy kezdődött, hogy...");

        System.out.println("Az Ön valódi neve: " + name);
        System.out.println(note.getNoteText());


    }
}
