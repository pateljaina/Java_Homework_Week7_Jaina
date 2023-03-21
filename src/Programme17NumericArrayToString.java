import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Programme17NumericArrayToString {
    public static void main(String[] args) {
        int[] my_array1 = {47, 67, 54, 98, 23, 12, 66, 77, 9, 2};//store array

        String[] my_array2 = {"Cat", "Dog", "Mouse", "Rabbit", "Cow", "Pig"};

        System.out.println("Original numeric array : " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);//sorting numerical order
        System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));

        System.out.println("Original string array : " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);//sorting alphabetical order
        System.out.println("Sorted string array : " + Arrays.toString(my_array2));
    }
}


