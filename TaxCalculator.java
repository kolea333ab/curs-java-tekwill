package homework1;

public class TaxCalculator {
    public static void main(String[]args) {
        double price = 20.0;
        double tax = 1.2;
        int quantity = 3;
        double total = 0;
        String message = "I want to buy " + quantity + " shirt";
                System.out.println(message);
        total = price * quantity * tax;
        System.out.println("Total cost with tax is: "+ total);
    }

}
