import java.util.Arrays;

public class ArrayContainsElementBinarySearch {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int targetElement = 8;

        // Sort the array (Binary search requires a sorted array)
        Arrays.sort(numbers);

        // Check if the array contains the target element using binary search
        boolean containsElement = Arrays.binarySearch(numbers, targetElement) >= 0;

        // Output the result
        if (containsElement) {
            System.out.println("The array contains the element: " + targetElement);
        } else {
            System.out.println("The array does not contain the element: " + targetElement);
        }
    }
}
