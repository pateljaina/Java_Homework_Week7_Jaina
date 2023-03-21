/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class Programme1OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//declare scanner
        System.out.println("Enter a number:    ");//input value into scanner
        int a = scanner.nextInt();
        String msg = (a % 2 == 0) ? "The number is even!" : "The number is odd!";//return value is even or odd
        System.out.println(msg);//print answer
        scanner.close();

    }
}


