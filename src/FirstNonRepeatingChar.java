import java.util.HashMap;

public class FirstNonRepeatingChar {

    // This algorithm takes 0(n) to be completed
    private static char FindFirst(String s){
        String lower =  s.toLowerCase(); // convert the whole characters to lower case
        char notFound = '_'; // default value to return for no non occurent value is returned
        HashMap<Character, Integer> hashTable = new HashMap<>();// create a hashmap to contain key, value pair
        // loop to through the string to populate the hashTable
        for (int i = 0; i < lower.length(); i++){
            char c = lower.charAt(i); // get the current character
            if(hashTable.containsKey(c)){ // check if the key already exists
                hashTable.put(c, hashTable.get(c) + 1);  // increment the key occurence value by 1
            } else{
                hashTable.put(c, 1);
            }
        }
        // loop through the string to find first non repeating character
        for(int i =0; i < lower.length(); i++){
            char c = lower.charAt(i); // get the current single character in the string
            if(hashTable.get(c) == 1)
                return c; // return the first non repeating char if occurence is 1
        }
        System.out.println(hashTable);
        // return the default if no single no occurent character is found in the string
        return notFound;
    }

    public static void main(String[] args) {
        System.out.println(FindFirst("dbaadcceeff"));
    }
}
