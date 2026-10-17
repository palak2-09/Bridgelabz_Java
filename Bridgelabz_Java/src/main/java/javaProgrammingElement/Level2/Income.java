package Level2;
import java.util.Scanner;
public class Income {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary of a person:");
        double salary=sc.nextDouble();
        System.out.println("Enter the bonus of that person:");
        double bonus=sc.nextDouble();

        double income=salary+bonus;
        System.out.println("The salary is INR "+salary+
                " and bonus is INR "+bonus+
                " .Hence Total Income is INR "+income);
    }
}
