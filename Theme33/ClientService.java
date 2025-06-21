package org.example.Theme33;

import org.springframework.beans.factory.annotation.Qualifier;

public class ClientService {

    private ServiceA serviceA;
    private ServiceB serviceB;

    // Constructor injection через сеттер
    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    // Setter injection
    public void setServiceB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public void doWork() {
        serviceA.printMessage();
        serviceB.printMessage();
    }
}
