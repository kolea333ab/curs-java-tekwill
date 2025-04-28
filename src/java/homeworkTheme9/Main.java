package homeworkTheme9;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Elephant();
        animal.makeSound();
        animal.eat();
        animal.sleep();
        Animal.describe();

        System.out.println("---");

        Herbivore herbivore = new Elephant();
        herbivore.graze();
        herbivore.rest();
    }
}
