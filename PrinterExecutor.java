class PrinterExecutor{
    public static void main(String[] args){

        int pages = Printer.getPrintedPages();
        System.out.println("Printed Pages: " + pages);

        Printer.printPage();
        Printer.printPage();

        pages = Printer.getPrintedPages();
        System.out.println("Pages after printing: " + pages);

        Printer.resetPrinter();

        pages = Printer.getPrintedPages();
        System.out.println("Pages after reset: " + pages);
    }
}