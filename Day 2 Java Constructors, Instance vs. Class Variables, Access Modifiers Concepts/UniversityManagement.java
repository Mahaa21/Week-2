class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student (int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double newCGPA) {
        if (newCGPA >= 0.0 && newCGPA <= 10.0) {
            this.CGPA = newCGPA;
        } else {
            System.out.println("Invalid CGPA! Must be between 0.0 and 10.0");
        }
    }

    public void displayStudentInfo () {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostGraduateStudent extends Student {

    private String specialization;

    public PostGraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPGStudentInfo() {
        System.out.println("\nPostgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCGPA());
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Lee Wang", 8.5);
        s1.displayStudentInfo();

        s1.setCGPA(9.2);
        System.out.println("\nUpdated CGPA: " + s1.getCGPA());

        PostGraduateStudent pg1 = new PostGraduateStudent(102, "Rick", 9.0, "Machine Learning");
        pg1.displayPGStudentInfo();
    }
}