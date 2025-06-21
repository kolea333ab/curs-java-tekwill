package org.example.Theme33;

public class ServiceB {

    private String message;

    public ServiceB() {
        // дефолтный конструктор
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("ServiceB message: " + (message != null ? message : "No message set"));
    }
}
