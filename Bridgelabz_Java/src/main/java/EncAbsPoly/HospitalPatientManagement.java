/*
 Hospital Patient Management
Description: Design a system to manage patients in a hospital:
Create an abstract class Patient with fields like patientId, name, and age.
Add an abstract method calculateBill() and a concrete method getPatientDetails().
Extend it into subclasses InPatient and OutPatient, implementing calculateBill() with different billing logic.
Implement an interface MedicalRecord with methods addRecord() and viewRecords().
Use encapsulation to protect sensitive patient data like diagnosis and medical history.
Use polymorphism to handle different patient types and display their billing details dynamically.

 */
package EncAbsPoly;
import java.util.ArrayList;
import java.util.List;

// Interface
interface MedicalRecord {
    void addRecord(String diagnosis);
    void viewRecords();
}

// Abstract class
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    // Sensitive medical data
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        setAge(age);
    }

    // Getters and setters
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Total Bill: Rs. " + calculateBill());
    }

    // Add medical record
    public void addMedicalRecord(String diagnosis) {
        if (diagnosis != null && !diagnosis.isEmpty()) {
            this.diagnosis = diagnosis;
            medicalHistory.add(diagnosis);
            System.out.println("Medical record added successfully.");
        }
    }

    // View medical records
    public void viewMedicalRecords() {
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Medical History: " + medicalHistory);
    }
}

// InPatient class
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int patientId, String name, int age,
                     int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void addRecord(String diagnosis) {
        addMedicalRecord(diagnosis);
    }

    @Override
    public void viewRecords() {
        viewMedicalRecords();
    }
}

// OutPatient class
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private double medicineCharges;

    public OutPatient(int patientId, String name, int age,
                      double consultationFee, double medicineCharges) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicineCharges = medicineCharges;
    }

    @Override
    public double calculateBill() {
        return consultationFee + medicineCharges;
    }

    @Override
    public void addRecord(String diagnosis) {
        addMedicalRecord(diagnosis);
    }

    @Override
    public void viewRecords() {
        viewMedicalRecords();
    }
}

// Main class
public class HospitalPatientManagement {

    public static void main(String[] args) {

        // Creating patient objects
        Patient p1 = new InPatient(101, "Rahul", 45, 5, 2000);

        Patient p2 = new OutPatient(102, "Priya", 30, 500, 800);

        // Adding medical records
        MedicalRecord record1 = (MedicalRecord) p1;
        record1.addRecord("Fever");

        MedicalRecord record2 = (MedicalRecord) p2;
        record2.addRecord("Headache");

        // Polymorphism
        List<Patient> patients = new ArrayList<>();
        patients.add(p1);
        patients.add(p2);

        System.out.println("\n=== Patient Details ===");

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("-------------------------");
        }

        // Viewing medical records
        System.out.println("\n=== Medical Records ===");

        record1.viewRecords();
        System.out.println("-------------------------");

        record2.viewRecords();
    }
}