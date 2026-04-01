class Machine {

    String machineName;
    String machineType;
    String brand;
    double power;
    boolean isAutomated;

    public void getMachineDetails() {
        System.out.println("Machine Details:");
        System.out.println("Machine Name: " + machineName);
        System.out.println("Machine Type: " + machineType);
        System.out.println("Brand: " + brand);
        System.out.println("Power: " + power);
        System.out.println("Automated: " + isAutomated);
        System.out.println("-----------------------------");
    }
}