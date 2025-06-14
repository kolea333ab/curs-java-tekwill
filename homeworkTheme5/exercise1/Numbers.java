package homeworkTheme5.exercise1;

public class Numbers {
    private int positivecount;
    private int negativecount;
    private int sum;

    public Numbers() {
    }

    public int getPositivecount() {
        return this.positivecount;
    }

    public int getNegativecount() {
        return this.negativecount;
    }

    public int getSum() {
        return this.sum;
    }

    public void addNumber(int number) {
        if (number > 0) {
            ++this.positivecount;
        } else if (number < 0) {
            ++this.negativecount;
        }

        this.sum += number;
    }
}