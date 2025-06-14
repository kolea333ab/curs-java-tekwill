package homeworkTheme14;

public class Zebra extends Animal {
    public Zebra(String name, int age) {
        super(name, age, "траву");
    }

    public void makeSound() {
        System.out.println(this.name + " лает и скулит!");
    }
}
