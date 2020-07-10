import java.util.Arrays;

public class PancakeSort {

    // Time complexity of this algorithm is Big O(k /2) and space complexity is Big O(n)
    private static void flip(int[] arr, int k){
        if(arr == null || arr.length < 2){
            return;
        }

        if(k % 2 == 0){
            for (int i = 0; i <= k / 2; i++){
                int temp = arr[i];
                arr[i] = arr[k - 1];
                arr[k -1] = temp;
                k--;
            }
        } else{
            for (int i = 0; i < k / 2; i++){
                int temp = arr[i];
                arr[i] = arr[k - 1];
                arr[k -1] = temp;
                k--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static int[] PancakeSorting(int[] arr){

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,7,1,21,0};
        flip(arr, 5);
    }
}
