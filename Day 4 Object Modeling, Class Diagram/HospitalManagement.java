import java.util.ArrayList;
import java.util.List;

class Patient {

    private String patientName;
    private String patientId;
    private List<Doctor> doctors;

    public Patient(String patientName, String patientId) {
        this.patientName = patientName;
        this.patientId = patientId;
        this.doctors =  new ArrayList<>();
    }

    public String getPatientName() {
        return patientName;
    }

    public void consultDoctor(Doctor doctor) {
        doctors.add(doctor);
        doctor.assignDoctor(this); // Establishing bidirectional association
        System.out.println(patientName + " is consulting Dr. " + doctor.getDoctorName());
    }

    public void displayPatient() {
        System.out.println("Patient Name: " + patientName + "\nPatient Id: " + patientId);
    }

    public void displayDoctors() {
        System.out.println("\nPatient: " + patientName + " (ID: " + patientId + ") has consulted:");
        for (Doctor doctor : doctors) {
            System.out.println("- Dr. " + doctor.getDoctorName());
        }
    }
}

class Doctor {

    public String doctorName;
    public List<Patient> patients;

    public Doctor(String doctorName) {
        this.doctorName = doctorName;
        this.patients = new ArrayList<>();
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void assignDoctor(Patient patient) {
        patients.add(patient);
        System.out.println(doctorName + " is assigned to " + patient.getPatientName());
    }

    public void displayPatient() {
        System.out.println("The patients of " + doctorName + " are:");
        for(Patient patient: patients) {
            patient.displayPatient();
        }
    }
}

class Hospital {

    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;


    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctors(Doctor doctor) {
        doctors.add(doctor);
        System.out.println(doctor.getDoctorName() + " is hired at " + hospitalName);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient " + patient.getPatientName() + " added to " + hospitalName);
    }

    public void displayHospitalDetails() {
        System.out.println("The list of doctors in the hospital:");
        for (Doctor doctor: doctors) {
            System.out.println("- " + doctor.getDoctorName());
            doctor.displayPatient();
        }
    }
}

public class HospitalManagement {

    public static void main(String[] args) {

        Hospital hospital = new Hospital("SMF Hospital");

        Doctor doctor1 = new Doctor("Dr. Navaneethan");
        Doctor doctor2 = new Doctor("Dr. Nax");

        Patient patient1 = new Patient("Rick", "P101");
        Patient patient2 = new Patient("John", "P102");

        hospital.addDoctors(doctor1);
        hospital.addDoctors(doctor2);
        System.out.println();

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        System.out.println();

        doctor1.assignDoctor(patient1);
        doctor2.assignDoctor(patient2);
        System.out.println();

        patient1.consultDoctor(doctor1);
        patient1.consultDoctor(doctor2);
        patient2.consultDoctor(doctor2);
        System.out.println()
        ;
        doctor1.displayPatient();
        doctor2.displayPatient();
        patient1.displayDoctors();
        patient2.displayDoctors();
        System.out.println();

        hospital.displayHospitalDetails();

    }
}

