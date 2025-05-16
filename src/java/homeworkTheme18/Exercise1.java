package homeworkTheme18;

import java.util.*;
import java.util.stream.*;

class Person {
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
        return name + " (" + age + ") - " + city;
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alexia", 30, "New York"),
                new Person("Nick", 17, "Chicago"),
                new Person("Diana", 26, "Los Angeles"),
                new Person("Alex", 40, "New York"),
                new Person("Eve", 15, "Miami"),
                new Person("Angelina", 22, "Chicago"),
                new Person("Alice", 35, "New York"),
                new Person("Hannah", 28, "Seattle"),
                new Person("Stefan", 16, "New York"),
                new Person("Alice", 50, "Los Angeles")
        );

        System.out.println("People over 25:");
        people.stream()
                .filter(p -> p.getAge() > 25)
                .forEach(System.out::println);


        System.out.println("\nPeople from New York:");
        people.stream()
                .filter(p -> "New York".equals(p.getCity()))
                .forEach(System.out::println);


        System.out.println("\nPeople sorted by age:");
        people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .forEach(System.out::println);


        System.out.println("\nNames of all people:");
        List<String> names = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        names.forEach(System.out::println);


        long minors = people.stream()
                .filter(p -> p.getAge() < 18)
                .count();
        System.out.println("\nPeople under 18: " + minors);


        System.out.println("\nGrouped by city:");
        Map<String, List<Person>> groupedByCity = people.stream()
                .collect(Collectors.groupingBy(Person::getCity));
        groupedByCity.forEach((city, list) -> {
            System.out.println(city + ": " + list);
        });


        System.out.println("\nOldest person:");
        people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .ifPresent(System.out::println);


        boolean allAdults = people.stream().allMatch(p -> p.getAge() >= 18);
        System.out.println("\nAll are adults? " + allAdults);


        boolean someoneInChicago = people.stream().anyMatch(p -> "Chicago".equals(p.getCity()));
        System.out.println("Anyone in Chicago? " + someoneInChicago);


        String namesOver30 = people.stream()
                .filter(p -> p.getAge() > 30)
                .map(Person::getName)
                .collect(Collectors.joining(", "));
        System.out.println("\nNames of people over 30: " + namesOver30);
    }
}
