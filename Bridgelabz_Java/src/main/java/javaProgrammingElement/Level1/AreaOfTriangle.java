package Level1;
import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base of the triangle in inches:");
        double baseInches=sc.nextDouble();
        System.out.println("Enter the height of the triangle in inches:");
        double heightInches=sc.nextDouble();

        double areaInSquareInches=0.5*baseInches*heightInches;

        double baseCm=baseInches*2.54;
        double heightCm=heightInches*2.54;

        double areaInSquareCm=0.5*baseCm*heightCm;
        System.out.println(
                "The area of the triangle in square inches is " + areaInSquareInches
                        + " and in square centimeters is "
                        + areaInSquareCm
        );
        sc.close();
    }
}
