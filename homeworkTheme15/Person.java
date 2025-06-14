package homeworkTheme15;

import java.util.Objects;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределение equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    // Переопределение hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // Переопределение toString
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    // Для TreeSet нужен порядок сортировки
    @Override
    public int compareTo(Person other) {
        int nameCmp = this.name.compareTo(other.name);
        if (nameCmp != 0) return nameCmp;
        return Integer.compare(this.age, other.age);
    }

    public int getAge() {
        return age;
    }
}