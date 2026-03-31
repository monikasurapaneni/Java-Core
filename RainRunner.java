class RainRunner {
    public static void main(String[] args) {

        Rain r1 = new Rain();
        Rain r2 = new Rain("Heavy");
        Rain r3 = new Rain("Light", 3.5);
        Rain r4 = new Rain("Moderate", 5.0, "Monsoon");
        Rain r5 = new Rain("Heavy", 8.0, "Monsoon", "City");
        Rain r6 = new Rain("Light", 2.5, "Winter", "Village", 3);

        r1.display();
        r2.display();
        r3.display();
        r4.display();
        r5.display();
        r6.display();
    }
}