package ObjectOrientedFundamental.Level1;

import java.util.Scanner;

public class Circle {
    double radius;

    //method to calculate and display area
    void calculateArea(){
        double area=Math.PI*radius*radius;
        System.out.println("Area of circle: "+area);
    }

    //method to calculate and display circumference
    void calculateCircumference(){
        double circumference=2*Math.PI*radius;
        System.out.println("Circumference of circle: "+circumference);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //create a circle object
        Circle c=new Circle();

        //take radius as input
        System.out.println("Enter radius:");
        c.radius=sc.nextDouble();

        //display area nd circumference
        c.calculateArea();
        c.calculateCircumference();
        sc.close();
    }

}
