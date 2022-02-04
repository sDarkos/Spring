package Homework2.Service;

import Homework2.Products.Product;
import Homework2.Provider.Provider;

import java.util.ArrayList;
import java.util.List;

public class Service {


    public static Product createProduct (){
         return Provider.createProduct(Randomizer.getRandomTitle(), Randomizer.getRandomCost());
    }

    public static List<Product> createProducts(int quantity){

        List<Product> products = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            products.add(createProduct());
        }

        return products;
    }

}
