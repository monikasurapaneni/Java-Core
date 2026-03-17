class TabletExecutor {

    public static void main(String[] args) {

        System.out.println("Main Started");

        System.out.println("Brand: " + Tablet.getBrand());
        System.out.println("Storage: " + Tablet.getStorage() + "GB");
        System.out.println("RAM: " + Tablet.getRAM() + "GB");
        System.out.println("Screen Size: " + Tablet.getScreenSize() + " inches");
        System.out.println("Price: " + Tablet.getPrice());

        System.out.println("Main Ended");
    }
}