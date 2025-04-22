package homeworktheme5.exercise1;

public class Numbers {
    private int positivecount;
    private int negativecount;
    private int sum;

    public int getPositivecount() {
        return positivecount;
    }

    public int getNegativecount() {
        return negativecount;
    }

    public int getSum() {
        return sum;
    }

    public void addNumber (int number) {
        if (number > 0) {
            positivecount++;
        }
        else if (number < 0) {
            negativecount++;
        }
         sum+=number;
}

}
