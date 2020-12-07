package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {

public int sumSalesAmount (List<SalesPerson> sales){
    int sum =0;

    for (SalesPerson salesperson : sales){
        sum+=salesperson.getAmount();
    } return sum;
}

}
