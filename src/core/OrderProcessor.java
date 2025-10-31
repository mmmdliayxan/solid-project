package core;
import interfaces.ECommerceOperations;
import interfaces.NotificationService;
import interfaces.ProductOrderProcessor;
import services.DigitalOrderProcessor;
import services.PhysicalOrderProcessor;
import services.SubscriptionOrderProcessor;

public class OrderProcessor implements ECommerceOperations {
    private NotificationService notificationService;

    public OrderProcessor(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void createOrder(String productName, int quantity, String email, String type) {
        System.out.println("Saving order to database: " + productName + " x" + quantity);

        ProductOrderProcessor processor;


        if (type.equalsIgnoreCase("digital")) {
            processor = new DigitalOrderProcessor();
        } else if (type.equalsIgnoreCase("physical")) {
            processor = new PhysicalOrderProcessor();
        } else if (type.equalsIgnoreCase("subscription")) {
            processor = new SubscriptionOrderProcessor();
        } else {
            System.out.println("Unknown product type: " + type);
            return;
        }

        processor.process(productName, quantity);

        if (quantity > 5) {
            System.out.println("Discount applied!");
        }

        notificationService.send(email, "Your order for " + productName + " is confirmed!");
    }

    @Override
    public void cancelOrder(int orderId) {
        System.out.println("Order " + orderId + " cancelled!");
    }
}
