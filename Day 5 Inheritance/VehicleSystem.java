class Vehicle {
    protected int maxSpeed;
    protected String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
interface Refuelable {
    void refuel();
}

// ElectricVehicle class that extends Vehicle and has a charge method
class ElectricVehicle extends Vehicle {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println("Charging the electric vehicle...");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle electricCar = new ElectricVehicle(150, "Tesla Model S");
        PetrolVehicle petrolCar = new PetrolVehicle(180, "Ford Mustang");

        electricCar.displayInfo();
        electricCar.charge();
        System.out.println();

        petrolCar.displayInfo();
        petrolCar.refuel();
    }
}
