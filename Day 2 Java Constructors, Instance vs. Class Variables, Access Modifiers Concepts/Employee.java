public class Employee {

    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary){
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public void display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.printf("Salary: %.2f\n" , salary);
        System.out.println("------------------------------------");
    }
}

class Manager extends Employee {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.printf("Salary: %.2f\n" , getSalary());
        System.out.println("------------------------------------");
    }
}

class EmployeeRecords {
    public static void main(String[] args) {
        Employee e1 = new Employee(100, "Harry", 27000.00);
        System.out.println("Before updating Salary in main class:");
        e1.display();
        e1.setSalary(93000.00);
        System.out.println("After updating Salary in Main class:");
        e1.display();

        Manager m1 = new Manager(101, "John Dew", 85000.00);
        System.out.println("Before updating Salary in subclass:");
        m1.displayDetails();
        m1.setSalary(58000.00);
        System.out.println("After updating Salary in subclass:");
        m1.displayDetails();
    }
}