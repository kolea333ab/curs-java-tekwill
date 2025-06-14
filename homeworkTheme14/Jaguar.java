package homeworkTheme14;

public class Jaguar extends Animal {
    public Jaguar(String name, int age) {
        super(name, age, "мясо");
    }

    public void makeSound() {
        System.out.println(this.name + " ворчит!");
    }
}
