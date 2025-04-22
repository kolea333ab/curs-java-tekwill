package homeworktheme5.exercise3;

public class Sum {
    public static void main (String [] args){
        double sum = 0;

        for (int numerator = 1; numerator <= 97; numerator += 2){
            int denominator = numerator + 2;
            sum += (double) numerator/denominator;
        }

        System.out.println("Сумма ряда= " + sum);
    }
}
