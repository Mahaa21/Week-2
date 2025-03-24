// GPS Interface
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract Vehicle Class
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getter and Setter methods for encapsulation
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    // Concrete method to display vehicle details
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate Per Km: $" + ratePerKm);
    }

    // Abstract method to calculate fare based on distance
    public abstract double calculateFare(double distance);
}

// Car Class
class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("Car location updated to: " + newLocation);
    }
}

// Bike Class
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("Bike location updated to: " + newLocation);
    }
}

// Auto Class
class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("Auto location updated to: " + newLocation);
    }
}

// Main Class for Ride-Hailing Application
public class RideHailingApplication {
    public static void main(String[] args) {
        // Create instances of different vehicle types
        Vehicle car = new Car("CAR123", "Alice", 1.5, "Downtown");
        Vehicle bike = new Bike("BIKE456", "Bob", 1.0, "Uptown");
        Vehicle auto = new Auto("AUTO789", "Charlie", 1.2, "Midtown");

        // Demonstrate polymorphism by calculating fare for each vehicle type
        processVehicle(car, 10);  // 10 km ride
        processVehicle(bike, 5);   // 5 km ride
        processVehicle(auto, 8);   // 8 km ride
    }

    // Method to calculate fare for any vehicle type
    public static void processVehicle(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();  // Display vehicle details
        System.out.println("Fare for " + vehicle.getDriverName() + ": $" + vehicle.calculateFare(distance));

        if (vehicle instanceof GPS) {
            GPS gpsVehicle = (GPS) vehicle;
            System.out.println("Current Location: " + gpsVehicle.getCurrentLocation());
            gpsVehicle.updateLocation("New Location");
            System.out.println("Updated Location: " + gpsVehicle.getCurrentLocation());
        }

        System.out.println("==============================");
    }
}
