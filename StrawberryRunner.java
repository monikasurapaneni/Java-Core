class StrawberryRunner {
    public static void main(String[] args) {

        Strawberry s1 = new Strawberry();
        Strawberry s2 = new Strawberry("Red");
        Strawberry s3 = new Strawberry("Red", "Sweet");
        Strawberry s4 = new Strawberry("Red", "Sweet", 0.5);
        Strawberry s5 = new Strawberry("Red", "Sweet", 0.5, "Ooty");
        Strawberry s6 = new Strawberry("Red", "Sweet", 0.5, "Ooty", 200);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();
    }
}