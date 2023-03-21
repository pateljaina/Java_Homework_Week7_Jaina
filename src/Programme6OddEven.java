/**
 * Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class Programme6OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//declare scanner
        System.out.print("Enter a number: ");//Take input from user
        int num = scanner.nextInt();//Store number
        if (num % 2 == 0)//if statement
            System.out.println(num + " is an even number"); //true statement
        else
            System.out.println(num + " is an odd number"); //false statement
        scanner.close();
    }

}

