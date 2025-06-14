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
        System.out.println(this.name + " издаёт звук.");
    }

    public void eat() {
        System.out.println(this.name + " ест " + this.food + ".");
    }

    public String toString() {
        return this.name + " (Возраст: " + this.age + ", Еда: " + this.food + ")";
    }
}
