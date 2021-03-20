import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortKArrayProblem {

    static int[] sortKMessedArray(int[] arr, int k) {
        // your code goes here
        int windowSize = k + 1;
        int x = 0;

        for(int i = 0; i <= arr.length - 1; i++){
            for(int j = x; j < windowSize; j++){
                if(j > arr.length){
                    break;
                }
                else if(i + 1 == arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break;
                }
            }
            windowSize++;
            x++;
        }

        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 2, 3, 7, 8, 6, 10, 9 };
        System.out.println(Arrays.toString(sortKMessedArray(arr, 2)));
    }
}
