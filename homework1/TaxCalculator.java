package homework1;

public class TaxCalculator {
    public TaxCalculator() {
    }

    public static void main(String[] args) {
        double price = (double)20.0F;
        double tax = 1.2;
        int quantity = 3;
        double total = (double)0.0F;
        String message = "I want to buy " + quantity + " shirt";
        System.out.println(message);
        total = price * (double)quantity * tax;
        System.out.println("Total cost with tax is: " + total);
    }
}
