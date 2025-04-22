package homeworktheme6.exercise3;

public class Copy {
    public static void main (String[] args){
        int[] originalA = {12, 23, 34, 45, 56};

        int[] copiedA = new int[originalA.length];

        for (int i = 0; i < originalA.length; i++) {
            copiedA[i] = originalA[i];
        }

        System.out.println("Новый массив:");
        for (int value : copiedA) {
            System.out.print(value + " ");
        }
    }
}
