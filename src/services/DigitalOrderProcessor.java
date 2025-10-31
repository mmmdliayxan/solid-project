package services;

import interfaces.ProductOrderProcessor;

public class DigitalOrderProcessor implements ProductOrderProcessor {
    @Override
    public void process(String productName, int quantity) {
        System.out.println("Generating download link for digital product: " + productName);
    }
}