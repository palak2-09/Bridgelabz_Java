package Level2;
import java.util.Scanner;
public class TemperatureConversion2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit:");
        double fahrenheit=sc.nextDouble();

        double celsiusResult=(fahrenheit-32)*(5.0/9.0);
        System.out.println("The "+fahrenheit +" fahrenheit is "
                +celsiusResult +" celsius");
    }
}
