package Model;

public class FakeOrderProcessor extends OrderProcessor{
    @Override
    public void createOrder(String productName, int quantitiy, String email, String type) {
        System.out.println("Just logging order, not saving to DB!");
    }
}
