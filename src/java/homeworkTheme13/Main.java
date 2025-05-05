package homeworkTheme13;

import java.util.*;

public class Main {

    public static List<String> getTodayTasks() {
        List<String> tasks = new ArrayList<>();
        tasks.add("Пойти на работу");
        tasks.add("Изучить материалы по кодированию");
        tasks.add("Посетить курс по Java программированию");
        tasks.add("Сделать домашнее задание");
        return tasks;
    }

    public static Set<String> getUniqueValues(List<String> values) {
        return new HashSet<>(values);
    }

    public static Map<String, String> getDictionary() {
        Map<String, String> dictionary = new LinkedHashMap<>(); // Maintain insertion order
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
        List<String> tasks = getTodayTasks();
        for (String task : tasks) {
            System.out.println("- " + task);
        }


        System.out.println("\n🔁 Unique Values:");
        List<String> namesWithDuplicates = Arrays.asList("Диана", "Николай", "Алексия", "Олег", "Диана", "Амелия");
        Set<String> uniqueNames = getUniqueValues(namesWithDuplicates);
        for (String name : uniqueNames) {
            System.out.println("- " + name);
        }


        System.out.println("\n📘 English-Romanian Dictionary:");
        Map<String, String> dictionary = getDictionary();
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
