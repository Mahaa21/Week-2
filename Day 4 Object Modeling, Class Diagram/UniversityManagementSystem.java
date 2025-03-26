import java.util.ArrayList;
import java.util.List;

class Courses {
    private String courseName;
    private Professor professor;
    private List<Students> enrolledStudents;

    public Courses(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println(professor.getName() + " is assigned to teach " + courseName);
    }

    public void enrollStudent(Students student) {
        enrolledStudents.add(student);
        System.out.println(student.getName() + " enrolled in " + courseName);
    }

    public void displayCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        System.out.println("Professor: " + professor.getName());
        System.out.println("Enrolled Students:");
        for (Students student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Students {
    private String name;
    private List<Courses> courses;

    public Students(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Courses course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void displayStudentCourses() {
        System.out.println("\nStudent: " + name);
        System.out.println("Enrolled Courses:");
        for (Courses course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Smith");
        Professor prof2 = new Professor("Dr. Brown");

        Courses course1 = new Courses("Computer Science");
        Courses course2 = new Courses("Mathematics");

        course1.assignProfessor(prof1);
        course2.assignProfessor(prof2);
        System.out.println();

        Students student1 = new Students("Navaneethan");
        Students student2 = new Students("Nax");

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);
        System.out.println();

        course1.displayCourseDetails();
        course2.displayCourseDetails();
        System.out.println();

        student1.displayStudentCourses();
        student2.displayStudentCourses();
    }
}
