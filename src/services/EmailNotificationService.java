package services;
import interfaces.NotificationService;

public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String email, String message) {
        System.out.println("Sending EMAIL to " + email + ": " + message);
    }
}