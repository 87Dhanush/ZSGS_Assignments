import java.util.*;
abstract class Product {
    private String name;
    public Product(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract double getPrice();
    public abstract String getDescription();

    public void displayDetails() {
        System.out.println("Product Name: "+ getName());
        System.out.println("Description: "+ getDescription());
        System.out.println("Price: Rs"+ getPrice());
    }
}

class ElectronicsProduct extends Product {
    private String brand;
    private double price;

    public ElectronicsProduct(String name, String brand, double price) {
        super(name);
        this.brand = brand;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return "Electronics Product by " + brand;
    }
}

class ClothingProduct extends Product {
    private String size;
    private double price;

    public ClothingProduct(String name, String size, double price) {
        super(name);
        this.size = size;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Clothing Product, Size: " + size;
    }
}

class BookProduct extends Product {
    private String author;
    private double price;

    public BookProduct(String name, String author, double price) {
        super(name);
        this.author = author;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Book written by "+ author;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();

        cart.add(new ElectronicsProduct("Smartphone", "Samsung", 699.99));
        cart.add(new ClothingProduct("T-Shirt", "M", 29.99));
        cart.add(new BookProduct("Java Programming", "James Gosling", 49.99));

        double totalPrice = 0.0;
        System.out.println("Shopping Cart Details:");
        System.out.println("-----------------------");
        for (Product product : cart) {
            product.displayDetails();
            System.out.println();
            totalPrice += product.getPrice();
        }

        System.out.println("Total Price of Products in Cart: $" + totalPrice);
    }
}
