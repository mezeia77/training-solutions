package algorithmsmax.sales;

import java.util.List;

public class TargetAmountMinPerson {

    public SalesPerson selectSalesPersonWithTargetMin(List<SalesPerson> sales){
        SalesPerson salesPersonWithMinTarget = null;
        for (SalesPerson salesPerson : sales){
            if (salesPersonWithMinTarget == null || salesPerson.getDifferentFromTarget()<0 && salesPerson.getDifferentFromTarget()< salesPersonWithMinTarget.getTarget());
            salesPersonWithMinTarget = salesPerson;
        } return salesPersonWithMinTarget;
    }
}
