import java.util.Random;

public class Student {

    private String name;
    private String rollNumber;
    private int[] marks;

    public Student (String name, String rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public static int Marks (int[] marks) {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }

    public char Grades (int[] marks) {
        double total = (double) Marks(marks) / marks.length;
        char grade= ' ';
        if (total >= 80) {
            grade = 'A';
        }
        else if (total >= 70 && total<= 79) {
            grade = 'B';
        }
        else if (total >= 60 && total<= 69) {
            grade = 'C';
        }
        else if (total >= 50 && total<= 59) {
            grade = 'D';
        }
        else if (total >= 40 && total<= 49) {
            grade = 'E';
        }
        else {
            grade = 'F';
        }
        return grade;
    }

    public void displayDetails(){
        System.out.println("Students Details :");
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);
        for (int rows : marks) {
            System.out.println("Mark: " + rows);
        }
        System.out.println("Total mark: " + Marks(marks));
        System.out.println("Grade: " + Grades(marks));

    }

    public static void main(String[] Args) {
        Random random = new Random();
        int[] mark = new int[3];
        for (int i = 0; i < 3; i++){
            mark[i] = random.nextInt(100);
        }
        Student student = new Student("Alex", "N100" , mark);
        student.displayDetails();
    }
}
