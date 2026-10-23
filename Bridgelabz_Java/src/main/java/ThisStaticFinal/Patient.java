/*
Sample Program 7: Hospital Management System
Create a Patient class with the following features:
Static:
A static variable hospitalName shared among all patients.
A static method getTotalPatients() to count the total patients admitted.
This:
Use this to initialize name, age, and ailment in the constructor.
Final:
Use a final variable patientID to uniquely identify each patient.
Instanceof:
Check if an object is an instance of the Patient class before displaying its details.

 */
package ThisStaticFinal;

public class Patient {

    // Static variables
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    // Instance variables
    String name;
    int age;
    String ailment;
    final int patientID;

    // Constructor
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;

        totalPatients++;
    }

    // Static method to display total patients
    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    // Method to display patient details
    public void displayDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Patient ID: " + patientID);
    }

    public static void main(String[] args) {

        // Creating Patient objects
        Patient patient1 = new Patient("Rahul", 25, "Fever", 101);
        Patient patient2 = new Patient("Priya", 30, "Cold", 102);

        // Checking instanceof before displaying details
        if (patient1 instanceof Patient) {
            System.out.println("Patient 1 Details:");
            patient1.displayDetails();
        }

        System.out.println();

        if (patient2 instanceof Patient) {
            System.out.println("Patient 2 Details:");
            patient2.displayDetails();
        }

        System.out.println();

        // Display total patients
        Patient.getTotalPatients();
    }
}
