package Level1;
import java.util.Scanner;
public class UniversityFeeWithInput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the university fee:");
        double fee=sc.nextDouble();
        System.out.println("Enter the discount percentage:");
        double discountPercentage=sc.nextDouble();

        double discountAmount=fee*(discountPercentage/100);
        double discountedFee=fee-discountAmount;

        System.out.println("The discount amount is INR "+discountAmount+
                " and final discounted fee is INR "+discountedFee);
    }
}
