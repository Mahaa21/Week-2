import java.util.ArrayList;
import java.util.List;

class Student {

    private String studentName;
    private String studentId;

    public Student(String studentName, String studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void displayStudent(){
        System.out.println("Student Name:" + studentName + "\nStudent ID: " + studentId);
    }
}

class Course {

    private String courseName;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void enrollStudents(Student student){
        students.add(student);
        System.out.println(student.getStudentName() + " with ID " + student.getStudentId() + " is enrolled to " + courseName);
    }

    public String  getCourseName() {
        return courseName;
    }

    public void displayEnrolledStudent() {
        System.out.println("Students enrolled for " + courseName + " course are: ");
        for (Student student : students) {
            student.displayStudent();
        }
    }
}

class School {

    private String schoolName;
    private List<Course> courses;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
        System.out.println(course.getCourseName() + " course is added to " + schoolName);
    }

    public void displayCourseDetails() {
        System.out.println("The courses in the " + schoolName + " are:");
        for(Course course: courses) {
            System.out.println("-" + course.getCourseName());
        }
    }
}

public class SchoolAndStudent {

    public static void main(String[] args) {

        School school = new School("Saint Laurent High School");

        Course maths = new Course("Mathematics");
        Course science = new Course("Science");

        Student student1 = new Student("Jake", "S101");
        Student student2 = new Student("Paul", "S102");
        Student student3 = new Student("Anna John", "S103");

        school.addCourse(maths);
        school.addCourse(science);
        System.out.println();

        maths.enrollStudents(student1);
        maths.enrollStudents(student2);
        maths.enrollStudents(student3);

        science.enrollStudents(student1);
        science.enrollStudents(student3);
        System.out.println();

        maths.displayEnrolledStudent();
        System.out.println();
        science.displayEnrolledStudent();
        System.out.println();

        school.displayCourseDetails();
    }
}
