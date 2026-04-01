class Lock {

    String securityLevel;
    String accessMode;
    int batteryLevel;
    boolean alarmEnabled;
    String unlockMethod;

    public void getLockDetails() {
        System.out.println("Lock Details:");
        System.out.println("Security Level: " + securityLevel);
        System.out.println("Access Mode: " + accessMode);
        System.out.println("Battery Level: " + batteryLevel);
        System.out.println("Alarm Enabled: " + alarmEnabled);
        System.out.println("Unlock Method: " + unlockMethod);
        System.out.println("-----------------------------");
    }
}