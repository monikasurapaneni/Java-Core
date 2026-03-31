class BatteryRunner {
    public static void main(String[] args) {

        Battery b1 = new Battery();
        Battery b2 = new Battery("Duracell");
        Battery b3 = new Battery("Sony", 4000);
        Battery b4 = new Battery("LG", 5000, "Li-ion");
        Battery b5 = new Battery("Panasonic", 4500, "Li-ion", 3.7);
        Battery b6 = new Battery("Duracell", 6000, "Li-ion", 3.7, 999);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();
        b6.display();
    }
}