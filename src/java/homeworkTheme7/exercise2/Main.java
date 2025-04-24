package homeworkTheme7.exercise2;

public class Main {
    public static void main(String[] args) {
        //1
        Invoice invoice1 = new Invoice("LG-WM100", "Washing Machine", 2, 450.99);
        System.out.println("Amount 1: " + invoice1.getAmount());

        //2
        Invoice invoice2 = new Invoice("ABC", "Something", -5, -100);
        System.out.println("Amount 2: " + invoice2.getAmount());
    }
}
