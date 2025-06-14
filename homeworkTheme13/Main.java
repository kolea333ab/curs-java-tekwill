package homeworkTheme13;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public Main() {
    }

    public static List<String> getTodayTasks() {
        List<String> tasks = new ArrayList();
        tasks.add("Пойти на работу");
        tasks.add("Изучить материалы по кодированию");
        tasks.add("Посетить курс по Java программированию");
        tasks.add("Сделать домашнее задание");
        return tasks;
    }

    public static Set<String> getUniqueValues(List<String> values) {
        return new HashSet(values);
    }

    public static Map<String, String> getDictionary() {
        Map<String, String> dictionary = new LinkedHashMap();
        dictionary.put("apple", "măr");
        dictionary.put("book", "carte");
        dictionary.put("sun", "soare");
        dictionary.put("work", "lucru");
        dictionary.put("bread", "pâine");
        dictionary.put("child", "copil");
        dictionary.put("cat", "pisică");
        dictionary.put("house", "casă");
        dictionary.put("tree", "copac");
        dictionary.put("food", "mâncare");
        return dictionary;
    }

    public static void main(String[] args) {
        System.out.println("Задания на сегодня:");

        for(String task : getTodayTasks()) {
            System.out.println("- " + task);
        }

        System.out.println("\n\ud83d\udd01 Unique Values:");
        List<String> namesWithDuplicates = Arrays.asList("Диана", "Николай", "Алексия", "Олег", "Диана", "Амелия");

        for(String name : getUniqueValues(namesWithDuplicates)) {
            System.out.println("- " + name);
        }

        System.out.println("\n\ud83d\udcd8 English-Romanian Dictionary:");
        Map<String, String> dictionary = getDictionary();

        for(Map.Entry<String, String> entry : dictionary.entrySet()) {
            PrintStream var10000 = System.out;
            String var10001 = (String)entry.getKey();
            var10000.println(var10001 + " => " + (String)entry.getValue());
        }

    }
}
