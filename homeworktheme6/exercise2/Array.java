package homeworktheme6.exercise2;

public class Array {
    public Array() {
    }

    public static void main(String[] args) {
        int[] OneD = new int[]{25, 34, 61, 94, 3};
        int[][] TwoD = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Операция с одномерным массивом: ");
        processOneD(OneD);
        System.out.println("Операция с двухмерным массивом: ");
        processTwoD(TwoD);
    }

    public static void processOneD(int[] array) {
        int sum = 0;
        int even = 0;
        int odd = 0;

        for(int num : array) {
            sum += num;
            if (num % 2 == 0) {
                ++even;
            } else {
                ++odd;
            }
        }

        double average = (double)sum / (double)array.length;
        System.out.println("Сумма= " + sum);
        System.out.println("Среднее= " + average);
        System.out.println("Чётные: " + even);
        System.out.println("Нечётные: " + odd);
    }

    public static void processTwoD(int[][] array) {
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        for(int[] row : array) {
            for(int num : row) {
                sum += num;
                ++count;
                if (num % 2 == 0) {
                    ++even;
                } else {
                    ++odd;
                }
            }
        }

        double average = (double)sum / (double)count;
        System.out.println("Сумма= " + sum);
        System.out.println("Среднее= " + average);
        System.out.println("Чётные: " + even);
        System.out.println("Нечётные: " + odd);
    }
}