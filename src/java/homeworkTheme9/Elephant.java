package homeworkTheme9;

public class Elephant extends Herbivore implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Слон трубит!");
    }

    @Override
    public void eat() {
        System.out.println("Слон ест траву!");
    }

    @Override
    public void graze() {
        System.out.println("Слон пасётся на лугу!");
    }
}
