package homeworkTheme7.exercise2;

public class Invoice {
    private String model;
    private String description;
    private int quantity;
    private double price;

    public Invoice (String model, String description, int quantity, double price){
        this.model = model;
        this.description = description;
        setQuantity (quantity);
        setPrice (price);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity > 0 ? quantity : 0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price > 0 ? price : 0;
    }

    public double getAmount() {
        return quantity * price;
    }
}
