package searching.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BookArraySearchTest {

    private List<Book> bookList = new ArrayList<>();

    @BeforeEach
    public void setUp() throws IOException {
        String line;
        try (BufferedReader reader = Files.newBufferedReader(Path.of("src\\main\\resources\\searching\\books.csv"))){
            while ((line = reader.readLine()) != null) {
                String[] lineParts = line.split(";");
                bookList.add(new Book(Integer.parseInt(lineParts[0]), lineParts[2], lineParts[1]));
            }
        } catch (IOException ex) {
            throw new IllegalArgumentException("File not found");
        }
    }

    @Test
    void emptyParametersShouldThrowException() throws IllegalArgumentException {
        Book[] bookArray = new Book[bookList.size()];
        assertThrows(IllegalArgumentException.class, ()->new BookArraySearch(bookList.toArray(bookArray)).findBookByAuthorTitle("", ""));
    }

    @Test
    void emptyParametersShouldThrowExceptionNull() throws IllegalArgumentException {
        Book[] bookArray = new Book[bookList.size()];
        assertThrows(IllegalArgumentException.class, ()->new BookArraySearch(bookList.toArray(bookArray)).findBookByAuthorTitle(null, null));

    }

    @Test
    void notFoundBookShouldThrowException() throws IllegalArgumentException {
        String author = "Homérosz";
        String title = "Iliász";
        Book[] bookArray = new Book[bookList.size()];
        assertThrows(IllegalArgumentException.class, ()->new BookArraySearch(bookList.toArray(bookArray)).findBookByAuthorTitle(author, title));
    }

    @Test
    void testFindBookByAuthorTitle() {
        Book[] bookArray = new Book[bookList.size()];
        BookArraySearch bas = new BookArraySearch(bookList.toArray(bookArray));
        Book book = bas.findBookByAuthorTitle("Fazekas Anna", "Mackó, Mókus, Malacka");
        assertEquals(1010, book.getId());
        assertEquals("Fazekas Anna", book.getAuthor());
        assertEquals("Mackó, Mókus, Malacka", book.getTitle());
        assertEquals("1010 Fazekas Anna Mackó, Mókus, Malacka", book.toString());
    }
}