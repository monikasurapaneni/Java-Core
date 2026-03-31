class CarromRunner {
    public static void main(String[] args) {

        Carrom c1 = new Carrom();
        Carrom c2 = new Carrom("Standard");
        Carrom c3 = new Carrom("Standard", "Brown");
        Carrom c4 = new Carrom("Deluxe", "Brown", 29);
        Carrom c5 = new Carrom("Standard", "Brown", 29, "Wood");
        Carrom c6 = new Carrom("Premium", "Brown", 32, "Wood", 2000);

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
        c6.display();
    }
}