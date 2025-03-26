import java.util.ArrayList;
import java.util.List;

class Product {

    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void displayProduct() {
        System.out.println("- " + productName + " ($" + price + ")");
    }
}

class Order {

    private static int orderCounter = 1;
    private int orderId;
    private List<Product> products;
    private Customers customer;

    public Order(Customers customer) {
        this.orderId = orderCounter++;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getProductName() + " added to Order ID: " + orderId);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void displayOrderDetails() {
        System.out.println("\nOrder ID: " + orderId + " (Customer: " + customer.getName() + ")");
        System.out.println("Products:");
        for (Product product : products) {
            product.displayProduct();
        }
        System.out.printf("\nTotal Price: $%.2f" , getTotalPrice());
    }
}

class Customers {
    private String name;
    private List<Order> orders;

    public Customers(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed an Order (ID: " + order.getOrderId() + ")");
    }

    public void displayCustomerOrders() {
        System.out.println("\nCustomer: " + name);
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {

        Product product1 = new Product("Laptop", 1200.99);
        Product product2 = new Product("Smartphone", 699.49);
        Product product3 = new Product("Headphones", 199.99);
        Product product4 = new Product("Mouse", 49.99);

        Customers customer1 = new Customers("Navaneethan");
        Customers customer2 = new Customers("Nax");

        Order order1 = new Order(customer1);
        Order order2 = new Order(customer1);
        Order order3 = new Order(customer2);

        order1.addProduct(product1);
        order1.addProduct(product3);

        order2.addProduct(product2);
        order2.addProduct(product4);

        order3.addProduct(product4);
        order3.addProduct(product3);

        customer1.placeOrder(order1);
        customer1.placeOrder(order2);
        customer2.placeOrder(order3);

        customer1.displayCustomerOrders();
        customer2.displayCustomerOrders();
    }
}
