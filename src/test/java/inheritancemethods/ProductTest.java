package inheritancemethods;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    @Test
    public void constructorTest3Parameters() {
        //Given
        BigDecimal unit = new BigDecimal("0.235");
        Product product = new Product("Ipad", unit, 3);
        //Then
        assertEquals(product.getName(), "Ipad");
        assertEquals(product.getUnitWeight(), unit);
        assertEquals(product.getNumberOfDecimals(),3);
    }

    @Test
    public void constructorTest2Parameters() {
        //Given
        BigDecimal unit = new BigDecimal("0.235");
        Product product = new Product("Ipad", unit);
        //Then
        assertEquals(product.getName(), "Ipad");
        assertEquals(product.getUnitWeight(), unit);
        assertEquals(product.getNumberOfDecimals(),2);
    }

    @Test
    public void totalWeight() {
        //Given
        BigDecimal unit = new BigDecimal("0.235");
        Product product = new Product("Ipad", unit, 3);
        BigDecimal total = new BigDecimal("0.705");
        //Then
        assertEquals(product.totalWeight(3), total);
    }
}
