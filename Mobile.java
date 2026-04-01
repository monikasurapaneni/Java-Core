class Mobile {

    String brand;
    String model;
    double price;
    String color;
    String storage;

    Sim sim;

    public void getMobileDetails() {
        System.out.println("Mobile Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Storage: " + storage);
        System.out.println("--------------------------------");

        sim.getSimDetails();

        System.out.println("=================================");
    }
}