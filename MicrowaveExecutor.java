class MicrowaveExecutor {

    public static void main(String[] args) {

        System.out.println("Main Started");

        System.out.println("Brand: " + Microwave.getBrand());
        System.out.println("Capacity: " + Microwave.getCapacity() + "L");
        System.out.println("Type: " + Microwave.getType());
        System.out.println("Power: " + Microwave.getPower() + "W");
        System.out.println("Price: " + Microwave.getPrice());

        System.out.println("Main Ended");
    }
}