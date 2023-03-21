import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme8AlphabetAtoF {
    static char city;

    public static void main(String[] args) {
        getCityName();
    }

    public static void selectCityInitials() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any alphabet from A to F");
        city = scanner.next().charAt(0);
        scanner.close();
    }

    public static void getCityName() {//nested if else method
        selectCityInitials();//if entered value is upper case/lower case scenario
        if (city == 'A' || city == 'a') {
            System.out.println("Ahmedabad");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Beijing");
        } else if (city == 'C' || city == 'c') {
            System.out.println("Cairo");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Dehli");
        } else if (city == 'E' || city == 'e') {
            System.out.println("Edinburgh");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Frankfurt");
        } else {
            System.out.println("Invalid Entry");
        }
    }
}
