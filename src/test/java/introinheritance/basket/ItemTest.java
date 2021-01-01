package introinheritance.basket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {
    @Test
    public void testGetTaxAmount() {
        //Given
        Item item = new Item("123456", 1000, 27);
        //Then
        assertEquals(Math.round(item.getTaxAmount()), 270L);
    }

    @Test
    public void testToString() {
        //Given
        Item item = new Item("123456", 1000, 27);
        //Then
        assertEquals(item.toString(), "Item{barcode='123456', nettoPrice=1000.0, vatPercent=27}");
    }
}
