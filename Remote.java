class Remote {

    String brand;
    String connectivity;
    int numberOfButtons;
    boolean voiceControl;
    String batteryType;

    public void getRemoteDetails() {
        System.out.println("Remote Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Buttons: " + numberOfButtons);
        System.out.println("Voice Control: " + voiceControl);
        System.out.println("Battery Type: " + batteryType);
        System.out.println("-----------------------------");
    }
}