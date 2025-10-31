package interfaces;

public interface ECommerceOperations {
    void createOrder(String productName, int quantity, String email, String type);
    void cancelOrder(int orderId);
}
