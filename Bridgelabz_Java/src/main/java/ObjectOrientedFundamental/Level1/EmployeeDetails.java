package ObjectOrientedFundamental.Level1;
import java.util.Scanner;
public class EmployeeDetails {
    String name;
    int id;
    double salary;

    //method to display employee details
    void displayDetails(){
        System.out.println("Employee name: "+ name);
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Salary: "+salary);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //create an EmployeeDetails object
        EmployeeDetails emp=new EmployeeDetails();
        //take input from the user
        System.out.println("Enter the employee name:");
        emp.name=sc.nextLine();

        System.out.print("Enter employee ID: ");
        emp.id = sc.nextInt();

        System.out.print("Enter employee salary: ");
        emp.salary = sc.nextDouble();

        // Display employee details
        emp.displayDetails();

        sc.close();
    }
}
