import java.util.Arrays;

public class TotalSumArray {

    private  static  Boolean FindArraySum(int[] array, int sum){
        // we first need to sort the array
        Arrays.sort(array);
        boolean found = false;
        int backIndex = array.length - 1;
        int a = 0, b = backIndex;

        for(int x  = 0; x < array.length; x++){
            int i = array[a];
            int j = array[b];
            if(i + j < sum){
                a++;
            }else if(i + j > sum){
                b--;
            }else if(i + j == sum){
                System.out.println("position of sum found at index: "+a + " and at index: " + b);
                found =  true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8,12, 4};
        System.out.println(FindArraySum(arr, 14));
    }
}
