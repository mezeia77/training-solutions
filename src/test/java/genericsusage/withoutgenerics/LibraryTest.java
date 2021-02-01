package genericsusage.withoutgenerics;

import genericsusage.Book;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void getFirstBookTest() {
        Library library = new Library();
        List<Book> books = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, ()->library.getFirstBook(books));
        books.add(new Book("Kétévi vakáció"));
        books.add(new Book("Made in Japan"));
        books.add(new Book("A kőszívű ember fiai"));
        assertEquals("Kétévi vakáció", library.getFirstBook(books).getTitle());
    }
}