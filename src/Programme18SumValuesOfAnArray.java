/**
 * Write a Java program to sum values of an array.
 */
public class Programme18SumValuesOfAnArray {
    public static void main(String[] args) {
        //Initialise array
        int[] arr = new int[]{5, 6, 7, 8, 9};
        int sum = 0;
        //Loop through the array to calculate sum of elements
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}
