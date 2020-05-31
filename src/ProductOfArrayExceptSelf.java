import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfArrayExceptSelf {

    private static List ArrayProduct(int[] array){
        List<Integer> list = new ArrayList<>();

        int output = Arrays.stream(array).reduce(1, (a, b) -> a * b);

        for(int i = 0; i < array.length; i++){
            int product = output/ array[i];
            list.add(product);
        }
        return list;
    }

    private static List ArrayProduct2(int[] array){
        List<Integer> list = new ArrayList<>();

        return list;
    }

    public static void main(String[] args) {
        int[] array = {4,2,1};
        System.out.println(ArrayProduct(array));
    }
}
