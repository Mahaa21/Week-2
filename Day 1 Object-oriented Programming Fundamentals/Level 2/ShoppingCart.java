import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    String itemName;
    int price;
    int quantity;

    public CartItem(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public int TotalCost () {
        return price * quantity;
    }
}

public class ShoppingCart {

    private ArrayList<CartItem> cart = new ArrayList<>();

    public void AddItem (String name, int price, int quantity) {
        cart.add(new CartItem(name, price, quantity));
        System.out.println(quantity + "x " + name + " is added to the cart.");
    }

    public void RemoveItem (String name) {
        cart.removeIf(item-> item.itemName.equalsIgnoreCase(name));
        System.out.println(name + " is removed from the cart.");
    }

    public void displayTotal () {
        int total = 0;
        for (CartItem item : cart) {
            total += item.TotalCost();
        }
        System.out.println("Total cost: " + total);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        while (true) {
            System.out.println("Shopping Cart Simulation:");
            System.out.println("1. Add an Item \n2. Remove an Item \n3. Total Cost \n4. Exit Cart");
            System.out.print("Enter the choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the item name: ");
                    String itemName = input.nextLine();
                    System.out.print("Enter the item price: ");
                    int price = input.nextInt();
                    System.out.print("Enter the item quantity: ");
                    int quantity = input.nextInt();
                    cart.AddItem(itemName, price, quantity);
                    break;

                case 2:
                    System.out.print("Enter the item name: ");
                    String name = input.nextLine();
                    cart.RemoveItem(name);
                    break;

                case 3:
                    cart.displayTotal();
                    break;

                case 4:
                    System.out.println("Thanking you for Shopping!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}

