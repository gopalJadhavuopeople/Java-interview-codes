package Year2026.May_2026;

import java.util.HashMap;
import java.util.TreeMap;

public class SortInMap {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('A',3);
        map.put('B',1);
        map.put('C',2);

        System.out.println(map);

        TreeMap<Character,Integer> map1 = new TreeMap<>();
        map1.putAll(map);

        System.out.println(map1.descendingMap());
    }
}
