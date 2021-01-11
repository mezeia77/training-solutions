package inheritancemethods;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PackedProductTest {
    @Test
    public void constructorTest() {
        //Given
        BigDecimal unit = new BigDecimal("0.235");
        BigDecimal box = new BigDecimal("1.25");
        PackedProduct product = new PackedProduct("Ipad", unit, 3, 12, box);
        //Then
        assertEquals(product.getName(), "Ipad");
        assertEquals(product.getUnitWeight(), unit);
        assertEquals(product.getNumberOfDecimals(), 3);
        assertEquals(product.getPackingUnit(), 12);
        assertEquals(product.getWeightOfBox(), box);
    }

    @Test
    public void totalWeight() {
        //Given
        BigDecimal unit = new BigDecimal("0.235");
        BigDecimal box = new BigDecimal("1.25");
        PackedProduct product = new PackedProduct("Ipad", unit, 3, 12, box);
        BigDecimal total = new BigDecimal("6.025");
        //Then
        assertEquals(product.totalWeight(15), total);
    }
}
