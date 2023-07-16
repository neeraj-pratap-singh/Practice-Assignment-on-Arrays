import java.util.Arrays;

public class ArrayMethodsExample {
    public static void main(String[] args) {
        int[] array = {23, 19, 4, 30, 11};

        // length
        int length = array.length;
        System.out.println("Length of the array: " + length);

        // clone
        int[] cloneArray = array.clone();
        System.out.println("Cloned array: " + Arrays.toString(cloneArray));

        // toString
        String arrayString = Arrays.toString(array);
        System.out.println("Array as string: " + arrayString);

        // equals
        int[] compareArray = {23, 19, 4, 30, 11};
        boolean areEqual = Arrays.equals(array, compareArray);
        System.out.println("Are arrays equal? " + areEqual);

        // fill
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 5);
        System.out.println("Filled array: " + Arrays.toString(filledArray));

        // sort
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        // binarySearch
        int index = Arrays.binarySearch(array, 30);
        System.out.println("Index of element 30: " + index);

        // copyOf
        int[] copiedArray = Arrays.copyOf(array, 3);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        // asList
        Integer[] arrayAsList = Arrays.asList(23, 19, 4, 30, 11).toArray(new Integer[0]);
        System.out.println("Array as list: " + Arrays.toString(arrayAsList));
    }
}
