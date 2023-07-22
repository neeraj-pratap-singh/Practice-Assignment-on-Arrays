// Write a Java program to fill an array with a specific value.
import java.util.Arrays;

public class FillArrayWithValue {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int specificValue = 10;

        // Fill the array with the specific value using Arrays.fill()
        Arrays.fill(numbers, specificValue);

        // Output the array elements
        System.out.println("Array filled with the specific value:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
