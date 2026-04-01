class Platform {

    int platformNumber;
    double length;
    String platformType;
    boolean hasShelter;
    String trainType;

    public void getPlatformDetails() {
        System.out.println("Platform Details:");
        System.out.println("Platform Number: " + platformNumber);
        System.out.println("Length: " + length);
        System.out.println("Type: " + platformType);
        System.out.println("Shelter Available: " + hasShelter);
        System.out.println("Train Type: " + trainType);
        System.out.println("-----------------------------");
    }
}