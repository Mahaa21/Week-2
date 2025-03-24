public class Employee {

    private String name;
    private String id;
    private int salary;

    public Employee(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayResult() {
        System.out.println("Employee Details:");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] Args) {
        Employee employee = new Employee("Alex", "A100" , 15000);
        employee.displayResult();
    }
}