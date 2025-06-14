package homeworktheme8.exercise1;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Person person = new Person("Alexia", "Mircea cel Batrin 4");
        Student student = new Student("Nicolae", "Milescu-Spataru 7/1", "Computer Science", 2025, (double)7500.0F);
        Staff staff = new Staff("Diana", "Mircea cel Batrin 4", "USMF", (double)4200.0F);
        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);
    }
}