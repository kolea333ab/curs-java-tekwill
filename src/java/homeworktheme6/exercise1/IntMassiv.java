package homeworktheme6.exercise1;

public class IntMassiv {
    public static void main (String [] args) {
        int[] numbers = new int[9];

        numbers[0]=11;
        numbers[1]=22;
        numbers[2]=33;
        numbers[3]=44;
        numbers[4]=55;
        numbers[5]=66;
        numbers[6]=77;
        numbers[7]=88;
        numbers[8]=99;

        System.out.println("Массив: ");
        for (int i =0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
