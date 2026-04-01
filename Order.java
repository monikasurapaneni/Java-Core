class Order {

    String orderId;
    String productName;
    int quantity;
    String orderStatus;
    String deliveryDate;

    public void getOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Order ID: " + orderId);
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Status: " + orderStatus);
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("-----------------------------");
    }
} 

  