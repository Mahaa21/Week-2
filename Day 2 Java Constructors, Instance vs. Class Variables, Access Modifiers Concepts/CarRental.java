import java.util.Scanner;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    int totalCost(int cost) {
        return cost * rentalDays;
    }

    void rentalDetails () {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rent of the car: ");
        int rent = input.nextInt();
        System.out.println("Car Rental Details: ");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + totalCost(rent));
    }

    public static void main(String[] args){
        CarRental rent = new CarRental("Nax" , "BMW M340i" , 5);
        rent.rentalDetails();
    }
}
