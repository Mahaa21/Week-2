public class Product {

    private static double discount = 10;
    private final int productId;
    private String productName;
    private int price;
    private int quantity;

    public Product (String productName, int productId, int price, int quantity) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    public static void getDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public double updateDiscount() {
        return discount;
    }

    public double totalPrice() {
        double totalPrice = price * quantity;
        double discountAmt = (totalPrice) * (discount / 100);
        return totalPrice - discountAmt;
    }

    public void display() {
        System.out.println("Product Details:");
        System.out.println("Product Name: " + productName);
        System.out.println("Product Id: " + productId);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + updateDiscount());
        System.out.printf("Total Price: %.2f\n" , totalPrice());
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {

        Product p1 = new Product("BMW M40i", 1710, 8500000, 1);
        if (p1 instanceof Product) {
            System.out.println("p1 is an instance of Product");
        }
        System.out.println("Before updating the discount.");
        p1.display();

        getDiscount(20);
        System.out.println("After updating the discount.");
        p1.display();
    }
}
