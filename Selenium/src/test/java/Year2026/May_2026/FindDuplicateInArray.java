package Year2026.May_2026;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateInArray {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 2, 4, 5, 1};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : arr) {

            map.put(num, map.getOrDefault(num, 0) + 1);

        }
        for(Map.Entry<Integer,Integer> duplicate : map.entrySet()){
            if(duplicate.getValue()>1){
                System.out.println(duplicate.getKey());
            }

        }
    }
}
