import java.util.HashMap;
import java.util.Scanner;

public class NumberOfAlphabets {
    //Time complexity of these Algorithm is Big O(n) at worse case
    private static HashMap NumOfAlphabets(String s){
        String lower = s.toLowerCase(); // convert thw whole string to lowercase
        String allAlphabets = "abcdefghijklmnopqrstuvwxyz"; // this contains all the alphabets in the English Language
        HashMap<Character, Integer> hashTable = new HashMap<>(); // Create a hashmap data structure that contains key,value pair of all the Alphabets
        // populate the hashmap with all the letters of the Alphabet with a value of 0
        for(int i = 0; i< allAlphabets.length(); i++){
            char c = allAlphabets.charAt(i); // the current character of the alphabet
            hashTable.put(c, 0); // initialize the characters value to zero
        }
        // Check for the number of occurence a character in a string appears
        for (int i = 0; i< lower.length(); i++){
            char c = lower.charAt(i); // the current character of the string we are looping through
            if (hashTable.containsKey(c)){ // if the key exists increment the count value by 1
                hashTable.put(c, hashTable.get(c) + 1);
            }
        }
        return hashTable; // return the hashmap data structure of the number of alphabet occurences
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence to find the number of occurence");
        System.out.print("Enter here: ");
        String sentence = input.nextLine();
        System.out.println();
        System.out.println("The total number of alphabets occured in the sentence you just entered are......");
        System.out.println(NumOfAlphabets(sentence));
    }
}
