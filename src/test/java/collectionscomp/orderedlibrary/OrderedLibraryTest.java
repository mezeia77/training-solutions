package collectionscomp.orderedlibrary;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;


public class OrderedLibraryTest {

    private OrderedLibrary library;


    @BeforeEach
    public void setUp() {
        List<Book> bookList = new LinkedList<>(Arrays.asList(
                new Book(1245, "Őrület", "Utasy Kristóf"),
                new Book(2454, "Álom", "Ómolnár Géza"),
                new Book(5454, "Államhatár", "Ákos János"),
                new Book(5454, "Utitársak", "Ős János")));

        library = new OrderedLibrary(bookList);
    }

    @Test
    public void testOrderedByTitle() {
        List<Book> orderedBookList = library.orderedByTitle();
        System.out.println(orderedBookList);
        assertEquals("Utitársak", orderedBookList.get(0).getTitle());
    }

    @Test
    public void testOrderedByAuthor() {
        List<Book> orderedBookList = library.orderedByAuthor();
        System.out.println(orderedBookList);
        assertEquals("Utasy Kristóf", orderedBookList.get(0).getAuthor());
    }

    @Test
    public void testOrderedByTitleLocale() {
        List<String> orderedTitleList = library.orderedByTitleLocale(new Locale("hu", "HU"));
        System.out.println(orderedTitleList);
        assertEquals("Államhatár", orderedTitleList.get(0));
    }
}
