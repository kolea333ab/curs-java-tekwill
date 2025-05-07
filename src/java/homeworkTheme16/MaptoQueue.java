package homeworkTheme16;

import java.util.*;

public class MaptoQueue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("СОБАКА", 1);
        map.put("КОШКА", 2);

        Queue<Map.Entry<String, Integer>> queue = new LinkedList<>(map.entrySet());

        System.out.println("Queue: " + queue);
    }
}
