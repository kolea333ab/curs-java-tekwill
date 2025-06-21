package org.example.Theme33;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        ClientService clientService1 = context.getBean(ClientService.class);

        // Для демонстрации prototype scope создадим второй экземпляр ServiceB
        ServiceB serviceB1 = context.getBean(ServiceB.class);
        serviceB1.setMessage("Message for prototype bean instance 1");

        ServiceB serviceB2 = context.getBean(ServiceB.class);
        serviceB2.setMessage("Message for prototype bean instance 2");

        System.out.println("=== ClientService working ===");
        clientService1.doWork();

        System.out.println("=== Prototype beans separately ===");
        serviceB1.printMessage();
        serviceB2.printMessage();

        context.close();
    }
}
