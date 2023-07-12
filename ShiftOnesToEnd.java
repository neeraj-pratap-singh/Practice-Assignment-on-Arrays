// Move all the ones at the end of an Array
public class ShiftOnesToEnd {
    public static void main(String[] args) {
        int[] arrNum = {3, 1, 4, 1, 2, 1, 8, 3, 2, 1};

        int[] shiftedArr = shiftOnesToEnd(arrNum);

        System.out.print("Array elements after moving Ones to end: ");
        for (int i = 0; i < shiftedArr.length; i++) {
            System.out.print(shiftedArr[i]);
            if (i != shiftedArr.length - 1) {
                System.out.print(", ");
            }
        }
    }

    private static int[] shiftOnesToEnd(int[] arr) {
        int countOnes = 0;

        for (int num : arr) {
            if (num == 1) {
                countOnes++;
            }
        }

        int[] shiftedArr = new int[arr.length];

        int index = 0;
        for (int num : arr) {
            if (num != 1) {
                shiftedArr[index++] = num;
            }
        }

        for (int i = 0; i < countOnes; i++) {
            shiftedArr[index++] = 1;
        }

        return shiftedArr;
    }
}
