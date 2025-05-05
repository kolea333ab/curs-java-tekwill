package homeworkTheme14;

public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age, "мясо");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " рычит!");
    }
}