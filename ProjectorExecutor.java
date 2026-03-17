class ProjectorExecutor {

    public static void main(String[] args) {

        System.out.println("Main Started");

        System.out.println("Brand: " + Projector.getBrand());
        System.out.println("Resolution: " + Projector.getResolution());
        System.out.println("Brightness: " + Projector.getBrightness() + " lumens");
        System.out.println("Lamp Type: " + Projector.getLampType());
        System.out.println("Price: " + Projector.getPrice());

        System.out.println("Main Ended");
    }
}