class AirConditioner {

    public static String getBrand() {
        System.out.println("getBrand() invoked");
        return "Voltas";
    }

    public static double getTonnage() {
        System.out.println("getTonnage() invoked");
        return 1.5;
    }

    public static String getType() {
        System.out.println("getType() invoked");
        return "Split";
    }

    public static int getEnergyRating() {
        System.out.println("getEnergyRating() invoked");
        return 5;
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        return 42000.00;
    }
}