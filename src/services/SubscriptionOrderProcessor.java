package services;

import interfaces.ProductOrderProcessor;

public class SubscriptionOrderProcessor implements ProductOrderProcessor {
    @Override
    public void process(String productName, int quantity) {
        System.out.println("Activating subscription for: " + productName);
    }
}