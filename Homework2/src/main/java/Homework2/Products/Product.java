package Homework2.Products;

public class Product {
    private final int id;
    private final String title;
    private final float cost;


    public Product(int id, String title, float cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "id : " + id + " || Title: " + title + " || cost: " + cost;
    }
}
