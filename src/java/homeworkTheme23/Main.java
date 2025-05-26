package homeworkTheme23;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // LinkedHashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        // LinkedHashSet
        LinkedHashSet<String> valueSet = new LinkedHashSet<>();
        for (String value : map.values()) {
            valueSet.add(value);
        }

        // LinkedList
        LinkedList<Integer> keyList = new LinkedList<>();
        for (Integer key : map.keySet()) {
            keyList.add(key);
        }

        System.out.println("LinkedHashSet of values: " + valueSet);
        System.out.println("LinkedList of keys: " + keyList);
    }
}