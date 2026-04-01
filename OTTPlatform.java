class OTTPlatform {

    String platformName;
    String appVersion;
    String availableContent;
    int numberOfUsers;
    String supportedDevices;

    Subscription subscription; // HAS-A relationship

    public void getOTTDetails() {
        System.out.println("OTT Platform Details:");
        System.out.println("Platform Name: " + platformName);
        System.out.println("App Version: " + appVersion);
        System.out.println("Content: " + availableContent);
        System.out.println("Users: " + numberOfUsers);
        System.out.println("Supported Devices: " + supportedDevices);
        System.out.println("--------------------------------");

        subscription.getSubscriptionDetails();

        System.out.println("=================================");
    }
}