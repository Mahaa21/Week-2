import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class Faculty {

    private String facultyName;
    private String facultyId;

    public Faculty(String facultyName, String facultyId) {
        this.facultyName = facultyName;
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void displayFaculty() {
        System.out.println("Faculty Name: " + facultyName + "\nFaculty Id: " + facultyId);
    }
}

class UniversityDepartment {

    private String departmentName;
    private List<Faculty> faculties;

    public UniversityDepartment (String departmentName) {
        this.departmentName = departmentName;
        this.faculties = new ArrayList<>();
    }

    public String getDepartmentName () {
        return departmentName;
    }

    public void addFaculty (Faculty faculty) {
        faculties.add(faculty);
        System.out.println(faculty.getFacultyName() + " with the id (" + faculty.getFacultyId() + ") is added to " + departmentName);
    }

    public void displayFaculties() {
        System.out.println("The faculties handling the " + departmentName + " are:");
        for(Faculty faculty : faculties) {
            faculty.displayFaculty();
        }
    }
}

class University {

    private String universityName;
    private List<UniversityDepartment> departments;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public void addDepartments(UniversityDepartment department) {
        departments.add(department);
        System.out.println(department.getDepartmentName() + " is added to " + universityName);
    }

    public void displayUniversityDetails()  {
        System.out.println("The departments in " + universityName + " are:");
        for (UniversityDepartment department : departments) {
            System.out.println("- " + department.getDepartmentName());
            department.displayFaculties();
            System.out.println();
        }
    }

    public void deleteUniversity() {
        System.out.println("\nDeleting university: " + universityName);
        departments.clear();
    }
}

public class UniversityManagement {

    public static void main(String[] args) {

        University university = new University("SRM University");

        UniversityDepartment department1 = new UniversityDepartment("IT Department");
        UniversityDepartment department2 = new UniversityDepartment("CSE Department");

        university.addDepartments(department1);
        university.addDepartments(department2);
        System.out.println();

        Faculty faculty1 = new Faculty("Mr. Smith", " F001");
        Faculty faculty2 = new Faculty("Mr. Alex", " F002");
        Faculty faculty3 = new Faculty("Mr. Fred", " F003");

        department1.addFaculty(faculty1);
        department2.addFaculty(faculty2);
        department2.addFaculty(faculty3);
        System.out.println();

        university.displayUniversityDetails();

        university.deleteUniversity();

        System.out.println("\nFaculty members still exist after University deletion:");
        faculty1.displayFaculty();
        faculty2.displayFaculty();
        faculty3.displayFaculty();
    }
}