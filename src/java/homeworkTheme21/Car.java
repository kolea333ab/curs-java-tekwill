package homeworkTheme21;

public class Car implements Comparable<Car> {
    private int year;
    private String name;

    public Car(int year, String name) {
        this.year = year;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.year, other.year); // ascending order by year
    }

    @Override
    public String toString() {
        return "Car{name='" + name + "', year=" + year + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return year == car.year && name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + year;
    }
}