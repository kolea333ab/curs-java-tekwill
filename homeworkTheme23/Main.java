package homeworkTheme23;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаем LinkedHashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(4, "Mango");

        // 1. Значения в LinkedHashSet
        LinkedHashSet<String> valueSet = new LinkedHashSet<>();
        for (String value : map.values()) {
            valueSet.add(value);
        }

        // 2. Ключи в LinkedList
        LinkedList<Integer> keyList = new LinkedList<>();
        for (Integer key : map.keySet()) {
            keyList.add(key);
        }

        // Вывод
        System.out.println("Original LinkedHashMap: " + map);
        System.out.println("Values in LinkedHashSet: " + valueSet);
        System.out.println("Keys in LinkedList: " + keyList);
    }
}
