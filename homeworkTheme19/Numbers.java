package homeworkTheme19;

class Numbers {
    public int divideBy(int value) {
        if (value == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return 100 / value;  // пример деления
    }
}

// Custom exception
class InvalidRangeException extends RuntimeException {
    public InvalidRangeException(String message) {
        super(message);
    }
}

class MathHelper {
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