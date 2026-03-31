class SteelRunner {
    public static void main(String[] args) {

        Steel s1 = new Steel();
        Steel s2 = new Steel("Alloy");
        Steel s3 = new Steel("Alloy", 10.5);
        Steel s4 = new Steel("Carbon", 12.0, "A1");
        Steel s5 = new Steel("Alloy", 15.0, "B2", "Construction");
        Steel s6 = new Steel("Stainless", 20.0, "C3", "Industry", 800);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();
    }
}