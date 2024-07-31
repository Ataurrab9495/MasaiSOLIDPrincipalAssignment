/* 
 * class OrderProcessor {
    public void processOrder(String orderId) {
        // Order processing logic
    }

    public void sendOrderConfirmation(String orderId) {
        // Order confirmation logic
    }

    public void updateOrderStatus(String orderId, String status) {
        // Order status update logic
    }
}

 */

 /* 
  * it voilates the SRP.
1. create individual classes for each method
  */

public class OrderProcessor {
    public void processOrder(String orderId) {
        // Order processing logic
    }
}


class OrderConfirmation{
    public void sendOrderConfirmation(String orderId) {
        // Order confirmation logic
    }
}

class UpdateOrderStatus{
    public void sendOrderConfirmation(String orderId) {
        // Order confirmation logic
    }
}