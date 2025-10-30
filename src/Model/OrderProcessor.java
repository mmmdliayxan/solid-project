package Model;

import Service.CreateOrder;

public abstract class OrderProcessor implements CreateOrder {
    @Override
    public void createOrder(String productName, int quantitiy, String email, String type) {
        System.out.println("Saving order to database: " + productName + " x" + quantitiy);
    }

    void equalsType(String type){
        System.out.println(type);
    }

    void equalsType() {
    }
}
