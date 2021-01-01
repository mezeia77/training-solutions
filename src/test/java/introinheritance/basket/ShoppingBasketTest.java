package introinheritance.basket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingBasketTest {

    private ShoppingBasket shoppingBasket;

//    @Before
//    public void setUp() {
//        shoppingBasket = new ShoppingBasket();
//        shoppingBasket.addItem(new Item("123456", 1500, 27));
//        shoppingBasket.addItem(new Item("789456", 2500, 0));
//        shoppingBasket.addItem(new Item("147258", 5000, 27));
//    }

//    @After
//    public void tearDown() {
//        shoppingBasket = null;
//    }

    @Test
    public void testAddItem() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.addItem(new Item("123456", 1500, 27));
        shoppingBasket.addItem(new Item("789456", 2500, 0));
        shoppingBasket.addItem(new Item("147258", 5000, 27));
        assertEquals(Math.round(shoppingBasket.sumNettoPrice()), 9000L);
    }

    @Test
    public void testRemoveItem() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.addItem(new Item("123456", 1500, 27));
        shoppingBasket.addItem(new Item("789456", 2500, 0));
        shoppingBasket.addItem(new Item("147258", 5000, 27));
        // When
        shoppingBasket.removeItem("123456");
        //Then
        assertEquals(Math.round(shoppingBasket.sumNettoPrice()), 7500L);
    }

    @Test
    public void testSumNettoPrice() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.addItem(new Item("123456", 1500, 27));
        shoppingBasket.addItem(new Item("789456", 2500, 0));
        shoppingBasket.addItem(new Item("147258", 5000, 27));
        assertEquals(shoppingBasket.sumNettoPrice(), 9000.0);
    }

    @Test
    public void testSumTaxValue() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.addItem(new Item("123456", 1500, 27));
        shoppingBasket.addItem(new Item("789456", 2500, 0));
        shoppingBasket.addItem(new Item("147258", 5000, 27));
        assertEquals(shoppingBasket.sumTaxValue(), 1755.0);
    }

    @Test
    public void testSumBruttoPrice() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.addItem(new Item("123456", 1500, 27));
        shoppingBasket.addItem(new Item("789456", 2500, 0));
        shoppingBasket.addItem(new Item("147258", 5000, 27));
        assertEquals(shoppingBasket.sumBruttoPrice(),10755.0);
    }

    @Test
    public void testCheckout() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.addItem(new Item("123456", 1500, 27));
        shoppingBasket.addItem(new Item("789456", 2500, 0));
        shoppingBasket.addItem(new Item("147258", 5000, 27));
        //When
        shoppingBasket.checkout();
        //Then
        assertEquals(shoppingBasket.sumNettoPrice(), 0.0);
   }

    @Test
    public void testRemoveMostExpensiveItem() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.addItem(new Item("123456", 1500, 27));
        shoppingBasket.addItem(new Item("789456", 2500, 0));
        shoppingBasket.addItem(new Item("147258", 5000, 27));
        // When
        shoppingBasket.removeMostExpensiveItem();
        //Then
        assertEquals(shoppingBasket.sumNettoPrice(), 4000.0);
    }
}
