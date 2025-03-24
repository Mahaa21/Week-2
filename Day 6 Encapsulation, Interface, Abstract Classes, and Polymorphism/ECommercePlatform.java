// Interface for taxable products
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract Product class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Abstract method
    public abstract double calculateDiscount();

    // Getters & Setters (Encapsulation)
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setPrice(double price) {
        this.price = price;
    }

    // Display details
    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}

// Electronics - applies tax and discount
class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1;  // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.15; // 15% tax
    }

    @Override
    public String getTaxDetails() {
        return "15% tax applied to Electronics";
    }
}

// Clothing - applies tax and discount
class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.2; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% tax
    }

    @Override
    public String getTaxDetails() {
        return "5% tax applied to Clothing";
    }
}

// Groceries - no tax, minimal discount
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

public class ECommercePlatform {
    // Polymorphic method to calculate and print final price
    public static void printFinalPrice(Product product) {
        double tax = 0.0;

        if (product instanceof Taxable) {
            tax = ((Taxable) product).calculateTax();
            System.out.println(((Taxable) product).getTaxDetails());
        }

        double discount = product.calculateDiscount();
        double finalPrice = product.getPrice() + tax - discount;

        product.displayProduct();
        System.out.printf("Discount: $%.2f\n", discount);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Final Price: $%.2f\n", finalPrice);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        // Create products
        Product p1 = new Electronics(1001, "Laptop", 1000.00);
        Product p2 = new Clothing(1002, "T-Shirt", 50.00);
        Product p3 = new Groceries(1003, "Apples", 20.00);

        // Array of products for polymorphic processing
        Product[] productList = {p1, p2, p3};

        for (Product p : productList) {
            printFinalPrice(p);
        }
    }
}
