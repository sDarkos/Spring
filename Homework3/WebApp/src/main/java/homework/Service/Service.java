package homework.Service;


import homework.DataBase.DataBase;
import homework.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    private DataBase dataBase;

    @Autowired
    public void SetProductsDataBase (DataBase dataBase){
        this.dataBase = dataBase;
    }

    public Product getProductById (int id){
        return dataBase.getProductById(id);
    }

    public List<Product> getAllProducts(){
        return dataBase.getProducts();
    }

    public void addProduct (Product product){
        dataBase.addProduct(product);
    }

}
