package homeworkTheme14;

public class Jaguar extends Animal {
    public Jaguar(String name, int age) {
        super(name, age, "мясо");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " ворчит!");
    }
}