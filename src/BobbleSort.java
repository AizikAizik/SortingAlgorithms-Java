import java.util.Arrays;
import java.util.Scanner;

public class BobbleSort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // get the number of items to sort from the user
        System.out.println("Enter the number of items you want to sort");
        int capacity = input.nextInt();
        int[] userNumbers = new int[capacity];
        System.out.println("Enter " + capacity + "digits below and press Enter ");
        // prompt the user for 10 numbers
        for (int i = 0; i < capacity; i++) {
            System.out.println("Enter Number Below....");
            int num = input.nextInt();
            userNumbers[i] = num;
        }

        // Unsorted Array
        System.out.println();
        System.out.printf("Unsorted Array %s", Arrays.toString(userNumbers));

        System.out.println();

        //sort the Array
        BobbleAlgorithm(userNumbers);

        // print out the sorted array values
        System.out.printf("Sorted Array with Booble sort %s", Arrays.toString(userNumbers));
    }

    // method for sorting Array using Bobble Sort
    // Big 0 notation of O(n**2) hence not very optimal
    private static void BobbleAlgorithm(int[] arr) {
        boolean isSorted = false;
        int lastUnSorted = arr.length - 1; // get the length of array -1 in order to prevent index out of bound exception when comparing

        while (!isSorted) {
            isSorted = true; // set isSorted back to true
            for (int i = 0; i < lastUnSorted; i++) {
                // compare the two index and swap if the previous is greater than the next
                if (arr[i] > arr[i + 1]) {
                    swapArrayIndex(arr, i, i + 1);
                    isSorted = false; // reset is sorted back to false
                }
            }
            lastUnSorted--; // decrement visited last unsorted value in the loop
        }

    }

    // Helper function for performing swap
    private static void swapArrayIndex(int[] arr, int i, int j) {
        int temp = arr[i]; // temp variable
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
