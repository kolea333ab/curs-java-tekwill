package homeworktheme8.exercise1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alexia", "Mircea cel Batrin 4");
        Student student = new Student("Nicolae", "Milescu-Spataru 7/1", "Computer Science", 2025, 7500.0);
        Staff staff = new Staff("Diana", "Mircea cel Batrin 4", "USMF", 4200.0);

        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);
    }
}
