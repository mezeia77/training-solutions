package w06d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    @Test
    public void getProductCategoryByNameTest(){
        Store store = new Store(Arrays.asList(
                new Product("Alma", Category.OTHER, 150),
                new Product("Tej", Category.DAIRY, 185),
                new Product("Kenyér", Category.BAKEDGOODS, 320)
                ));
        assertEquals(1, store.getProductCategoryByName(Category.BAKEDGOODS));
    }
}
