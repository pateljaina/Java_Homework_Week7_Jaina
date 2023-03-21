import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 * 9. Same as above program-8 using switch statement
 */
public class Programme9AlphabetAtoFSwitch {
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
    public static void getCityName(){
        selectCityInitials();//switch statement method
        switch (city){
            case 'A':
                System.out.println("Ahmedabad");
                break;
            case 'a':
                System.out.println("Ahmedabad");
                break;
            case 'B':
                System.out.println("Beijing");
                break;
            case 'b':
                System.out.println("Beijing");
                break;
            case 'C':
                System.out.println("Cairo");
                break;
            case 'c':
                System.out.println("Cairo");
                break;
            case 'D':
                System.out.println("Delhi");
                break;
            case 'd':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("Edinburgh");
                break;
            case 'e':
                System.out.println("Edinburgh");
                break;
            case 'F':
                System.out.println("Frankfurt");
                break;
            case 'f':
                System.out.println("Frankfurt");
                break;
            default:
                System.out.println("Invalid Entry");
        }

    }
}
