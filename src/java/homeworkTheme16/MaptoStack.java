package homeworkTheme16;

import java.util.*;

public class MaptoStack {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Солнце", 10);
        map.put("Луна", 20);

        Stack<Map.Entry<String, Integer>> stack = new Stack<>();
        stack.addAll(map.entrySet());

        System.out.println("Stack: " + stack);
    }
}
