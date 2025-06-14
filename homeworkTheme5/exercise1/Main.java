package homeworkTheme5.exercise1;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Numbers stats = new Numbers();
        System.out.println("Введите целые числа (для завершения введите 0): ");

        while(true) {
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println("Положительные числа: " + stats.getPositivecount());
                System.out.println("Отрицательные числа: " + stats.getNegativecount());
                System.out.println("Сумма= " + stats.getSum());
                return;
            }

            stats.addNumber(number);
        }
    }
}