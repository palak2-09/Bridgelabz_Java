package Level1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two floating point numbers:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();

        System.out.println("The addition, subtraction, multiplication " +
                "and division value of 2 numbers "+a+" and "+b+
                " is "+(a+b)+" , "+(a-b)+" , "+(a*b)+" and "+(a/b));
    }
}
