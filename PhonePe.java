class PhonePe {

    String userName;
    String mobileNumber;
    String upiId;
    String bankLinked;
    String appVersion;

    History history;

    public void getPhonePeDetails() {
        System.out.println("PhonePe Details:");
        System.out.println("User Name: " + userName);
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("UPI ID: " + upiId);
        System.out.println("Bank Linked: " + bankLinked);
        System.out.println("App Version: " + appVersion);
        System.out.println("--------------------------------");

        history.getHistoryDetails();

        System.out.println("=================================");
    }
}