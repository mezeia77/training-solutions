package week06d04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BudgetTest {



    @Test
    public void mukodik(){
        Budget budget = new Budget(Arrays.asList(
                new Item(100, 5, "paper"),
                new Item(14_000_000, 5, "company car"),
                new Item(282_000, 6, "coffee machine")
        ));
        List<Item> result = budget.getItemsByMonth(5);
        assertEquals(2,result.size());
        assertEquals("company car", result.get(1).getName());
    }
}
