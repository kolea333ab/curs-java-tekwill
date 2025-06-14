package homeworkTheme19;

public class Main {
    public static void main(String[] args) {
        // 1. Test Person creation
        try {
            Person p1 = new Person("Alice", "Smith", 30);
            Person p2 = new Person("Bob", "Brown", 151);  // Ошибка
        } catch (InvalidNameException | InvalidAgeException e) {
            System.out.println("Person error: " + e.getMessage());
        }

        // 2. Test divideBy method
        Numbers n = new Numbers();
        try {
            System.out.println("100 / 5 = " + n.divideBy(5));
            System.out.println("100 / 0 = " + n.divideBy(0)); // Ошибка
        } catch (IllegalArgumentException e) {
            System.out.println("Divide error: " + e.getMessage());
        }

        // 3. Test countDivisibleBy7Numbers
        try {
            int count = MathHelper.countDivisibleBy7Numbers(1, 50);
            System.out.println("Count divisible by 7 between 1 and 50: " + count);

            count = MathHelper.countDivisibleBy7Numbers(50, 1);  // Ошибка
        } catch (InvalidRangeException e) {
            System.out.println("Range error: " + e.getMessage());
        }
    }
}
