package introinheritance.basket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {
    private Basket basket;

//    @Before
//    public void setUp() {
//        basket = new Basket();
//        basket.addItem(new Item("457812", 1500, 27));
//        basket.addItem(new Item("654789", 2500, 0));
//    }

//    @After
//    public void tearDown() {
//        basket = null;
//    }

    @Test
    public void testAddItem() {
        Basket basket = new Basket();
        basket.addItem(new Item("457812", 1500, 27));
        basket.addItem(new Item("654789", 2500, 0));
        assertEquals(basket.getItems().size(), 2);
    }

    @Test
    public void testRemoveItem() {
        Basket basket = new Basket();
        basket.addItem(new Item("457812", 1500, 27));
        basket.addItem(new Item("654789", 2500, 0));
        //When
        basket.removeItem("457812");
        //Then
        assertEquals(basket.getItems().size(), 1);
    }

    @Test
    public void testClearBasket() {
        Basket basket = new Basket();
        basket.addItem(new Item("457812", 1500, 27));
        basket.addItem(new Item("654789", 2500, 0));
        //When
        basket.clearBasket();
        //Then
        assertEquals(basket.getItems().size(), 0);
    }
}
