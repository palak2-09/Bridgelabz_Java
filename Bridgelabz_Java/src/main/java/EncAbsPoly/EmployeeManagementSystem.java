/*
1. Employee Management System
Description: Build an employee management system with the following requirements:
Use an abstract class Employee with fields like employeeId, name, and baseSalary.
Provide an abstract method calculateSalary() and a concrete method displayDetails().
Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
Use encapsulation to restrict direct access to fields and provide getter and setter methods.
Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.
 */
package EncAbsPoly;

import java.util.ArrayList;
import java.util.List;

// Interface
interface Department {
    void assignDepartment(String department);
    String getDepartmentDetails();
}

// Abstract class
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters and setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        }
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Final Salary: " + calculateSalary());
    }
}

// Full-time employee
class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

// Part-time employee
class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(int employeeId, String name,
                            int hoursWorked, double hourlyRate) {
        super(employeeId, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {

        // Creating employee objects
        FullTimeEmployee e1 =
                new FullTimeEmployee(101, "Rahul", 50000);

        PartTimeEmployee e2 =
                new PartTimeEmployee(102, "Priya", 80, 300);

        // Assigning departments
        e1.assignDepartment("IT");
        e2.assignDepartment("Human Resources");

        // Polymorphism: Employee reference stores different employee types
        List<Employee> employees = new ArrayList<>();

        employees.add(e1);
        employees.add(e2);

        // Displaying employee details
        for (Employee employee : employees) {
            employee.displayDetails();

            Department department = (Department) employee;
            System.out.println("Department: "
                    + department.getDepartmentDetails());

            System.out.println("-------------------------");
        }
    }
}
