package homeworkTheme16;

import java.util.*;

public class CollectionCopyExamples {

    public static void main(String[] args) {
        // Исходная Map
        Map<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "Apple");
        originalMap.put(2, "Banana");
        originalMap.put(3, "Cherry");

        // 1. Копировать Map в другую Map
        Map<Integer, String> copyMap = new HashMap<>(originalMap);
        System.out.println("Copied Map: " + copyMap);

        // 2. Копировать Map в Queue (будем сохранять только значения)
        Queue<String> queue = new LinkedList<>(originalMap.values());
        System.out.println("Copied to Queue: " + queue);

        // 3. Копировать Map в Stack (ключи и значения вместе)
        Stack<String> stack = new Stack<>();
        for (Map.Entry<Integer, String> entry : originalMap.entrySet()) {
            stack.push(entry.getKey() + "=" + entry.getValue());
        }
        System.out.println("Copied to Stack: " + stack);

        // 4. Копировать Queue в Map (используем индекс как ключ)
        Map<Integer, String> queueToMap = new HashMap<>();
        int index = 0;
        for (String item : queue) {
            queueToMap.put(index++, item);
        }
        System.out.println("Queue copied to Map: " + queueToMap);
    }
}