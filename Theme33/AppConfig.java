package org.example.Theme33;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Value("${serviceA.message}")
    private String serviceAMessage;

    @Value("${serviceB.message}")
    private String serviceBMessage;

    // Singleton scoped bean, configured через @Bean (Java-конфигурация)
    @Bean
    @Scope("singleton")
    public ServiceA serviceA() {
        return new ServiceA(serviceAMessage);
    }

    // Prototype scoped bean, configured через @Bean (Java-конфигурация)
    @Bean
    @Scope("prototype")
    public ServiceB serviceB() {
        return new ServiceB();
    }

    // Клиентский сервис, где будем использовать внедрение зависимостей
    @Bean
    public ClientService clientService(@Qualifier("serviceA") ServiceA serviceA,
                                       @Qualifier("serviceB") ServiceB serviceB) {
        ClientService client = new ClientService();
        // setter injection для serviceB
        client.setServiceB(serviceB);
        // constructor injection для serviceA
        client.setServiceA(serviceA);
        return client;
    }
}
