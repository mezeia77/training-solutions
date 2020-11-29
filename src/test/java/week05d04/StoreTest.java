package week05d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StoreTest {
    @Test
    void Product(){
        Store store = new Store();

        assertTrue(store.addProduct(new Product("Milk", 2020, 12, 12)));
        assertFalse(store.addProduct(new Product("Milk", 2019,12,25)));
        }
}
