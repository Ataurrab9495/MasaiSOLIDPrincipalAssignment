import OnlineShoppingSystem.Product;

public class Main {
    public static void main(String[] args){
        Product pr = new Product("Md Ataurrab", 99999999);
    }
}


class Product {
    private String name;
    private double price;

    // Constructor, getters, and setters
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "{"+this.name+"\n"+this.price+"}";
    }
}

