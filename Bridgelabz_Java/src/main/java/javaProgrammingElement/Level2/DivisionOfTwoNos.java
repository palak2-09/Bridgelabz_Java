package Level2;
import java.util.Scanner;
public class DivisionOfTwoNos {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int number1=sc.nextInt();
        int number2=sc.nextInt();

        int quotient=number1/number2;
        int remainder=number1%number2;

        System.out.println("The Quotient is "+quotient+
                " and Remainder is " +remainder+
                " of two number "+number1+" and "+number2);
    }
}
