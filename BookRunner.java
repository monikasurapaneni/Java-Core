class BookRunner {
    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Java");
        Book b3 = new Book("Python", "Guido");
        Book b4 = new Book("C++", "Bjarne", 500);
        Book b5 = new Book("DSA", "Author", 700, 350);
        Book b6 = new Book("AI", "John", 900, 400, "Tech");

        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();
        b6.display();
    }
}