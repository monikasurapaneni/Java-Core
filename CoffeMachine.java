class CoffeeMachine {

    public static String getBrand() {
        System.out.println("getBrand() invoked");
        return "Philips";
    }

    public static String getType() {
        System.out.println("getType() invoked");
        return "Automatic";
    }

    public static int getWaterTankCapacity() {
        System.out.println("getWaterTankCapacity() invoked");
        return 2;
    }

    public static int getPower() {
        System.out.println("getPower() invoked");
        return 1000;
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        return 8999.00;
    }
}