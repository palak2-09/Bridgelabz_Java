package Level1;
import java.util.Scanner;
public class Height {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height in centimeters:");
        double height=sc.nextDouble();
        double heightInInches = height/2.54;
        double heightInFoot = heightInInches/12;

        System.out.println("Your Height in cm is "+height+
                " while in feet is "+heightInFoot+
                " and inches is "+heightInInches);
    }

}
