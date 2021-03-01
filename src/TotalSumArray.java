import java.util.Arrays;

public class TotalSumArray {

    private  static  Boolean FindArraySum(int[] array, int sum){
        // we first need to sort the array
        Arrays.sort(array);

        System.out.printf("Sorted Array for indexing %s %n", Arrays.toString(array));

        boolean found = false;
        int a = 0, b = array.length - 1;

        if(array[b] + array[b - 1] < sum || array[0] > sum){
            return false;
        }

        for(int x  = 0; x < array.length; x++){
            int i = array[a];
            int j = array[b];
            if(i + j < sum){
                a++;
            }else if(i + j > sum){
                b--;
            }else if(i + j == sum){
                System.out.println("position of sum found at index: "+a + " and at index: " + b );
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
