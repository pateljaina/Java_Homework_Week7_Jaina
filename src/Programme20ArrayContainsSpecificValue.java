/**
 * Write a Java program to test if an array contains a specific value
 */
public class Programme20ArrayContainsSpecificValue {
    public static void main(String[] args) {

        int[] num = {10, 20, 30, 40, 50};//defined array
        int specific = 30;//given specific value
        boolean found = false;

        for (int n : num) {
            if (n == specific) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(specific + " is found in the array.");
        else
            System.out.println(specific + " is not found in the array.");
    }

}
