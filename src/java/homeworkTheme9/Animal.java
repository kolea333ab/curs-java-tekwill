package homeworkTheme9;

public interface Animal {
    int legs = 4;

    void makeSound ();
    void eat ();

    default void sleep(){
        System.out.println("Животное спит.");
    }

    static void describe () {
        System.out.println("Животное - это живое существо, которое может реагировать на окружение и двигаться.");
    }
}
