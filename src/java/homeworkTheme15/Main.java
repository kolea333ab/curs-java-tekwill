package homeworkTheme15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Person> people = new TreeSet<>();
        people.add(new Person("Диана", 26));
        people.add(new Person("Ольга", 70));
        people.add(new Person("Олег", 61));
        people.add(new Person("Николай", 75));
        people.add(new Person("Алексия", 1));
        people.add(new Person("Ольга", 70));

        System.out.println("Люди старше 60:");
        for (Person person : people) {
            if (person.getAge() > 60) {
                System.out.println(person);
            }
        }
    }
}