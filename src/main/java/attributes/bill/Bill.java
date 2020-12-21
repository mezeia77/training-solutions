package attributes.bill;

import java.util.ArrayList;
import java.util.List;

public class Bill {

   // Item item = new Item("as", 25, 56);
    List<Item> items = new ArrayList<>();

//    public void setItems(List<Item> items) {
//        this.items = items;
//    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

//    public double calculateTotalPrice(){
//        double x = 0;
//        for (int i=0; i<=items.size(); i++){
//            x += item.getPrice() * item.getQuantity();
//        } return x;
//    }

    public double calculateTotalPrice2(){
        double x = 0;
        for (Item item: items){
            x += item.getPrice() * item.getQuantity();
        } return x;
    }
}
