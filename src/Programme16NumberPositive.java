import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme16NumberPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//declare scanner
        System.out.println("Enter a number:      ");//number stored
        int a = scanner.nextInt();
        //check if number is positive, negative or zero
        if (a > 0)//else if method
            System.out.println(a + " is POSITIVE NUMBER.");
        else if (a < 0)
            System.out.println(a + " is NEGATIVE NUMBER.");
        else
            System.out.println(a + " is a ZERO.");
        scanner.close();

    }

}


