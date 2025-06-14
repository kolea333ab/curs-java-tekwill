package homeworkTheme14;

public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age, "мясо");
    }

    public void makeSound() {
        System.out.println(this.name + " рычит!");
    }
}
