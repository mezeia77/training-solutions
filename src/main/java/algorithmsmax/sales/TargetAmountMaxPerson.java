package algorithmsmax.sales;

import java.util.List;

public class TargetAmountMaxPerson {

    public SalesPerson selectSalesPersonWithTargetMax(List<SalesPerson> sales){
        SalesPerson salesPersonWithMaxTarget = null;
        for (SalesPerson salesPerson : sales){
            if (salesPersonWithMaxTarget == null || salesPerson.getDifferentFromTarget()>0 && salesPerson.getDifferentFromTarget()> salesPersonWithMaxTarget.getTarget());
            salesPersonWithMaxTarget = salesPerson;
        } return salesPersonWithMaxTarget;
    }

}
