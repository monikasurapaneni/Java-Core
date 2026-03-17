class Drone {

    public static String getBrand() {
        System.out.println("getBrand() invoked");
        return "DJI";
    }

    public static String getCameraQuality() {
        System.out.println("getCameraQuality() invoked");
        return "4K Ultra HD";
    }

    public static int getFlightTime() {
        System.out.println("getFlightTime() invoked");
        return 30;
    }

    public static double getRange() {
        System.out.println("getRange() invoked");
        return 10.0;
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        return 89999.00;
    }
}