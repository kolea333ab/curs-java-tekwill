package homeworkTheme14;
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Elephant("Дамбо", 10));
        zoo.addAnimal(new Lion("Симба", 5));
        zoo.addAnimal(new Wolf("Акела", 7));
        zoo.addAnimal(new Jaguar("Тень", 6));
        zoo.addAnimal(new Zebra("Морти", 4));
        zoo.showAllAnimals();
    }
}
