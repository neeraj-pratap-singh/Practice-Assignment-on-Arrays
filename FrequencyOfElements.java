// Find how many elements from Array A are present in the other Array B. and Print their frequencies.
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arrSuperSet = {3, 1, 3, 4, 1, 2, 1, 8, 3, 2, 1, 1, 3, 2, 3, 3, 4};
        int[] arrSubSet = {1, 2, 3, 5, 9};

        Map<Integer, Integer> frequencyMap = calculateFrequency(arrSuperSet, arrSubSet);

        for (int element : arrSubSet) {
            System.out.println("Frequency of " + element + ": " + frequencyMap.getOrDefault(element, 0));
        }
    }

    private static Map<Integer, Integer> calculateFrequency(int[] superSet, int[] subSet) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int element : superSet) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        return frequencyMap;
    }
}
