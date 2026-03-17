class GamingConsoleExecutor {

    public static void main(String[] args) {

        System.out.println("Main Started");

        System.out.println("Brand: " + GamingConsole.getBrand());
        System.out.println("Model: " + GamingConsole.getModel());
        System.out.println("Storage: " + GamingConsole.getStorage() + "GB");
        System.out.println("Resolution: " + GamingConsole.getResolutionSupport());
        System.out.println("Price: " + GamingConsole.getPrice());

        System.out.println("Main Ended");
    }
}