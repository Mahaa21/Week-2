public class Course {
    String courseName;
    int duration;
    int fee;
    static String instituteName = "Tech Academy";

    public Course (String courseName, int duration, int fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
        System.out.println("-------------------------------------");
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming" , 8, 15000);
        Course c2 = new Course("Web Development", 10, 17000);
        Course c3 = new Course("Data Science" ,12, 25000);

        System.out.println("Course Offered:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();

        updateInstituteName("Skill Boost Academy");

        System.out.println("After Updating Institution Name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();
    }
}
