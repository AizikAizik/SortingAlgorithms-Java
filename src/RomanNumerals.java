import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanNumerals {

    private static String ConvertNumToRomanNumeral(int num){
        LinkedHashMap<Integer, String> romanMap = new LinkedHashMap<>();

        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");

        if (romanMap.containsKey(num)){
            return romanMap.get(num);
        }

        int inputNum = num;
        String output = "";

        while (inputNum > 0){
            for (Map.Entry<Integer, String> entry : romanMap.entrySet()) {
                Integer key = entry.getKey();
                String value = entry.getValue();
                while (inputNum >= key) {
                    output += value;
                    inputNum -= key;
                }
            }
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get converted to Roman Numeral: ");
        int number = input.nextInt();
        System.out.printf("The Roman Numeral of %d is %s%n", number, ConvertNumToRomanNumeral(number));
        input.close();
    }
}
