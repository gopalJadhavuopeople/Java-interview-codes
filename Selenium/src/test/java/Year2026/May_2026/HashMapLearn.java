package Year2026.May_2026;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearn {

    public static void main(String[] args) {

        //declare

        HashMap<String, Integer> map = new HashMap<>();
//duplicate keys are not allowed,if keys are duplicate it overrite with recent key
        //duplicate values are allowed
        //  map.put("Gopal", 87000);
        map.put("Prashant", 60000);
        map.put("kanti", 85000);
        map.put("Suresh", 85000);
        map.put("kantilal", 85000);
        map.put("Pankaj", 85000);
        map.put("Gopal", 870000);
        //map.put(null, 55555);
        map.put(null, 44444);
        //map.put(null,43444);
        map.put("ajay", null);
        map.put("vimal", null);
        map.put("komal", null);


        // map.remove("ajay");
      //  System.out.println(map);
//
//        map.get("Ajay");
//        System.out.println(map.get("ramesh"));
//
//        System.out.println(map.containsKey("ajay"));
//        System.out.println(map.containsValue(85000));
//
//        System.out.println(map.size());
//
//        System.out.println(map.isEmpty());

     //  map.clear();

        System.out.println(map);

        //iterator , enry set
//
//        for(Map.Entry<String,Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey() +" "+ entry.getValue());
//        }
        //iterator keyset
        for(String key : map.keySet()){
            System.out.println(key);

        }
        //iterator values

        for(Integer value : map.values()){
            System.out.println(value);

        }



    }
}
