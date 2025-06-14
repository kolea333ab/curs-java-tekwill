package homeworkTheme24;

import java.util.List;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListDisplayThread {

    private static final Logger logger = Logger.getLogger(ListDisplayThread.class.getName());

    public static void main(String[] args) {
        List<String> elements = Arrays.asList("Элемент 1", "Элемент 2", "Элемент 3", "Элемент 4");

        Thread displayThread = new Thread(() -> {
            try {
                for (String element : elements) {
                    System.out.println(element);
                    Thread.sleep(500);  // пауза 0.5 секунды между элементами
                }
                System.out.println("Все элементы списка выведены");
            } catch (InterruptedException e) {
                // Логируем ошибку прерывания потока
                logger.log(Level.SEVERE, "Поток был прерван", e);
                // Можно восстановить статус прерывания потока
                Thread.currentThread().interrupt();
            }
        });

        displayThread.start();

        try {
            displayThread.join();  // Ждём, пока поток закончит вывод
        } catch (InterruptedException e) {
            logger.log(Level.SEVERE, "Основной поток был прерван", e);
            Thread.currentThread().interrupt();
        }
    }
}