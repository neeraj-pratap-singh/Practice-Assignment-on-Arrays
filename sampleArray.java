public class sampleArray {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[3];
        arr[0] = 10;        
        arr[1] = 20;
        arr[2] = 30;       
        //  arr[3] = 40;
         System.out.println(arr[2]);
        int[] arr2 = {100, 200, 300};
        System.out.println(arr2[2]);
        String[] arr3 = {"Shadow", "Gon", "Goku", "Luffy"};
        System.out.println(arr3[3]);
        int[] numbers = {1, 2, 3, 4, 5};
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.print(numbers[i] + " ");
        // }
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
