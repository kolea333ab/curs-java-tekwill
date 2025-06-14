package homeworkTheme15;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>();

        people.add(new Person("Alice", 65));
        people.add(new Person("Bob", 45));
        people.add(new Person("Charlie", 70));
        people.add(new Person("Alice", 65)); // не добавится, дубликат

        for (Person person : people) {
            if (person.getAge() > 60) {
                System.out.println(person); // toString
            }
        }
    }
}

