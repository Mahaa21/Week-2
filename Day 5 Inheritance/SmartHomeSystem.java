import java.util.Scanner;

class Device {
    protected String deviceId;
    protected String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Device ID: ");
        String deviceId = scanner.nextLine();

        System.out.print("Enter Status (Online/Offline): ");
        String status = scanner.nextLine();

        System.out.print("Enter Temperature Setting: ");
        double temperature = scanner.nextDouble();

        Thermostat thermostat = new Thermostat(deviceId, status, temperature);
        System.out.println("\nDevice Information:");
        thermostat.displayStatus();

        scanner.close();
    }
}
