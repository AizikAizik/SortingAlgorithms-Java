import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplicationTable {

    private static ArrayList<ArrayList<Integer>> mainTable = new ArrayList<>();

    private static ArrayList PrintMultiplicationTable(int max_limit, int height){
        ArrayList<Integer> table = new ArrayList<>();
        int multiplier = 1;

        for(int i =1; i <= height; i++ ){
            for (int j = 1; j <= max_limit; j++){
                table.add(i * multiplier);
                multiplier++;
            }
            multiplier = 1; // set multiplier back to 1
        }
        mainTable.add(table);

        return mainTable;
    }

    private static int[][] PrintMultiplicationTable2(int max_limit, int height){
        int[][] table = new int[height][max_limit];
        int multiplier = 1;

        for(int i =1; i <= height; i++ ){
            for (int j = 1; j <= max_limit; j++){
                table[i - 1][j - 1 ] = (i * multiplier);
                multiplier++;
            }
            multiplier = 1; // set multiplier back to 1
        }

        return table;
    }

    public static void main(String[] args) {
        int[][] myArray = PrintMultiplicationTable2(12,12);
//        for(int[] arr : myArray)
//            System.out.println(Arrays.toString(arr));

        for (int i = 0; i < myArray.length; i++){
            for (int j = 0; j < myArray[i].length; j++){
                if(myArray[i][j] < 10){
                    System.out.print(myArray[i][j] + "\t\t\t\t\t\t|");
                }else if(i == myArray.length - 1 && myArray[i][j] >= 10 && myArray[i][j] < 100){
                    if(j == 0){
                        System.out.print(myArray[i][j] + "\t\t\t\t\t|");
                    }else{
                        System.out.print(myArray[i][j] + "\t\t\t\t\t\t|");
                    }
                }
                else if(myArray[i][j] >= 10 && myArray[i][j] < 100){
                    if(i < 10 )
                        System.out.print(myArray[i][j] + "\t\t\t\t\t\t|");
                    else
                        System.out.print(myArray[i][j] + "\t\t\t\t\t|");
                }
                else{
                    System.out.print(myArray[i][j] + "\t\t\t\t\t|");
                }
            }
            System.out.println();
        }
    }
}
