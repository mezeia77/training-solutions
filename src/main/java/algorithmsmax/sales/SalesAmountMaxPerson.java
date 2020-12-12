package algorithmsmax.sales;

import java.util.List;

public class SalesAmountMaxPerson {

public SalesPerson selectSalesPersonWithMaxSalesAmount(List<SalesPerson> sales){
    SalesPerson salesPersonWithMaxSalesAmount = null;
    for (SalesPerson salesPerson : sales){
        if (salesPerson.getAmount()> salesPersonWithMaxSalesAmount.getAmount());
        salesPersonWithMaxSalesAmount = salesPerson;
    } return salesPersonWithMaxSalesAmount;
}

}
