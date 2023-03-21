/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

import java.util.Scanner;

public class Programme3MarkSheet {
    public static void main(String[] args) {

        String StudentName, result, grade;//store variables
        int mathM, englishM, scienceM, total, rollno;//store variables
        float percentage;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the students name?     ");
        StudentName = scanner.next();//store students name
        System.out.println("What is the students roll number?");
        rollno = scanner.nextInt();//store roll number

        System.out.println("Please enter the Maths mark value?");
        mathM = scanner.nextInt();
        if (mathM < 0 || mathM > 100) {//to check if marks in between 0 to 100
            System.out.println("Invalid input, marks should be between 0 to 100");
            System.out.println("Please re enter mark  ");
            mathM = scanner.nextInt();
        }
        System.out.println("Please enter the Science mark value?");
        scienceM = scanner.nextInt();
        if (scienceM < 0 || scienceM > 100) {
            System.out.println("Invalid input, marks should be between 0 to 100");
            System.out.println("Please re enter mark  ");
            scienceM = scanner.nextInt();
        }
        System.out.println("Please enter the English mark value?");
        englishM = scanner.nextInt();
        if (englishM < 0 || englishM > 100) {
            System.out.println("Invalid input, marks should be between 0 to 100");
            System.out.println("Please re enter mark  ");
            englishM = scanner.nextInt();
            scanner.close();
        }

        total = mathM + scienceM + englishM;
        System.out.println("Total marks: " + total);
        percentage = total / 3f;
        System.out.println("Percentage: " + percentage);

        if (percentage >= 35 && mathM >= 35 && scienceM >= 35 && englishM >= 35) {//if else method for pass or fail
            System.out.println(" PASS ");
        } else {
            System.out.println(" FAIL ");
        }

        if (percentage >= 80) {//nested if else
            System.out.println("A+");
        } else if (percentage >= 60) {
            System.out.println("A");
        } else if (percentage > 50) {
            System.out.println("B");
        } else if (percentage > 35) {
            System.out.println("C");
        }
    }
}







