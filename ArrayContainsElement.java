// Write a Java program to check if an array contains a specific element.
public class ArrayContainsElement {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int targetElement = 8;

        boolean containsElement = false;

        // Check if the array contains the target element
        for (int number : numbers) {
            if (number == targetElement) {
                containsElement = true;
                break;
            }
        }

        // Output the result
        if (containsElement) {
            System.out.println("The array contains the element: " + targetElement);
        } else {
            System.out.println("The array does not contain the element: " + targetElement);
        }
    }
}

