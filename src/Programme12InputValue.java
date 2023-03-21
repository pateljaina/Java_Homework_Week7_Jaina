/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;

public class Programme12InputValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);//store entered character
        scanner.close();
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {//condition
            System.out.println(ch + " is A ALPHABET.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is A NUMBER.");
        } else {
            System.out.println(ch + " is A SPECIAL CHARACTER.");
        }

    }
}
