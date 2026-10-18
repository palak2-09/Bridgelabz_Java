/*
Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):
y0 = y − (14 − m) / 12
x = y0 + y0/4 − y0/100 + y0/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0 / 12) mod 7
 */
package javaControlFlow.Level3;
import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /*
        1. Take month, day, and year as input using Scanner.
        2. Calculate y0, x, and m0 using the given formulas.
        3. Calculate d0 to determine the day of the week.
        4. Use if-else statements to display the corresponding day.
        5. The result ranges from 0 (Sunday) to 6 (Saturday).
        */
        //get month,day and year from the user
        System.out.println("Enter month(1-12)");
        int m=sc.nextInt();

        System.out.println("Enter day:");
        int d=sc.nextInt();

        System.out.println("Enter year:");
        int y=sc.nextInt();

        // Calculate the year
        int y0 = y - (14 - m) / 12;

        // Calculate x using the given formula
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Calculate the adjusted month
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Calculate the day of the week
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Display the corresponding day
        if (d0 == 0) {
            System.out.println("Sunday");
        } else if (d0 == 1) {
            System.out.println("Monday");
        } else if (d0 == 2) {
            System.out.println("Tuesday");
        } else if (d0 == 3) {
            System.out.println("Wednesday");
        } else if (d0 == 4) {
            System.out.println("Thursday");
        } else if (d0 == 5) {
            System.out.println("Friday");
        } else {
            System.out.println("Saturday");
        }
        sc.close();
    }
}
