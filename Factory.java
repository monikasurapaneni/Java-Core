class Factory {

    String factoryName;
    String location;
    String industryType;
    int numberOfWorkers;
    double productionCapacity;

    Machine machine; 

    public void getFactoryDetails() {
        System.out.println("Factory Details:");
        System.out.println("Factory Name: " + factoryName);
        System.out.println("Location: " + location);
        System.out.println("Industry Type: " + industryType);
        System.out.println("Workers: " + numberOfWorkers);
        System.out.println("Production Capacity: " + productionCapacity);
        System.out.println("--------------------------------");

        machine.getMachineDetails();

        System.out.println("=================================");
    }
}