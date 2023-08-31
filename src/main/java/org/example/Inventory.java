package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Inventory {

    ArrayList<Product> products;

    public Inventory(){
        products = new ArrayList<>();
    }
    public void addProduct(Product product){
        products.add(product);

    }
    public void removeProduct(Product product){
        products.remove(product);

    }

    public void checkLowInventory(){
        for (Product product: products){
            if (product.getQuantity() <= 100){
                System.out.println(product.getName() +" is running low on inventory - Current Quantity "+product.getQuantity());
            }
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Product product = new Product("LED TV", 200);
        Product product1 = new Product("Mobile", 80);
        Product product2 = new Product("Tablet", 58);

        inventory.addProduct(product);
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        System.out.println("\nCheck low inventory:");
        inventory.checkLowInventory();
        System.out.println("\nRemove Tablet from the inventory!");
        inventory.removeProduct(product2);
        System.out.println("\nAgain check low inventory:");
        inventory.checkLowInventory();

    }
}
class Product{
    private String name;
    private int quantity;

    public Product(String name,int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
