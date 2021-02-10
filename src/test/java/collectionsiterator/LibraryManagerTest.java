package collectionsiterator;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryManagerTest {
    LibraryManager manager;

    @BeforeEach
    public void setup() {
        Set<Book> bookSet = new HashSet<>(List.of(
                new Book(1245, "Core Java", "Cay Horstmann"),
                new Book(2454, "Core JavaServer Faces", "Cay Horstmann"),
                new Book(5454, "Effective Java", "Bloch")));
        manager = new LibraryManager(bookSet);
    }

    @Test
    public void missingRegnumberShouldThrowException() {
        assertThrows(MissingBookException.class, ()-> manager.findBookByRegNumber(1212));
    }

    @Test
    public void testFindBookByRegNumber() {
        Book book = manager.findBookByRegNumber(1245);
        assertEquals("Cay Horstmann", book.getAuthor());
        assertEquals("Core Java", book.getTitle());
    }

    @Test
    public void missingRegnumberShouldThrowExceptionAtRemove(){
        assertThrows(MissingBookException.class, ()->manager.removeBookByRegNumber(1212));
    }

    @Test
    public void testRemoveBookByRegNumber() {
        int removedBookId = manager.removeBookByRegNumber(2454);
        assertEquals(2454, removedBookId);
        assertEquals(2, manager.libraryBooksCount());
    }

    @Test
    public void nonExistingAuthorShouldThrowExceptionAtRemove(){
        assertThrows(MissingBookException.class, ()->manager.selectBooksByAuthor("Tolkien"));
    }

    @Test
    public void testSelectBooksByAuthor() {
        Set<Book> foundBooks = manager.selectBooksByAuthor("Cay Horstmann");
        assertEquals(2, foundBooks.size());
    }
}