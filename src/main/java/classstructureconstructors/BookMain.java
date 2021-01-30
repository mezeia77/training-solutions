package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Novothny ", " Villamos energia rendszerek");

        book.register(99);

        System.out.println("Szerző?" + book.getAuthor());
        System.out.println("Cím?" + book.getTitle());
        System.out.println("Reg.szám: " + book.getRegNumber());

    }
}
