import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

public class Programme2LeapYear {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);//declare scanner
        System.out.print("Enter a year:    ");//user to input a year
        int year = scanner.nextInt();//input saved
        boolean isLeapYear;


        isLeapYear = (year % 4 == 0);//divisible by 4


        isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0); // divisible by 4, not by 100, or divisible by 400

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");//true statement
        } else {
            System.out.println(year + " is not a leap year.");//false statement
            scanner.close();
        }
    }

}


