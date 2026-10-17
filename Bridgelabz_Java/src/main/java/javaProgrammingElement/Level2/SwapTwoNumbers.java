package Level2;
import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1=sc.nextInt();
        System.out.println("Enter the second number:");
        int number2=sc.nextInt();

        int temp=number1;
        number1=number2;
        number2=temp;

        System.out.println("The swapped numbers are "+
                number1+" and "+number2);
    }
}
