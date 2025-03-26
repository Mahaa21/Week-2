public class Patient {

    private static String hospitalName = "SMF Hospital";
    private static int totalPatient = 0;
    private final int patientId;

    private String name;
    private int age;
    private String ailment;

    public Patient (String name, int age, String ailment, int patientId) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientId = patientId;
        totalPatient++;
    }

    public static void getTotalPatient() {
        System.out.println("Total Patients: " + totalPatient);
    }

    public void display() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Id: " + patientId);
        System.out.println("Patient Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Navaneethan", 21, "Fever", 100);
        Patient p2 = new Patient("Nax", 25, "Cough", 101);
        Patient p3 = new Patient("Nava" , 30, "Head Ache", 102);

        if(p1 instanceof Patient) {
            System.out.println("Obj is an Instance of Patient");
        }

        p1.display();
        p2.display();
        p3.display();

        getTotalPatient();
    }
}
