package homeworkTheme7.exercise2;

public class Invoice {
    private String model;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String model, String description, int quantity, double price) {
        this.model = model;
        this.description = description;
        this.setQuantity(quantity);
        this.setPrice(price);
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity > 0 ? quantity : 0;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price > (double)0.0F ? price : (double)0.0F;
    }

    public double getAmount() {
        return (double)this.quantity * this.price;
    }
}
