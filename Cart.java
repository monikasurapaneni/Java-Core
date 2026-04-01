class Cart {

    String userName;
    int numberOfItems;
    double totalPrice;
    String paymentMethod;
    String deliveryAddress;

    Order order; 

    public void getCartDetails() {
        System.out.println("Cart Details:");
        System.out.println("User Name: " + userName);
        System.out.println("Items: " + numberOfItems);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("--------------------------------");

        order.getOrderDetails();

        System.out.println("=================================");
    }
}