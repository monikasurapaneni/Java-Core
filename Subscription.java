class Subscription {

    String planName;
    double price;
    int validityDays;
    String quality;
    boolean isAutoRenewal;

    public void getSubscriptionDetails() {
        System.out.println("Subscription Details:");
        System.out.println("Plan Name: " + planName);
        System.out.println("Price: " + price);
        System.out.println("Validity (days): " + validityDays);
        System.out.println("Streaming Quality: " + quality);
        System.out.println("Auto Renewal: " + isAutoRenewal);
        System.out.println("-----------------------------");
    }
}