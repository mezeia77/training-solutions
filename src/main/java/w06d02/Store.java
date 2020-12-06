package w06d02;

import java.util.List;

public class Store {

    private List<Product> products;

    public Store(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getProductCategoryByName(Category categoryName){
        int i=0;

        for (Product p: products) {
            if (p.getCategory()==categoryName){
                i++;
            }

        }return i;
    }
}
