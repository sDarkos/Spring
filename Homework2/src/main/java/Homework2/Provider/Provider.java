package Homework2.Provider;

import Homework2.Products.Product;

public class Provider {

    private static int id = 0;

    public static Product createProduct(String title, int cost){
        Product product = new Product(id, title, cost);
        id++;
        return product;
    }

}
