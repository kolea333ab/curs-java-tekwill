package homeworkTheme16;

import java.util.*;

public class QueuetoMap {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("один");
        queue.add("два");
        queue.add("три");

        Map<Integer, String> map = new HashMap<>();
        int index = 1;
        while (!queue.isEmpty()) {
            map.put(index++, queue.poll());
        }

        System.out.println("Map: " + map);
    }
}