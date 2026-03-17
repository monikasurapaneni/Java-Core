class Book {
    public static String getTitle() {
        System.out.println("getTitle() invoked");
        return "Java Programming Basics";
    }

    public static String getAuthor() {
        System.out.println("getAuthor() invoked");
        return "James Gosling";
    }

    public static String getPublisher() {
        System.out.println("getPublisher() invoked");
        return "Oracle Press";
    }

    public static String getPrice() {
        System.out.println("getPrice() invoked");
        return "499 INR";
    }

    public static String getPages() {
        System.out.println("getPages() invoked");
        return "550 Pages";
    }
}