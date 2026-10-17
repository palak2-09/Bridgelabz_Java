package Level2;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal:");
        double principal=sc.nextDouble();
        System.out.println("Enter the rate:");
        double rate=sc.nextDouble();
        System.out.println("Enter the time duration:");
        double time=sc.nextDouble();

        double simpleInterest=(principal*rate*time)/100;
        System.out.println("The Simple Interest is "+simpleInterest+
                " for Principal "+principal+" , Rate of Interest "+rate+
                " and Time "+time);
    }
}
