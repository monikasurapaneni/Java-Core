class Sim {

    String provider;
    String simType;
    String networkType;
    String phoneNumber;
    boolean isActive;

    public void getSimDetails() {
        System.out.println("SIM Details:");
        System.out.println("Provider: " + provider);
        System.out.println("SIM Type: " + simType);
        System.out.println("Network Type: " + networkType);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Active: " + isActive);
        System.out.println("-----------------------------");
    }
}