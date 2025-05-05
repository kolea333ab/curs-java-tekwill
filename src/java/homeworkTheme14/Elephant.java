package homeworkTheme14;

public class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age, "трава");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " трубит!");
    }
}