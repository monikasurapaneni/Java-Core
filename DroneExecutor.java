class DroneExecutor {

    public static void main(String[] args) {

        System.out.println("Main Started");

        System.out.println("Brand: " + Drone.getBrand());
        System.out.println("Camera: " + Drone.getCameraQuality());
        System.out.println("Flight Time: " + Drone.getFlightTime() + " mins");
        System.out.println("Range: " + Drone.getRange() + " km");
        System.out.println("Price: " + Drone.getPrice());

        System.out.println("Main Ended");
    }
}