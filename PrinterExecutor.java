class PrinterExecutor {

    public static void main(String[] args) {

        System.out.println("Main Started");

        System.out.println("Brand: " + Printer.getBrand());
        System.out.println("Type: " + Printer.getType());
        System.out.println("Color Print: " + Printer.isColorPrint());
        System.out.println("Print Speed: " + Printer.getPrintSpeed() + " ppm");
        System.out.println("Price: " + Printer.getPrice());

        System.out.println("Main Ended");
    }
}