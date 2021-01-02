package inheritanceattributes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    @Test
    public void constructorTest() {
        //Given
        Book book = new Book("Gyűrűk ura", 3000);
        //Then
        assertEquals(book.getTitle(), "Gyűrűk ura");
        assertEquals(book.price, 3000);
    }

    @Test
    public void testPurchase() {
        //Given
        Book book = new Book("Gyűrűk ura", 3000);
        //Then
        assertEquals(book.purchase(2), 6000);
    }
}
