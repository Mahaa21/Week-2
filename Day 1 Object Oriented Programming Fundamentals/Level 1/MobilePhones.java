public class MobilePhones {

    private String brand;
    private String model;
    private int price;

    public MobilePhones (String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayResult() {
        System.out.println("Car Details: ");
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhones phones = new MobilePhones("BMW", "M340i", 7500000);
        phones.displayResult();
    }
}
