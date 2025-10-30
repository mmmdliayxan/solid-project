package Service;

public interface CreateOrder extends ECommerceOperations {
   public void createOrder(String productName, int quantitiy, String email, String type);
}
