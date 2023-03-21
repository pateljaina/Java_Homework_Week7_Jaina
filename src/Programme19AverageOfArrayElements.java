/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Programme19AverageOfArrayElements {
    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};     // create an array


        int length = array.length;  // getting array length


        int sum = 0;// default sum value.


        for (int i = 0; i < array.length; i++) { // sum of all values in array using for loop
            sum += array[i];
        }

        double average = sum / length;

        System.out.println("Average of array : " + average);

    }
}
