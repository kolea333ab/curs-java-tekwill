package expenses;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
        // Класс для хранения и управления расходов
public class ExpenseManager {
        // Сейчас будет список
        private List<Expense> expenses = new ArrayList<>();

        // Метод для добавления
        public void addExpense(double amount, String category, String description, String dateStr) {

            LocalDate date = LocalDate.parse(dateStr);

            Expense expense = new Expense(amount, category, description, date);
            expenses.add(expense);
        }

        // Метод для полуения всех расходов
        public List<Expense> getExpenses() {
                return expenses;
            }

            // Возвращаем спискок расходов
            public double getTotal() {
                double sum = 0;
                for (Expense expense : expenses) {
                    // Всё складываем
                    sum += expense.getAmount();
                }
                return sum;
            }
        }

