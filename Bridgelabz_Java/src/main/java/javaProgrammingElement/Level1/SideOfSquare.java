package Level1;
import java.util.Scanner;
public class SideOfSquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the perimeter of square:");
        int perimeter=sc.nextInt();

        int lengthOfSide=perimeter/4;
        System.out.print("The length of the side is "+lengthOfSide+
                " whose perimeter is "+perimeter);
    }
}
