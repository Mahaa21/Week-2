public class Vehicle {

    private static int registrationFee = 1000;
    private String ownerName;
    private String vehicleType;
    private final int registrationNumber;

    public Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    public void display() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("---------------------------------------------");
    }

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Navaneethan", "Bike", 13);
        if (v1 instanceof Vehicle) {
            System.out.println("v1 is an instance of Vehicle");
        }
        System.out.println("Before updating the Registration Fee.");
        v1.display();

        updateRegistrationFee(3000);
        System.out.println("After updating the Registration Fee.");
        v1.display();

    }
}
