package Year2026.May_2026;

import java.util.LinkedHashMap;

public class LinkedHashMapLearn {
    public static void main(String[] args) {


        //duplicate keys are not allowed
        //duplicate values are allowed
        //insertion order mentained

        LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<>();

        linkedMap.put("Gopal",85000);
        linkedMap.put("vaishu",85000);

        System.out.println(linkedMap);
    }
}
