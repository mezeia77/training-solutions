package inheritanceattributes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippedBookTest {

    @Test
    public void constructorAndToStringTest() {
        //Given
        ShippedBook book = new ShippedBook("Gyűrűk ura", 3000, 1200);
        //Then
        assertEquals(book.toString(),"Gyűrűk ura:3000 - 1200");
    }

    @Test
    public void orderTest()  {
        //Given
        ShippedBook book = new ShippedBook("Gyűrűk ura", 3000, 1200);
        //Then
        assertEquals(book.order(2), 7200);
    }

    @Test
    public void purchaseTest() {
        //Given
        ShippedBook book = new ShippedBook("Gyűrűk ura", 3000, 1200);
        //Then
        assertEquals(book.purchase(2), 6000);
    }
}
