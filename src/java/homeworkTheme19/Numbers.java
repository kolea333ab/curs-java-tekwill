package homeworkTheme19;

public class Numbers {
    public void divideBy(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        System.out.println("100 divided by " + number + " is " + (100 / number));
    }
}