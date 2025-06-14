package homeworkTheme14;

public class Wolf extends Animal {
    public Wolf(String name, int age) {
        super(name, age, "мясо");
    }

    public void makeSound() {
        System.out.println(this.name + " воет!");
    }
}
