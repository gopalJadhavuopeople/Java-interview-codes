package Year2026.May_2026;

import java.util.HashMap;
import java.util.Map;

public class CountOfWords {
    public static void main(String[] args) {
//        String s = "I love java and java is easy";
//        String[] words = s.split(" ");
//
//        HashMap<String,Integer> map = new HashMap<>();
//        for(String word:words){
//            map.put(word,map.getOrDefault(word,0)+1);
//
//        }
//        for(Map.Entry<String,Integer> count : map.entrySet()){
//
//            System.out.println(count.getKey() +" "+ count.getValue());
//
//        }

        //find first non repeated character

        String ss = "swiss";

        char[] chars = ss.toCharArray();

        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char c : chars) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);


        }
        for (Map.Entry<Character, Integer> count : map1.entrySet()) {

            if (count.getValue() == 1) {


                System.out.println(count.getKey() + " " + count.getValue());
                break;

            }


        }
    }}
