class TV {

    String brand;
    String model;
    double price;
    String screenType;
    int screenSize;

    Remote remote; 

    public void getTVDetails() {
        System.out.println("TV Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Screen Type: " + screenType);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("--------------------------------");

        remote.getRemoteDetails();

        System.out.println("=================================");
    }
}