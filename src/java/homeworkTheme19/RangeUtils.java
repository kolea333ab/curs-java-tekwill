package homeworkTheme19;

public class RangeUtils {
    public static int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) {
        if (inferiorLimit > superiorLimit) {
            throw new InvalidRangeException("Inferior limit cannot be greater than superior limit.");
        }

        int count = 0;
        for (int i = inferiorLimit; i <= superiorLimit; i++) {
            if (i % 7 == 0) {
                count++;
            }
        }
        return count;
    }
}