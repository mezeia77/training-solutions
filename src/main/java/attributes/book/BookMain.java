package attributes.book;

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book("Gombháború");

        System.out.println(book.getTitle());
        book.setTitle("Made in Japan");
        System.out.println(book.getTitle());

    }
}
