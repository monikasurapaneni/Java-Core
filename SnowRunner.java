class SnowRunner {
    public static void main(String[] args) {

        Snow s1 = new Snow();
        Snow s2 = new Snow("Soft");
        Snow s3 = new Snow("Hard", -5);
        Snow s4 = new Snow("Fluffy", -3, "White");
        Snow s5 = new Snow("Soft", -2, "White", "Hill");
        Snow s6 = new Snow("Hard", -6, "White", "Mountain", 10);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();
    }
}