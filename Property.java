class Property {

    String propertyType;
    double price;
    String area;
    int numberOfRooms;
    boolean isAvailable;

    public void getPropertyDetails() {
        System.out.println("Property Details:");
        System.out.println("Property Type: " + propertyType);
        System.out.println("Price: " + price);
        System.out.println("Area: " + area);
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Available: " + isAvailable);
        System.out.println("-----------------------------");
    }
}