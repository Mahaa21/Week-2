// Interface for applying discounts to food items
interface Discountable {
    void applyDiscount();
    String getDiscountDetails();
}

// Abstract class representing a food item
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter methods for encapsulation
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();

    // Concrete method to display item details
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }
}

// VegItem class representing a vegetarian food item
class VegItem extends FoodItem implements Discountable {
    private double discountRate; // Discount for VegItems

    public VegItem(String itemName, double price, int quantity, double discountRate) {
        super(itemName, price, quantity);
        this.discountRate = discountRate;
    }

    // Overridden method to calculate total price for VegItem
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    // Method from Discountable interface
    @Override
    public void applyDiscount() {
        double totalPrice = calculateTotalPrice();
        double discountAmount = totalPrice * (discountRate / 100);
        double discountedPrice = totalPrice - discountAmount;
        System.out.println("Total Price after " + discountRate + "% discount: $" + discountedPrice);
    }

    // Method to display discount details
    @Override
    public String getDiscountDetails() {
        return "Discount Rate: " + discountRate + "%";
    }
}

// NonVegItem class representing a non-vegetarian food item
class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge; // Additional charge for NonVegItems
    private double discountRate; // Discount for NonVegItems

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge, double discountRate) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
        this.discountRate = discountRate;
    }

    // Overridden method to calculate total price for NonVegItem
    @Override
    public double calculateTotalPrice() {
        double totalPrice = getPrice() * getQuantity();
        return totalPrice + additionalCharge; // Add additional charge for non-veg items
    }

    // Method from Discountable interface
    @Override
    public void applyDiscount() {
        double totalPrice = calculateTotalPrice();
        double discountAmount = totalPrice * (discountRate / 100);
        double discountedPrice = totalPrice - discountAmount;
        System.out.println("Total Price after " + discountRate + "% discount: $" + discountedPrice);
    }

    // Method to display discount details
    @Override
    public String getDiscountDetails() {
        return "Additional charge for Non-Veg: $" + additionalCharge + ", Discount Rate: " + discountRate + "%";
    }
}

// Main class to simulate the food order system
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Create some food items
        FoodItem vegItem = new VegItem("Vegetable Curry", 12.99, 2, 10);  // 10% discount
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 15.99, 1, 2.5, 5);  // 5% discount

        // Use polymorphism to handle different food items in a single order-processing method
        processOrder(vegItem);
        processOrder(nonVegItem);
    }

    // Method to process the order and display the total price with discount
    public static void processOrder(FoodItem foodItem) {
        foodItem.getItemDetails();  // Show food item details
        System.out.println("Total Price: $" + foodItem.calculateTotalPrice());
        if (foodItem instanceof Discountable) {
            Discountable discountableItem = (Discountable) foodItem;
            discountableItem.applyDiscount();
            System.out.println(discountableItem.getDiscountDetails());
        }
        System.out.println("===========================");
    }
}
