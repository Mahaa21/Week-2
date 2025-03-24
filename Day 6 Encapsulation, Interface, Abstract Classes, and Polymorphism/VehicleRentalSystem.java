// Insurable interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Main class with all inner classes
public class VehicleRentalSystem {

    // Abstract Vehicle class
    abstract class Vehicle {
        private String vehicleNumber;
        private String type;
        protected double rentalRate;

        public Vehicle(String vehicleNumber, String type, double rentalRate) {
            this.vehicleNumber = vehicleNumber;
            this.type = type;
            this.rentalRate = rentalRate;
        }

        public String getVehicleNumber() {
            return vehicleNumber;
        }

        public String getType() {
            return type;
        }

        public double getRentalRate() {
            return rentalRate;
        }

        public abstract double calculateRentalCost(int days);

        public void displayInfo() {
            System.out.println("Vehicle Number: " + vehicleNumber);
            System.out.println("Type: " + type);
            System.out.println("Rental Rate: $" + rentalRate + " per day");
        }
    }

    // Car class
    class Car extends Vehicle implements Insurable {
        private String insurancePolicyNumber;

        public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
            super(vehicleNumber, "Car", rentalRate);
            this.insurancePolicyNumber = insurancePolicyNumber;
        }

        @Override
        public double calculateRentalCost(int days) {
            return days * rentalRate;
        }

        @Override
        public double calculateInsurance() {
            return 50.0; // fixed insurance cost for Car
        }

        @Override
        public String getInsuranceDetails() {
            return "Car Insurance Policy #: " + insurancePolicyNumber;
        }
    }

    // Bike class
    class Bike extends Vehicle implements Insurable {
        private String insurancePolicyNumber;

        public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
            super(vehicleNumber, "Bike", rentalRate);
            this.insurancePolicyNumber = insurancePolicyNumber;
        }

        @Override
        public double calculateRentalCost(int days) {
            return days * rentalRate;
        }

        @Override
        public double calculateInsurance() {
            return 15.0; // fixed insurance cost for Bike
        }

        @Override
        public String getInsuranceDetails() {
            return "Bike Insurance Policy #: " + insurancePolicyNumber;
        }
    }

    // Truck class
    class Truck extends Vehicle implements Insurable {
        private String insurancePolicyNumber;

        public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
            super(vehicleNumber, "Truck", rentalRate);
            this.insurancePolicyNumber = insurancePolicyNumber;
        }

        @Override
        public double calculateRentalCost(int days) {
            return days * rentalRate + 100; // additional cost for Truck maintenance
        }

        @Override
        public double calculateInsurance() {
            return 100.0; // fixed insurance cost for Truck
        }

        @Override
        public String getInsuranceDetails() {
            return "Truck Insurance Policy #: " + insurancePolicyNumber;
        }
    }

    // Main method for running the program
    public static void main(String[] args) {
        VehicleRentalSystem system = new VehicleRentalSystem();

        Vehicle[] vehicles = {
                system.new Car("CAR123", 40.0, "CAR-INS-001"),
                system.new Bike("BIKE456", 15.0, "BIKE-INS-002"),
                system.new Truck("TRUCK789", 100.0, "TRUCK-INS-003")
        };

        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            System.out.println("===============");
            v.displayInfo();
            double rentalCost = v.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost for " + rentalDays + " days: $" + rentalCost);

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println(ins.getInsuranceDetails());
                System.out.println("Insurance Cost: $" + ins.calculateInsurance());
            }
        }
    }
}
