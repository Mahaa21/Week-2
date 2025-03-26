public class Student {

    private static String universityName = "SRM University";
    private static int totalStudents = 0;

    private String name;
    private final int rollNumber;
    private char grade;

    public Student (String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static int displayTotalStudents() {
        return totalStudents;
    }

    public void display() {
        System.out.println("University Name: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("-------------------------------------------");
    }

    public static void main(String[] args) {

        Student s1 = new Student("Navaneethan", 100, 'A');
        if (s1 instanceof Student) {
            System.out.println("s1 is an instance of Student");
        }
        s1.display();

        Student s2 = new Student("Nax", 200, 'B');
        if (s2 instanceof Student) {
            System.out.println("s2 is an instance of Student");
        }
        s2.display();

        Student s3 = new Student("Nava", 300, 'C');
        if (s3 instanceof Student) {
            System.out.println("s3 is an instance of Student");
        }
        s3.display();

        System.out.println("Total Students: " + displayTotalStudents());
    }
}
