class UmbrellaRunner {
    public static void main(String[] args) {

        Umbrella u1 = new Umbrella();
        Umbrella u2 = new Umbrella("Black");
        Umbrella u3 = new Umbrella("Red", "Fold");
        Umbrella u4 = new Umbrella("Blue", "Stick", 2.5);
        Umbrella u5 = new Umbrella("Pink", "Fold", 2.0, "Nylon");
        Umbrella u6 = new Umbrella("Yellow", "Auto", 2.3, "Polyester", 500);

        u1.display();
        u2.display();
        u3.display();
        u4.display();
        u5.display();
        u6.display();
    }
}