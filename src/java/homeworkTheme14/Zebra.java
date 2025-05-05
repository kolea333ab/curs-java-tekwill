package homeworkTheme14;

public class Zebra extends Animal {
    public Zebra(String name, int age) {
        super(name, age, "траву");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " лает и скулит!");
    }
}