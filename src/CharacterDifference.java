import java.util.*;

public class CharacterDifference {

    private static List<Character> Difference(String s1, String s2) {
        HashMap<Character, Integer> hash = new HashMap<>(); // create a hashmap data structure
        List<Character> list = new ArrayList<>(); // create a dynamic list

        String lowercase1 = s1.toLowerCase();
        String lowercase2 = s2.toLowerCase();

        Set<Character> letters = new HashSet<>(); // create a set data structure for the first string
        Set<Character> letters2 = new HashSet<>(); // create a set data structure for the second string

        for (int i = 0; i < lowercase1.length(); i++) {
            letters.add(lowercase1.charAt(i)); // populate the first set with s1 values
        }

        for (int i = 0; i < lowercase2.length(); i++) {
            letters2.add(lowercase2.charAt(i)); // populate the second set with s2 values
        }

        // Iterate through the first set
        letters.forEach((val) ->{
            if (!hash.containsKey(val)) {
                hash.put(val, 0);
            } else {
                hash.put(val, 1);
            }
        });

        // iterate through the second set
        letters2.forEach((val) ->{
            if (!hash.containsKey(val)) {
                hash.put(val, 0);
            } else {
                hash.put(val, 1);
            }
        });

        // iterate through the hash map
        hash.forEach((key, value) -> {
            if(hash.get(key) == 0){
                list.add(key);
            }
        });

        return list; // return the list
    }

    public static void main(String[] args) {
        System.out.println(Difference("aabc", "eibc"));
    }
}
