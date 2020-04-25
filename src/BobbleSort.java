import java.util.Scanner;

public class BobbleSort {

    private static String unsortedArray = "";
    private static String sortedArray = "";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // get the number of items to sort from the user
        System.out.println("Enter the number of items you want to sort");
        int capacity = input.nextInt();
        int[] userNumbers = new int[capacity];
        System.out.println("Enter " + capacity + "digits below and press Enter ");
        // prompt the user for 10 numbers
        for (int i = 0; i < capacity; i++) {
            System.out.println("Enter Number here....");
            int num = input.nextInt();
            userNumbers[i] = num;
        }

        // print out each number inside the array
        for (int i = 0; i < userNumbers.length; i++) {
            if (userNumbers.length == 1) {
                unsortedArray += " {" + userNumbers[i] + " }";
            } else {
                if (i == userNumbers.length - 1) {
                    unsortedArray += " ," + userNumbers[i] + " }";
                } else if (i == 0) {
                    unsortedArray += "{" + userNumbers[0];
                } else {
                    unsortedArray += ", " + userNumbers[i];
                }
            }

        }
        // Unsorted Array
        System.out.println();
        System.out.println("The initial array Entered by user is :");
        System.out.println(unsortedArray);

        // Sorted Array
        System.out.println();
        System.out.println("The sorted array is :");
        BobbleAlgorithm(userNumbers);

        // print out the sorted array values
        for (int i = 0; i < userNumbers.length; i++) {
            if (userNumbers.length == 1) {
                sortedArray += " {" + userNumbers[i] + " }";
            } else {
                if (i == userNumbers.length - 1) {
                    sortedArray += " ," + userNumbers[i] + " }";
                } else if (i == 0) {
                    sortedArray += "{" + userNumbers[0];
                } else {
                    sortedArray += ", " + userNumbers[i];
                }
            }

        }
        System.out.println(sortedArray);
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
