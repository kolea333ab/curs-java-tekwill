package homeworkTheme14;

public class Animal {
    protected String name;
    protected int age;
    protected String food;

    public Animal(String name, int age, String food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }

    public void makeSound() {
        System.out.println(name + " издаёт звук.");
    }

    public void eat() {
        System.out.println(name + " ест " + food + ".");
    }

    @Override
    public String toString() {
        return name + " (Возраст: " + age + ", Еда: " + food + ")";
    }
}