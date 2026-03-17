class Printer {

    public static String getBrand() {
        System.out.println("getBrand() invoked");
        return "Canon";
    }

    public static String getType() {
        System.out.println("getType() invoked");
        return "Inkjet";
    }

    public static boolean isColorPrint() {
        System.out.println("isColorPrint() invoked");
        return true;
    }

    public static int getPrintSpeed() {
        System.out.println("getPrintSpeed() invoked");
        return 15;
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        return 9500.00;
    }
}