/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

import java.util.Scanner;

public class Programme10Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//declare scanner

        System.out.println("Enter the first number:        ");//store first number
        int a = scanner.nextInt();
        System.out.println("Enter the second number:     ");//store second number
        int b = scanner.nextInt();

        System.out.println("Choose and Enter the type of operation you want to perform (+, -, *, /, %) ");
        char op = scanner.next().charAt(0);//store operation type
        solve(a, b, op);
        scanner.close();
    }

    public static void solve(int a, int b, char op) {
        int ans = 0;//using else if method
        // addition
        if (op == '+') {
            ans = a + b;
            // subtraction
        } else if (op == '-') {
            ans = a - b;
            // multiplication
        } else if (op == '*') {
            ans = a * b;
            // modulo
        } else if (op == '%') {
            ans = a % b;
            // division
        } else if (op == '/') {
            ans = a / b;
        }

        // printing the final result
        System.out.println("Your answer is:     " + ans);//answer displayed to user
    }
}

