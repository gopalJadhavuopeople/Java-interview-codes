package Year2026.May_2026;

import java.util.HashMap;
import java.util.Map;

public class HashTableLearn {
    public static void main(String[] args) {
        //hashtable

//        Hashtable<String, Integer> map = new Hashtable<>();
//        map.put("Gopal",85000);
//        map.put("sunil",85000);
//        map.put("radha",84564);
//        map.put(null,87457);
//        map.put("virat",null);
//
//        System.out.println(map);

        //count frequency of characters repeated

        String name = "Gop alo Jadhav";

        char[] chars = name.trim().toCharArray();

        HashMap<Character, Integer> countOfChar = new HashMap<>();


        for (char c : chars) {

            countOfChar.put(c, countOfChar.getOrDefault(c, 0) + 1);

        }


        for (Map.Entry<Character, Integer> count : countOfChar.entrySet()) {

            if (count.getValue() > 1) {
                System.out.println(count.getKey() + " " + count.getValue());
            }
        }
    }
}
