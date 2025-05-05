package homeworkTheme14;

public class Wolf extends Animal {
    public Wolf(String name, int age) {
        super(name, age, "мясо");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " воет!");
    }
}