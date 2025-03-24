import java.awt.*;
import java.util.Scanner;

public class Inventory {

    private String code;
    private String itemName;
    private int price;

    public Inventory(String code, String itemName, int price) {
        this.code = code;
        this.itemName = itemName;
        this.price = price;
    }

    public int TotalPrice () {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();
        return price * quantity;
    }

    public void displayResult(){
        System.out.println("Inventory Details: ");
        System.out.println("Item Code: " + code);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Total Price: " + TotalPrice());
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory("N1000", "Cookie" , 20);
        inventory.displayResult();


    }
}
