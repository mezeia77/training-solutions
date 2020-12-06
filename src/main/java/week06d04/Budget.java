package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    public List<Item> items;

    public Budget(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Item> getItemsByMonth (int monthNumber){
        List<Item> result = new ArrayList<>();

        for (Item item:items
             ) {if (item.getMonth()==monthNumber){
                 result.add(item);
        }

        } return result;

    }
}
