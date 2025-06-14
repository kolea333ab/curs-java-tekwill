package homeworkTheme22;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // HashSet — без сортировки по умолчанию
        Set<Car> carHashSet = new HashSet<>();
        carHashSet.add(new Car(2010, "Toyota"));
        carHashSet.add(new Car(2015, "BMW"));
        carHashSet.add(new Car(2005, "Ford"));
        carHashSet.add(new Car(2020, "Tesla"));

        // Сортировка HashSet по году выпуска через List
        List<Car> sortedList = new ArrayList<>(carHashSet);
        Collections.sort(sortedList); // Используется compareTo

        System.out.println("HashSet (отсортирован вручную по году):");
        for (Car car : sortedList) {
            System.out.println(car);
        }

        // TreeSet с Comparator — сортировка по имени автомобиля
        Set<Car> carTreeSet = new TreeSet<>(Comparator.comparing(Car::getName));
        carTreeSet.addAll(carHashSet);

        System.out.println("\nTreeSet (сортировка по имени):");
        for (Car car : carTreeSet) {
            System.out.println(car);
        }
    }
}
