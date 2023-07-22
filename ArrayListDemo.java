import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(25);

        // Print the ArrayList
        System.out.println("ArrayList: " + numbers);

        // Get the size of the ArrayList using size()
        int size = numbers.size();
        System.out.println("Size of ArrayList: " + size);

        // Check if the ArrayList is empty using isEmpty()
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is the ArrayList empty? " + isEmpty);

        // Access elements by index using get()
        int elementAtIndex = numbers.get(2);
        System.out.println("Element at index 2: " + elementAtIndex);

        // Modify an element using set()
        numbers.set(3, 30);
        System.out.println("ArrayList after setting element at index 3: " + numbers);

        // Check if an element exists in the ArrayList using contains()
        boolean containsElement = numbers.contains(20);
        System.out.println("Does the ArrayList contain 20? " + containsElement);

        // Find the index of an element using indexOf()
        int index = numbers.indexOf(25);
        System.out.println("Index of 25: " + index);

        // Remove an element by index using remove()
        numbers.remove(1);
        System.out.println("ArrayList after removing element at index 1: " + numbers);

        // Remove an element by value using remove()
        numbers.remove(Integer.valueOf(30));
        System.out.println("ArrayList after removing value 30: " + numbers);

        // Clear the ArrayList using clear()
        numbers.clear();
        System.out.println("ArrayList after clearing: " + numbers);

        // Adding elements to the ArrayList after clearing
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        // Sort the ArrayList using Collections.sort()
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

        // Reverse array using reverse()
        Collections.reverse(numbers);
        System.out.println("reverse ArrayList: " + numbers);

        // Shuffle array using shuffle()
        Collections.shuffle(numbers);
        System.out.println("reverse ArrayList: " + numbers);
    }
}
