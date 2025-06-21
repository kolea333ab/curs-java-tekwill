package org.example.Theme33;

public class ServiceA {
    private final String message;

    // Constructor injection
    public ServiceA(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("ServiceA message: " + message);
    }
}

