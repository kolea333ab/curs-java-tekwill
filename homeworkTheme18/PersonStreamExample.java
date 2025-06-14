package homeworkTheme18;

import java.util.*;

import static java.util.stream.Collectors.*;

public class PersonStreamExample {

    static class Person {
        private String name;
        private int age;
        private String city;

        public Person(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }

        public String getName() { return name; }
        public int getAge() { return age; }
        public String getCity() { return city; }

        @Override
        public String toString() {
            return name + " (" + age + "), " + city;
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30, "New York"),
                new Person("Bob", 17, "Chicago"),
                new Person("Charlie", 40, "Los Angeles"),
                new Person("Diana", 25, "New York"),
                new Person("Eve", 22, "Chicago"),
                new Person("Frank", 16, "Boston"),
                new Person("Grace", 27, "Miami"),
                new Person("Hank", 33, "New York"),
                new Person("Ivy", 19, "San Francisco"),
                new Person("Jack", 45, "Chicago")
        );

        // 1. Filter all people aged over 25
        List<Person> over25 = people.stream()
                .filter(p -> p.getAge() > 25)
                .collect(toList());
        System.out.println("People over 25: " + over25);

        // 2. Find all people who live in "New York"
        List<Person> inNewYork = people.stream()
                .filter(p -> p.getCity().equalsIgnoreCase("New York"))
                .collect(toList());
        System.out.println("People in New York: " + inNewYork);

        // 3. Sort the list by age in ascending order
        List<Person> sortedByAge = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(toList());
        System.out.println("Sorted by age: " + sortedByAge);

        // 4. Map to get just the names
        List<String> names = people.stream()
                .map(Person::getName)
                .collect(toList());
        System.out.println("Names: " + names);

        // 5. Count how many people are below 18
        long minors = people.stream()
                .filter(p -> p.getAge() < 18)
                .count();
        System.out.println("People below 18: " + minors);

        // 6. Group by city
        Map<String, List<Person>> groupedByCity = people.stream()
                .collect(groupingBy(Person::getCity));
        System.out.println("Grouped by city: " + groupedByCity);

        // 7. Find the oldest person
        people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .ifPresent(p -> System.out.println("Oldest: " + p));

        // 8. Check if all people are adults (age >= 18)
        boolean allAdults = people.stream()
                .allMatch(p -> p.getAge() >= 18);
        System.out.println("All adults: " + allAdults);

        // 9. Check if anyone lives in "Chicago"
        boolean someoneInChicago = people.stream()
                .anyMatch(p -> p.getCity().equalsIgnoreCase("Chicago"));
        System.out.println("Anyone in Chicago: " + someoneInChicago);

        // 10. Comma-separated names of people older than 30
        String namesOver30 = people.stream()
                .filter(p -> p.getAge() > 30)
                .map(Person::getName)
                .collect(joining(", "));
        System.out.println("Names over 30: " + namesOver30);
    }
}
