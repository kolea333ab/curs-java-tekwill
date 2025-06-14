package homeworkTheme9;

public class Elephant extends Herbivore implements Animal {
    public Elephant() {
    }

    public void makeSound() {
        System.out.println("Слон трубит!");
    }

    public void eat() {
        System.out.println("Слон ест траву!");
    }

    public void graze() {
        System.out.println("Слон пасётся на лугу!");
    }
}
