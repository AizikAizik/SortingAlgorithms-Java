public class SmallArraySub {

    private static int findMinimumSubTotalArray(int total, int[] array){
        int result = Integer.MAX_VALUE;
        int left = 0;
        int array_sum = 0;

        for (int i=0; i < array.length; i++){
            array_sum += array[i];

            while (array_sum >= total){
                result = Math.min(result, (i + 1) - left);
                array_sum -= array[left];
                left++;
            }
        }

        return (result == Integer.MAX_VALUE) ? 0 : result;
    }

    public static void main(String[] args) {
        int[] array = {8, 3, 6, 4, 2,5, 1};
        System.out.println(findMinimumSubTotalArray(7, array));
    }
}
