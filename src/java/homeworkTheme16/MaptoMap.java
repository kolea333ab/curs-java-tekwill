package homeworkTheme16;

import java.util.*;

public class MaptoMap {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Яблоко", 5);
        map1.put("Банан", 3);

        Map<String, Integer> map2 = new HashMap<>(map1);

        System.out.println("Map 2: " + map2);
    }
}