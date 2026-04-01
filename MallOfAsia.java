class MallOfAsia {

    String mallName;
    String location;
    int numberOfFloors;
    String mallType;
    boolean hasFoodCourt;

    public void getMallDetails() {
        System.out.println("Mall Details:");
        System.out.println("Mall Name: " + mallName);
        System.out.println("Location: " + location);
        System.out.println("Floors: " + numberOfFloors);
        System.out.println("Type: " + mallType);
        System.out.println("Food Court Available: " + hasFoodCourt);
        System.out.println("-----------------------------");
    }
}