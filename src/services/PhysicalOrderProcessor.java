package services;

import interfaces.ProductOrderProcessor;

public class PhysicalOrderProcessor implements ProductOrderProcessor {
    @Override
    public void process(String productName, int quantity) {
        System.out.println("Preparing shipping label for physical product: " + productName);
    }
}
