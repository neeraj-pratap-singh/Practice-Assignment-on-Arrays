// Find Count, Min, Max and Average values from the given array 
public class ArrayValues {
    public static void main(String[] args) {
        int[] arrNum = {31, 42, 25, 21, 56, 61, 13, 45, 76, 55};

        int minValue = arrNum[0];
        int maxValue = arrNum[0];
        int sum = arrNum[0];
        int count = 1;

        for (int i = 1; i < arrNum.length; i++) {
            if (arrNum[i] < minValue) {
                minValue = arrNum[i];
            }

            if (arrNum[i] > maxValue) {
                maxValue = arrNum[i];
            }

            sum += arrNum[i];
            count++;
        }

        double average = (double) sum / count;

        System.out.println("The element with the Minimum value: " + minValue);
        System.out.println("The element with the Maximum value: " + maxValue);
        System.out.println("Average of all array elements: " + average);
        System.out.println("Total number of array elements: " + count);
    }
}
