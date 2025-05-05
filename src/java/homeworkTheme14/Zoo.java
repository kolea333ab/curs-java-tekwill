package homeworkTheme14;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAllAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
            animal.makeSound();
            animal.eat();
        }
    }
}