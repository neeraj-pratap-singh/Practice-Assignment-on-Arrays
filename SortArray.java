// Sort the Array elements in ascending order and descending order
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arrNum = {23, 21, 44, 32, 12};

        // Sorting in ascending order
        Arrays.sort(arrNum);
        System.out.print("The elements in ascending order: ");
        for (int i = 0; i < arrNum.length; i++) {
            System.out.print(arrNum[i]);
            if (i != arrNum.length - 1) {
                System.out.print(", ");
            }
        }

        // Sorting in descending order
        System.out.println();
        System.out.print("The elements in descending order: ");
        for (int i = arrNum.length - 1; i >= 0; i--) {
            System.out.print(arrNum[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }
}
