/*
Sample Program 3: Employee Management System
Design an Employee class with the following features:
Static:
A static variable companyName shared by all employees.
A static method displayTotalEmployees() to show the total number of employees.
This:
Use this to initialize name, id, and designation in the constructor.
Final:
Use a final variable id for the employee ID, which cannot be modified after assignment.
Instanceof:
Check if a given object is an instance of the Employee class before printing the employee details.
 */
package ThisStaticFinal;

public class Employee {

    // Static variables
    static String companyName = "PeerIslands";
    static int totalEmployees = 0;

    // Instance variables
    String name;
    final int id;
    String designation;

    // Constructor
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;

        totalEmployees++;
    }

    // Static method
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {

        // Creating Employee objects
        Employee emp1 = new Employee("Rahul", 101, "Software Engineer");
        Employee emp2 = new Employee("Priya", 102, "Java Developer");

        // Checking instanceof
        if (emp1 instanceof Employee) {
            System.out.println("Employee 1 Details:");
            emp1.displayDetails();
        }

        System.out.println();

        if (emp2 instanceof Employee) {
            System.out.println("Employee 2 Details:");
            emp2.displayDetails();
        }

        System.out.println();

        // Display total employees
        Employee.displayTotalEmployees();
    }
}