/*
or || operators
Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines
Hint =>
Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks
 */
package javaControlFlow.Level2;
import java.util.Scanner;
public class MarksAndGrade {
    public static void main(String[] args){
        /*
        Here we need to take marks of three subjects as input from the user
        then calculate the percentage by combining the three subjects and then giving remarks
         */
        Scanner sc=new Scanner(System.in);
        //taking marks of three subjects as input from the user
        System.out.println("Enter Physics marks:");
        double physics=sc.nextDouble();
        System.out.println("Enter Chemistry marks:");
        double chemistry=sc.nextDouble();
        System.out.println("Enter Maths marks:");
        double maths=sc.nextDouble();

        double total=physics+chemistry+maths;
        double average=total/3;
        double percentage=(total/300)*100;

        //determine grade and remarks
        String grade;
        String remarks;

        if(percentage>=80){
            grade="A";
            remarks="Level 4, above agency-normalised standards";
        }
        else if(percentage>=70 && percentage<=79){
            grade="B";
            remarks="Level 3, at agency-normalised standards";
        }
        else if(percentage>=60 && percentage<=69){
            grade="C";
            remarks="Level 2, below, but approaching agency-normalised standards";
        }
        else if(percentage>=50 && percentage<=59){
            grade="D";
            remarks="Level 1, well below agency-normalised standards";
        }
        else if(percentage>=40 && percentage<=49){
            grade="E";
            remarks="Level 1-, too below agency-normalised standards";
        }
        else{
            grade="R";
            remarks="Remedial Students";
        }
        //displaying the final results
        System.out.println("Total marks: "+total+" /300");
        System.out.println("Average marks: "+average);
        System.out.println("Percenatge: "+percentage);
        System.out.println("Grade: "+grade);
        System.out.println("Remarks: "+remarks);

        sc.close();

    }
}
