package services;

import interfaces.NotificationService;

public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String phone, String message) {
        System.out.println("Sending SMS to " + phone + ": " + message);
    }
}