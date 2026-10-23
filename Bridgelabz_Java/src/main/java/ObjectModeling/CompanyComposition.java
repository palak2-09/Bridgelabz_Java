/*
Problem 3: Company and Departments (Composition)
Description: A Company has several Department objects, and each department contains Employee objects. Model this using composition, where deleting a company should also delete all departments and employees.
Tasks:
Define a Company class that contains multiple Department objects.
Define an Employee class within each Department.
Show the composition relationship by ensuring that when a Company object is deleted, all associated Department and Employee objects are also removed.
Goal: Understand composition by implementing a relationship where Department and Employee objects cannot exist without a Company.

 */

package ObjectModeling;
/*
    This program demonstrates composition between Company, Department,
    and Employee classes.

    A Company contains multiple Departments, and each Department
    contains multiple Employees.

    The Company creates and manages its Departments and Employees.
*/
import java.util.ArrayList;
import java.util.List;

class Employee {
    String employeeName;
    int employeeId;

    Employee(String employeeName, int employeeId) {
        // Initialize employee details
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    // Display employee details
    public void displayEmployee() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Department {
    String departmentName;
    List<Employee> employees;

    Department(String departmentName) {
        // Initialize department details
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Create and add an employee to this department
    public void addEmployee(String employeeName, int employeeId) {
        Employee employee = new Employee(employeeName, employeeId);
        employees.add(employee);
    }

    // Display department and employee details
    public void displayDepartment() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("Employees:");

        for (Employee employee : employees) {
            employee.displayEmployee();
            System.out.println();
        }
    }
}

class Company {
    String companyName;
    List<Department> departments;

    Company(String companyName) {
        // Initialize company details
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Create and add a department to the company
    public void addDepartment(String departmentName) {
        Department department = new Department(departmentName);
        departments.add(department);
    }

    // Find a department by name
    public Department findDepartment(String departmentName) {
        for (Department department : departments) {
            if (department.departmentName.equals(departmentName)) {
                return department;
            }
        }

        return null;
    }

    // Display company, department, and employee details
    public void displayCompany() {
        System.out.println("Company Name: " + companyName);

        for (Department department : departments) {
            department.displayDepartment();
            System.out.println();
        }
    }
}

public class CompanyComposition {
    public static void main(String[] args) {

        // Create a company
        Company company = new Company("Tech Solutions");

        // Create departments inside the company
        company.addDepartment("IT");
        company.addDepartment("HR");

        // Find departments
        Department itDepartment = company.findDepartment("IT");
        Department hrDepartment = company.findDepartment("HR");

        // Add employees to the IT department
        itDepartment.addEmployee("Rahul", 101);
        itDepartment.addEmployee("Priya", 102);

        // Add employees to the HR department
        hrDepartment.addEmployee("Akhil", 103);
        hrDepartment.addEmployee("Sneha", 104);

        // Display all company details
        company.displayCompany();

        // Delete the company's reference
        company = null;

        System.out.println("Company reference has been deleted.");
    }
}