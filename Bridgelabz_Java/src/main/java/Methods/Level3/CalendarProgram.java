/*
Create a program to display a calendar for a given month and year. The program should take the month and year as input from the user and display the calendar for that month. E.g. for 07 2005 user input, the program should display the calendar as shown below

Hint =>
Write a Method to get the name of the month. For this define a month Array to store the names of the months
Write a Method to get the number of days in the month. For this define a days Array to store the number of days in each month. For Feb month, check for Leap Year to get the number of days. Also, define a Leap Year Method.
Write a method to get the first day of the month using the Gregorian calendar algorithm
y0 = y − (14 − m) / 12
x = y0 + y0/4 − y0/100 + y0/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0 / 12) mod 7
 */
package Methods.Level3;
import java.util.Scanner;

public class CalendarProgram {

    /*
     * Display the calendar for a given month and year.
     * Use arrays to store month names and days in each month.
     * Check leap years to determine the days in February.
     * Calculate the first day using the Gregorian calendar algorithm.
     * Use two for loops to print indentation and display the dates.
     */

    static String[] months = {
            "", "January", "February", "March", "April",
            "May", "June", "July", "August", "September",
            "October", "November", "December"
    };

    static int[] days = {
            0, 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    // Method to get the month name
    public static String getMonthName(int month) {
        return months[month];
    }

    // Method to check whether the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0);
    }

    // Method to get the number of days in the month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return days[month];
    }

    // Method to calculate the first day of the month
    public static int getFirstDay(int month, int year) {
        int d = 1;

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;

        return (d + x + 31 * m0 / 12) % 7;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        int totalDays = getDaysInMonth(month, year);
        int firstDay = getFirstDay(month, year);

        System.out.println("\n     " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // First loop: Print indentation before the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Second loop: Display dates and move to the next line after Saturday
        for (int date = 1; date <= totalDays; date++) {
            System.out.printf("%3d ", date);

            if ((date + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid month or year.");
        } else {
            displayCalendar(month, year);
        }

        sc.close();
    }
}
