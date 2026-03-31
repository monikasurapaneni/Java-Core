class ClipRunner {
    public static void main(String[] args) {

        Clip c1 = new Clip();
        Clip c2 = new Clip("Red");
        Clip c3 = new Clip("Blue", "Hair");
        Clip c4 = new Clip("Black", "Paper", "Steel");
        Clip c5 = new Clip("Pink", "Hair", "Plastic", 2.0);
        Clip c6 = new Clip("Green", "Hair", "Plastic", 1.5, 20);

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
        c6.display();
    }
}