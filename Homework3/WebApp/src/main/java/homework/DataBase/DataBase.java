package homework.DataBase;

import homework.Model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataBase {
    private int id = 0;
    public List<Product> products = new ArrayList<>();

    public Product getProductById(int id){

        for (Product product : products) {
            if (id == product.getId()){
                return product;
            }
        }
        return new Product();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product){
        product.setId(id);
        products.add(product);
        id++;
    }
}
