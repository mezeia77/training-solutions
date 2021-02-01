package collectionsequalshash;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BookCatalogTest {
    private static final Book[] books = new Book[]{
            new Book("1212", "Egri Csillagok", "Gárdonyi Géza"),
            new Book("2121", "Vuk", "Fekete István"),
            new Book("4545", "Rab Ráby", "Jókai Mór")
    };

    @Test
    void findSelectedBookInBookList(){
    Book foundBook = new BookCatalog().findBookByTitleAuthor(Arrays.asList(books), "Vuk", "Fekete István");
    assertEquals("2121", foundBook.getId());
    assertEquals("Fekete István", foundBook.getAuthor());
    assertEquals("Vuk", foundBook.getTitle());
    assertEquals("Book{id='2121', title='Vuk', author='Fekete István'}", foundBook.toString());
    }

    @Test
    public void bookIsNotInBookList(){
        Book foundBook = new BookCatalog().findBookByTitleAuthor(Arrays.asList(books),"Vuk", "");
        assertNull(foundBook);
    }

    @Test
    public void findSelectedBookInSearchableBookList() {
        Book searchingFor = new Book("2121", "Vuk", "Fekete István");
        Book foundBook = new BookCatalog().findBook(Arrays.asList(books), searchingFor);
        assertTrue(searchingFor.equals(foundBook));
    }

    @Test
    public void selectedBookIsNotInBookList(){
        Book searchingFor = new Book("2121", "Vuk", "István");
        Book foundBook = new BookCatalog().findBook(Arrays.asList(books), searchingFor);
        assertNull(foundBook);
    }

    @Test
    public void findBookByTitleAndAuthor() {
        Book searchingFor = new Book("Vuk", "Fekete István");
        Book foundBook = new BookCatalog().findBook(Arrays.asList(books), searchingFor);
        assertTrue(searchingFor.equals(foundBook));
    }

    @Test
    public void addSameBooksToSet() {
        Book[] sameBooks = new Book[]{
                new Book("1212", "Egri Csillagok", "Gárdonyi Géza"),
                new Book("1212", "Egri Csillagok", "Gárdonyi Géza"),
                new Book("1212", "Egri Csillagok", "Gárdonyi Géza")
        };
        Set<Book> bookSet = new BookCatalog().addBooksToSet(sameBooks);
        assertEquals(1, bookSet.size());
    }
}