class HairDryerRunner {
    public static void main(String[] args) {

        HairDryer h1 = new HairDryer();
        HairDryer h2 = new HairDryer("Philips");
        HairDryer h3 = new HairDryer("Philips", 1200);
        HairDryer h4 = new HairDryer("Nova", 1000, "Pink");
        HairDryer h5 = new HairDryer("Havells", 1500, "Black", "Electric");
        HairDryer h6 = new HairDryer("Dyson", 1800, "Silver", "Advanced", 5000);

        h1.display();
        h2.display();
        h3.display();
        h4.display();
        h5.display();
        h6.display();
    }
}