class Router {

    public static String getBrand() {
        System.out.println("getBrand() invoked");
        return "TP-Link";
    }

    public static String getType() {
        System.out.println("getType() invoked");
        return "Dual Band";
    }

    public static int getSpeed() {
        System.out.println("getSpeed() invoked");
        return 1200;
    }

    public static int getAntennaCount() {
        System.out.println("getAntennaCount() invoked");
        return 4;
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        return 2499.00;
    }
}