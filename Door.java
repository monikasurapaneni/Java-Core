class Door {

    String type;
    String brand;
    double thickness;
    double price;
    String openingStyle;

    Lock lock; 

    public void getDoorDetails() {
        System.out.println("Door Details:");
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Thickness: " + thickness);
        System.out.println("Price: " + price);
        System.out.println("Opening Style: " + openingStyle);
        System.out.println("--------------------------------");

        lock.getLockDetails();

        System.out.println("=================================");
    }
}