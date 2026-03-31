class Book {
    String title;
    String author;
    double price;
    int pages;
    String genre;

    Book() {
        System.out.println("Book created using default constructor");
    }

    Book(String title) {
        this.title = title;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book(String title, String author, double price, int pages) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }

    Book(String title, String author, double price, int pages, String genre) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages = pages;
        this.genre = genre;
    }

    void display() {
        System.out.println(title + " " + author + " " + price + " " + pages + " " + genre);
    }
}