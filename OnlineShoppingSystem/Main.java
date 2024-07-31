package OnlineShoppingSystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product pr1 = new Product("Laptop", 1200.00, "Electronics");
        Product pr2 = new Product("Headphones", 150.00, "Electronics");
        Product pr3 = new Product("Coffee Mug", 12.99, "Kitchen");
        
        Orders order = new Orders("111");

        order.addProduct(pr1);
        order.addProduct(pr2);
        order.addProduct(pr3);

        double totalPrice = order.calculateTotalPrice();
        System.out.println("Total price after discount: $" + totalPrice);

        
        NotificationService notificationService = new NotificationService();
        String customerEmail = "customer@example.com";
        String orderDetails = "Order details: Laptop, Headphones, Coffee Mug";
        notificationService.sendOrderConfirmation(customerEmail, orderDetails);

        String trackingNumber = "TRACK123456";
        notificationService.sendOrderShipped(customerEmail, trackingNumber);
    }
}


/* here i have used the SRP principle */

class Product {
    private String name;
    private double price;
    private String Category;

    // constructor
    public Product(String name, double price, String Category) {
        this.name = name;
        this.price = price;
        this.Category = Category;
    }

    // getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return this.Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }
}

class Orders {
    private String orderId;
    private List<Product> products;
    private Discount discount;

    public Orders(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double calculateTotalPrice() {
        double totalPrice = products.stream().mapToDouble(Product::getPrice).sum();
        if (this.discount != null) {
            totalPrice = this.discount.applyDiscount(totalPrice);
        }
        return totalPrice;
    }
}

abstract class Discount {
    public abstract double applyDiscount(double totalPrice);
}



class NotificationService {
    public void sendOrderConfirmation(String customerEmail, String orderDetails) {

        System.out.println("Order confirmation sent to " + customerEmail + " with details: " + orderDetails);
    }

    public void sendOrderShipped(String customerEmail, String trackingNumber) {

        System.out.println(
                "Order shipped notification sent to " + customerEmail + " with tracking number: " + trackingNumber);
    }
}