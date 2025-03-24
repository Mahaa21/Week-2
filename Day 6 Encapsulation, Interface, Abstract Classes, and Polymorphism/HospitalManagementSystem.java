// Interface for managing medical records
interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

// Abstract class for Patient details
abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis; // Sensitive data, accessed through methods

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Getter and setter for encapsulating sensitive data
    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // Abstract method to calculate medical bill
    public abstract double calculateBill();

    // Concrete method to display basic patient details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// InPatient class implementing Patient and MedicalRecord interface
class InPatient extends Patient implements MedicalRecord {
    private int roomCharge;
    private int daysAdmitted;
    private String medicalHistory;

    public InPatient(String patientId, String name, int age, String diagnosis, int roomCharge, int daysAdmitted) {
        super(patientId, name, age, diagnosis);
        this.roomCharge = roomCharge;
        this.daysAdmitted = daysAdmitted;
        this.medicalHistory = "";
    }

    @Override
    public double calculateBill() {
        // Calculate bill for in-patient: room charges + treatment charges
        double treatmentCharges = 1000.0; // Fixed treatment charges for simplicity
        return (roomCharge * daysAdmitted) + treatmentCharges;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n"; // Add new record to medical history
    }

    @Override
    public String viewRecords() {
        return medicalHistory;
    }
}

// OutPatient class implementing Patient and MedicalRecord interface
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String medicalHistory;

    public OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
        this.medicalHistory = "";
    }

    @Override
    public double calculateBill() {
        // Calculate bill for out-patient: consultation fee + treatment charges
        double treatmentCharges = 500.0; // Fixed treatment charges for simplicity
        return consultationFee + treatmentCharges;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n"; // Add new record to medical history
    }

    @Override
    public String viewRecords() {
        return medicalHistory;
    }
}

// Main class to simulate Hospital Patient Management
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create instances of InPatient and OutPatient
        Patient inPatient = new InPatient("IP123", "John Doe", 45, "Pneumonia", 200, 5);
        Patient outPatient = new OutPatient("OP456", "Jane Smith", 30, "Flu", 100);

        // Polymorphism in action: Dynamic handling of different patient types
        processPatient(inPatient);
        processPatient(outPatient);
    }

    // Method to process different types of patients
    public static void processPatient(Patient patient) {
        patient.getPatientDetails();  // Display patient basic details
        System.out.println("Total Bill: $" + patient.calculateBill());

        if (patient instanceof MedicalRecord) {
            MedicalRecord recordPatient = (MedicalRecord) patient;
            recordPatient.addRecord("Patient received treatment for the diagnosis.");
            System.out.println("Medical History: \n" + recordPatient.viewRecords());
        }

        System.out.println("=============================");
    }
}
