public class Product {
    String productName;
    int price;
    static int totalProducts = 0;

    public Product (String productName, int price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main (String[] args) {
        Product p1 = new Product("Hp Gaming Laptop" , 67000);
        Product p2 = new Product("Oppo Reno 8", 28000);
        Product p3 = new Product("Pulsar N160", 158000);

        p1.displayProductDetails();
        System.out.println();

        p2.displayProductDetails();
        System.out.println();

        p3.displayProductDetails();
        displayTotalProducts();
        System.out.println();

    }
}
