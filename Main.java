package expenses;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager(); // Объект

        Scanner scanner = new Scanner(System.in); // Ввод с клавы

        boolean running = true; // Это своего рода флаг, чтоб не выйти из меню, пока пользователь не выйдет сам

        while (running) {

            System.out.println("\n --- Expense Manager ---"); // Менюшка в консоле
            System.out.println("1. Add expense"); // Добавим трату
            System.out.println("2. Show all expenses"); // Все траты
            System.out.println("3. Show total amount"); // Сумма всех трат
            System.out.println("4. Exit"); // Выйти из проги
            System.out.println("Choose an option: "); // Выберем пункт меню

            String choice = scanner.nextLine(); // Строка

            switch (choice) {
                case "1":
                    // Новая трата
                    System.out.println("Enter category: "); // Категория
                    String category = scanner.nextLine(); // Считывание
                    System.out.println("Enter amount: "); //  Суммма
                    double amount;
                    try {
                        amount = Double.parseDouble(scanner.nextLine()); // Страка преоб. в число
                    } catch (NumberFormatException e) {
                        System.out.println("Error: please enter a valid number. "); // Сообщ. об ошибке
                        break; // Выход с кейса
                    }
                    System.out.println("Enter description: "); // Описание
                    String description = scanner.nextLine(); // Его считывание

                    System.out.println("Enter date (e.g.2025-07-15)"); // Просим дату
                    String date = scanner.nextLine(); // Дата строка

                    manager.addExpense(amount, category, description, date); // Добав. дату
                    System.out.println("Expense added."); // Подтверждение добав.
                    break;

                case "2":
                    // Все траты
                    System.out.println(" ---All Expenses --- "); // Название
                    for (Expense expense : manager.getExpenses()) {
                        System.out.println(expense); // Траты в формате String
                    }
                    break;

                case "3":
                    // Общая сумма
                    System.out.println("Total expenses: " + manager.getTotal() + " MDL "); // Вывод сумму всех трат
                    break;

                case "4":
                    // Выход из проги
                    running = false; // Цикл of
                    System.out.println("Exiting the program..."); // сообщение об этом
                    break;

                default: //

                    System.out.println("Invalid input.Please try again."); // Инфа об ошибке
            }
        }

        scanner.close(); // Сканер of
    }
}

