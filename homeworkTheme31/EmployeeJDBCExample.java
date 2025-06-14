package homeworkTheme31;
import java.sql.*;

public class EmployeeJDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:\\Users\\Admin\\AppData\\Roaming\\DBeaverData\\workspace6\\General\\Scripts\\Script-6.sql"; // файл базы будет в проекте

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                // 1. Создаем таблицу
                String createTable = """
                    CREATE TABLE IF NOT EXISTS Employee (
                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                        firstName TEXT NOT NULL,
                        lastName TEXT NOT NULL,
                        salary REAL
                    )
                    """;
                try (Statement stmt = conn.createStatement()) {
                    stmt.execute(createTable);
                    System.out.println("Таблица Employee создана или уже существует.");
                }

                // 2. Добавляем записи
                String insertSQL = "INSERT INTO Employee(firstName, lastName, salary) VALUES (?, ?, ?)";
                try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
                    pstmt.setString(1, "Ivan");
                    pstmt.setString(2, "Ivanov");
                    pstmt.setDouble(3, 50000);
                    pstmt.executeUpdate();

                    pstmt.setString(1, "Maria");
                    pstmt.setString(2, "Petrova");
                    pstmt.setDouble(3, 60000);
                    pstmt.executeUpdate();

                    pstmt.setString(1, "John");
                    pstmt.setString(2, "Smith");
                    pstmt.setDouble(3, 45000);
                    pstmt.executeUpdate();

                    System.out.println("Добавлены записи.");
                }

                // 3. Модификация (например, повысить зарплату Ivan Ivanov)
                String updateSQL = "UPDATE Employee SET salary = ? WHERE firstName = ? AND lastName = ?";
                try (PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {
                    pstmt.setDouble(1, 55000);
                    pstmt.setString(2, "Ivan");
                    pstmt.setString(3, "Ivanov");
                    int rows = pstmt.executeUpdate();
                    System.out.println("Обновлено записей: " + rows);
                }

                // 4. Удаление (удалим Джона Смита)
                String deleteSQL = "DELETE FROM Employee WHERE firstName = ? AND lastName = ?";
                try (PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
                    pstmt.setString(1, "John");
                    pstmt.setString(2, "Smith");
                    int rows = pstmt.executeUpdate();
                    System.out.println("Удалено записей: " + rows);
                }

                // 5. Вывод оставшихся записей
                String selectSQL = "SELECT * FROM Employee";
                try (Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery(selectSQL)) {

                    System.out.println("Оставшиеся сотрудники:");
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String firstName = rs.getString("firstName");
                        String lastName = rs.getString("lastName");
                        double salary = rs.getDouble("salary");
                        System.out.printf("ID: %d, Имя: %s %s, Зарплата: %.2f%n", id, firstName, lastName, salary);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}