class RouterExecutor {

    public static void main(String[] args) {

        System.out.println("Main Started");

        System.out.println("Brand: " + Router.getBrand());
        System.out.println("Type: " + Router.getType());
        System.out.println("Speed: " + Router.getSpeed() + " Mbps");
        System.out.println("Antennas: " + Router.getAntennaCount());
        System.out.println("Price: " + Router.getPrice());

        System.out.println("Main Ended");
    }
}