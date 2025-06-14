package homeworkTheme14;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList();

    public Zoo() {
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void showAllAnimals() {
        for(Animal animal : this.animals) {
            System.out.println(animal);
            animal.makeSound();
            animal.eat();
        }

    }
}