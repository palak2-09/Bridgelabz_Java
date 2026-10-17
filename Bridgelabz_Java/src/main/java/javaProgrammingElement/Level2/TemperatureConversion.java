package Level2;
import java.util.Scanner;
public class TemperatureConversion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in celsius:");
        double celsius=sc.nextDouble();

        double fahrenheitResult= (celsius*(9/5))+32;

        System.out.println("The "+celsius+" celsius is "
                +fahrenheitResult+" fahrenheit");
    }
}
