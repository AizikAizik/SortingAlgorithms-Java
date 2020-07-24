import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MergeSort{

    private static String unsortedArray = ""; // initial un-sorted array

    // Main Method
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
        System.out.println(Arrays.toString(MergeSortAlgorithm(userNumbers)));

    }

    // Implementation of merge sort algorithm
    // Space time complexity is O(n log n) at worse case scenario hence making it very efficient
    // Divide and Conquer approach
    private static int[] MergeSortAlgorithm(int[] array){
        int arr_length = array.length; // get the length of array here
        // base case to end recursive loop
        if (arr_length < 2){
            return array; // return default array if less than two items are contained in the array
        }
        // continue execution if the above if statement returns false
        int middleIndex = arr_length / 2; // get the middleIndex in an int variable of the array
        int[] left_half  = new int[middleIndex]; // create the left half of the array from the original array of size of mid index
        int[] right_half = new int[arr_length - middleIndex];// do the same for right array but size of array length minus mid index

        // populate left array with values from original array up to the  value before the mid index value
        int bound = middleIndex - 1;
        for (int i1 = 0; i1 <= bound; i1++) {
            left_half[i1] = array[i1];
        }

        // populate right array with values from original array from mid index value to the end of the array
        IntStream.rangeClosed(middleIndex, arr_length - 1).forEach(i -> right_half[i - middleIndex] = array[i]);

        // perform recursive call on the left array using divide and conquer approach to break down the array complexity and sorts it
        MergeSortAlgorithm(left_half);
        // perform recursive call on the right array using divide and conquer approach to break down the array complexity and sorts it
        MergeSortAlgorithm(right_half);
        // call merge sort helper function and merge both left and right array and override the original array values with the sorted one
        MergeSortHelper(left_half, right_half, array);

        return array; // return sorted array
    }

    // this Function merges two halves of an array into one sorted array
    private static void MergeSortHelper(int[] left_half, int[] right_half, int[] arr){
        int a =0, b = 0, c =0; // initialize all values to zero. they also act as counters for the 3 arrays in the method parameter when looping
        int l_arr = left_half.length; // the left half of the original array
        int r_arr = right_half.length; // the right half of the array

        // loop through both arrays while counter is less than the original length
        while (a < l_arr && b < r_arr){
            // check if left array current index is less than or equal to right array current index
            if (left_half[a] <= right_half[b]){
                arr[c] = left_half[a]; // if true set original array to the left current index value
                c++; // increment original array index counter
                a++; // increment left array index counter only and not the right
            } else {
                arr[c] = right_half[b]; // set original array to right current index value
                c++; // increment original array index counter
                b++; // increment right array index counter only and not the left
            }
        }

        // check if the left array still contains some values inside
        while (a < l_arr){
            arr[c] = left_half[a]; // set the original array to left current index value of variable "a"
            c++; // increment original array index counter "c"
            a++; // increment left array index counter "a"
        }
        // check if the right array still contains some values in it
        while (b < r_arr){
            arr[c] = right_half[b]; // set the original array to the right current index value of variable "b"
            c++; // increment original array index counter "c"
            b++; // increment right array index counter "b"
        }
    }
}