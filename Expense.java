package expenses;
import java.time.LocalDate;

public class Expense {
    // класс для одного расхода
    private  double amount; // Сумма
    private String category; // Категория
    private String description; // Описание
    private LocalDate date; // Дата

    // Сейчас будет конструктор
    public Expense(double amount, String category, String description, LocalDate date) {
    // Обращения
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = date;
    }
    // Сейчас будут методы получения (в java методы)
    public  double getAmount() { return amount; }

    public String getCategory() { return category; }

    public String getDescription() { return description; }

    public LocalDate getDate() { return  date; }

    // Метод вывода
    @Override
    public String toString() { return date + " | " + category + " | " + amount + " MDL | " + description;
    }
}
