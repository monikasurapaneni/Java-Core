class History {

    String transactionId;
    double amount;
    String receiverName;
    String paymentType;
    String status;

    public void getHistoryDetails() {
        System.out.println("Transaction History:");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: " + amount);
        System.out.println("Receiver: " + receiverName);
        System.out.println("Payment Type: " + paymentType);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------");
    }
}