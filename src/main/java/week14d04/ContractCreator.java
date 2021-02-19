package week14d04;

import java.util.ArrayList;
import java.util.List;

public class ContractCreator {

    public Contract template;

    public ContractCreator (String client, List<Integer> monthlyPrices){
        this.template = new Contract(client, monthlyPrices);
    }

    public Contract createContract(String client){
        return new Contract(client, new ArrayList<>(template.getMonthlyPrices()));
    }

    public Contract getTemplate(){
        return template;
    }


    public static void main(String[] args) {
        ContractCreator contractCreator = new ContractCreator("John Doe", List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22));
        Contract jackDoe = contractCreator.createContract("Jack Doe");
        jackDoe.getMonthlyPrices().set(12, 20);

        System.out.println(jackDoe.getMonthlyPrices());
        System.out.println(contractCreator.getTemplate().getMonthlyPrices());
    }
}
