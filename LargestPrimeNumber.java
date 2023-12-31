// Find the largest Prime number in given Array 
public class LargestPrimeNumber {
    public static void main(String[] args) {
        int[] arrNum = {2, 29, 51, 8, 4};

        int largestPrime = -1;

        for (int num : arrNum) {
            if (isPrime(num) && num > largestPrime) {
                largestPrime = num;
            }
        }

        if (largestPrime != -1) {
            System.out.println("The Largest Prime number in the given array: " + largestPrime);
        } else {
            System.out.println("No prime number found in the given array.");
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
