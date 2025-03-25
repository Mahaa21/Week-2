public class Vehicle {

    String ownerName;
    String vehicleType;
    static int registrationFee = 1000;

    public Vehicle (String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("------------------------------------------");
    }

    static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alex" , "Bike");
        Vehicle v2 = new Vehicle("Ron" , "Car");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        updateRegistrationFee(1500);

        System.out.println("After Updating Registration Fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
