package homeworktheme6.exercise1;

public class IntMassiv {
    public IntMassiv() {
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println("Массив: ");

        for(int i = 0; i < numbers.length; ++i) {
            System.out.println(numbers[i]);
        }

    }
}