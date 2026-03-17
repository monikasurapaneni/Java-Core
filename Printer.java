class Printer{

    static int maxPages = 100;
    static int printedPages;

    static int getPrintedPages(){
        return printedPages;
    }

    static void printPage(){
        if(printedPages < maxPages){
            printedPages++;
            System.out.println("Page printed. Total pages: " + printedPages);
        }
        else{
            System.out.println("Printer limit reached");
        }
    }

    static void resetPrinter(){
        printedPages = 0;
        System.out.println("Printer reset");
    }
}