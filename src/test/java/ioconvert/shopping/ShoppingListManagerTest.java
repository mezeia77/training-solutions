package ioconvert.shopping;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

class ShoppingListManagerTest {

    ShoppingListManager listManager = new ShoppingListManager();

    @Test
    void saveShoppingListTest() {
        List<String> shoppingList = List.of("kenyér", "tej", "plazmaTV");
        try {
            listManager.saveShoppingList(new FileOutputStream("shoppingList.txt"), shoppingList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}