package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesAmountSumCalculatorTest {

    SalesAmountSumCalculator salesAmountSumCalculator = new SalesAmountSumCalculator();

    @Test
    public void test(){
        List<SalesPerson> salespersons = Arrays.asList(
                new SalesPerson("John", 600),
                new SalesPerson("Bill", 200),
                new SalesPerson("Kate", 700),
                new SalesPerson("Mary", 700),
                new SalesPerson("Karl", 200)
        );

        assertEquals(salesAmountSumCalculator.sumSalesAmount(salespersons), 2400);

    }
}
