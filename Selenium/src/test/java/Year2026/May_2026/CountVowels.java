package Year2026.May_2026;

import java.util.HashMap;

public class CountVowels {

    public static void main(String[] args) {


        String s = "Automation Testing";
       char[] chars =  s.toLowerCase().toCharArray();

       int count  = 0;


        //count vowels

        //a,i,e,o,u

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch :chars){
            if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch =='u'){
                map.put(ch, map.getOrDefault(ch,0)+1);
                count ++;

            }

        }
        System.out.println(map);
        System.out.println("Total Vowels :" + count);


    }
}
