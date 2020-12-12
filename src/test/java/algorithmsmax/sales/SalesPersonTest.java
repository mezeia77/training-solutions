package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesPersonTest {

    @Test
    public void testCreate (){
         SalesPerson person = new SalesPerson ("John Doe", 1000, 200);
         assertEquals(person.getAmount(), 1000);
         assertEquals(person.getName(), "John Doe");
         assertEquals(person.getTarget(), 200);
    }

    List<SalesPerson> s = Arrays.asList(
            new SalesPerson("John", 600, 500),
            new SalesPerson("Bill", 200, 300),
            new SalesPerson("Kate", 700, 100),
            new SalesPerson("Mary", 700, 300),
            new SalesPerson("Karl", 200, 50)
    );

    @Test
    public void testSelectSalesPersonWithMaxSalesAmount() {
        SalesAmountMaxPerson maxAmount = new SalesAmountMaxPerson();

        assertEquals(maxAmount.selectSalesPersonWithMaxSalesAmount(s).getAmount(), 700);
        assertEquals(maxAmount.selectSalesPersonWithMaxSalesAmount(s).getTarget(), 100);
    }

    @Test
    public void testSelectSalesPersonWithFurthestAboveTarget() {
        TargetAmountMaxPerson aboveTarget = new TargetAmountMaxPerson();

        assertEquals(aboveTarget.selectSalesPersonWithTargetMax(s).getDifferentFromTarget(), 600);
        assertEquals(aboveTarget.selectSalesPersonWithTargetMax(s).getAmount(), 700);
        assertEquals(aboveTarget.selectSalesPersonWithTargetMax(s).getTarget(), 100);
    }

    @Test
    public void testSelectSalesPersonWithFurthestBelowTarget() {
        TargetAmountMinPerson belowTarget = new TargetAmountMinPerson();

        assertEquals(belowTarget.selectSalesPersonWithTargetMin(s).getDifferentFromTarget(), -100);
        assertEquals(belowTarget.selectSalesPersonWithTargetMin(s).getAmount(), 200);
        assertEquals(belowTarget.selectSalesPersonWithTargetMin(s).getTarget(), 300);
    }

}
