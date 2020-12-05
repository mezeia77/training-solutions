package week05d04;

import java.util.ArrayList;
import java.util.List;

public class Store {

    public List<Product> productList = new ArrayList<>();


    public boolean addProduct(Product product){
        if(product.isExpired()==true){
            return false;
        }
        productList.add(product);
        return true;
    }

    public List<Product> getProductList(){
        return productList;
    }

    public int getNumberOfExpired(){
        int i = 0;
        for (Product p: productList) {
            if(p.isExpired()){
                i++;
            }
        }
        return i;
    }

}
