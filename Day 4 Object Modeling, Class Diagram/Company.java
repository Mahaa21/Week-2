import java.util.ArrayList;
import java.util.List;

class Employee {

    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Id: " + id);
    }
}

class Department {

    private String departmentName;
    private List<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println(employee.name + " is added to the " + departmentName);
    }

    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
        for(Employee emp : employees) {
            emp.displayEmployee();
        }
    }

}

class Company {

    private String companyName;
    private List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
        System.out.println(department + " is added to " + companyName);
    }

    public void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department dept: departments) {
            dept.displayDepartment();
            System.out.println();
        }
    }

}

class CompanyManagement {

    public static void main(String[] args) {

        Company company = new Company("EY GDS");

        Department department1 = new Department("IT Department");
        Department department2 = new Department("HR Department");

        Employee employee1 = new Employee("Navaneethan", 101);
        Employee employee2 = new Employee("Nax", 102);
        Employee employee3 = new Employee("Rick", 201);
        Employee employee4 = new Employee("John", 202);

        department1.addEmployee(employee1);
        department1.addEmployee(employee2);
        System.out.println();

        department2.addEmployee(employee3);
        department2.addEmployee(employee4);
        System.out.println();

        company.addDepartment(department1);
        company.addDepartment(department2);
        System.out.println();

        company.displayCompanyDetails();
    }
}