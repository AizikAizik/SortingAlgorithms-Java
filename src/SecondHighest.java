import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SecondHighest {

    private static int getSecondHighest(int[] arr){
        int max = 0;
        int min = 0;
        List<Number> list = new ArrayList<>();
        if(arr.length == 1){
            list.add(arr[0]);
            return (int) list.get(0);
        }

        if(arr.length == 2){
            list.add(Math.min(arr[0], arr[1]));
            return (int) list.get(0);
        }

        // first find the highest value in the list
        for (int i : arr) {
            if(i >= max){
                max = i;
            }
        }

        //find the second highest value in the array
        for (int num : arr) {
            int diff = max - num;
            if(list.size() != 0){
                if(num != max && diff <= min){
                    list.clear();
                    list.add(num);
                }
            }else{
                min = num;
                list.add(num);
            }
        }
        return (int) list.get(0);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers below");
        for (int i=0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(numbers) + "\n");
        int secondHighestNumber = getSecondHighest(numbers);
        System.out.printf("the second highest number in the list is %d", secondHighestNumber);
    }
}
