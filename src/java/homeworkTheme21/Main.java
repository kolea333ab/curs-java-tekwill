package homeworkTheme21;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Car> carHashSet = new HashSet<>();
        carHashSet.add(new Car(2010, "BMW e90"));
        carHashSet.add(new Car(2005, "Mercedes w221"));
        carHashSet.add(new Car(2018, "Tesla Model 3"));
        carHashSet.add(new Car(2015, "Ford Focus"));

        // Sort HashSet using Comparable (ascending year)
        List<Car> sortedList = new ArrayList<>(carHashSet);
        Collections.sort(sortedList);
        System.out.println("Sorted HashSet (by year):");
        for (Car car : sortedList) {
            System.out.println(car);
        }

        // TreeSet with Comparator (e.g. by name)
        Set<Car> carTreeSet = new TreeSet<>(Comparator.comparing(Car::getName));
        carTreeSet.addAll(carHashSet);

        System.out.println("\nTreeSet (sorted by name):");
        for (Car car : carTreeSet) {
            System.out.println(car);
        }
    }
}