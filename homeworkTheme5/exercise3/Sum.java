package homeworkTheme5.exercise3;

public class Sum {
    public Sum() {
    }

    public static void main(String[] args) {
        double sum = (double)0.0F;

        for(int numerator = 1; numerator <= 97; numerator += 2) {
            int denominator = numerator + 2;
            sum += (double)numerator / (double)denominator;
        }

        System.out.println("Сумма ряда= " + sum);
    }
}
