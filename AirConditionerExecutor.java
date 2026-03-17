class AirConditionerExecutor {

    public static void main(String[] args) {

        System.out.println("Main Started");

        System.out.println("Brand: " + AirConditioner.getBrand());
        System.out.println("Tonnage: " + AirConditioner.getTonnage());
        System.out.println("Type: " + AirConditioner.getType());
        System.out.println("Energy Rating: " + AirConditioner.getEnergyRating() + " Star");
        System.out.println("Price: " + AirConditioner.getPrice());

        System.out.println("Main Ended");
    }
}