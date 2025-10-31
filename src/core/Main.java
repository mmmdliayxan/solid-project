package core;

import interfaces.NotificationService;
import services.EmailNotificationService;

public class Main {
    public static void main(String[] args) {

        NotificationService emailService = new EmailNotificationService();
        OrderProcessor orderProcessor = new OrderProcessor(emailService);

        orderProcessor.createOrder("Elektron kitab", 3, "samir@gmail.com", "digital");
        orderProcessor.createOrder("Laptop", 6, "admin@gmail.com", "physical");
        orderProcessor.createOrder("Netflix", 1, "root@gmail.com", "subscription");

        orderProcessor.cancelOrder(101);


    }
}