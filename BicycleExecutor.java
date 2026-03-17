class BicycleExecutor {

    public static void main(String[] args) {

        System.out.println("Main Started");

        System.out.println("Brand: " + Bicycle.getBrand());
        System.out.println("Type: " + Bicycle.getType());
        System.out.println("Gears: " + Bicycle.getGearCount());
        System.out.println("Frame: " + Bicycle.getFrameMaterial());
        System.out.println("Price: " + Bicycle.getPrice());

        System.out.println("Main Ended");
    }
}