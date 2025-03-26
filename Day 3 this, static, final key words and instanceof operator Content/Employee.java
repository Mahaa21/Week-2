public class Employee {

    private static String companyName = "EY GDS";
    private static int totalEmployee = 0;
    private String name;
    private final int id;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployee++;
    }

    public static int displayTotalEmployees() {
        return totalEmployee;
    }

    public void display() {
        System.out.println("Employee Info:");
        System.out.println("Company Name: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("-------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Navaneethan", 100, "SAP");
        if (e1 instanceof Employee) {
            System.out.println("e1 is an instance of Employee.");
        }
        e1.display();

        Employee e2 = new Employee("Nax", 101, "Testing");
        if (e2 instanceof Employee) {
            System.out.println("e2 is an instance of Employee.");
        }
        e2.display();

        System.out.println("Total Employee: " + Employee.displayTotalEmployees());
    }
}
