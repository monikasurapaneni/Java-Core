class Strawberry {
    String color;
    String taste;
    double weight;
    String origin;
    int price;

    Strawberry() {
        System.out.println("Strawberry created using default constructor");
    }

    Strawberry(String color) {
        this.color = color;
    }

    Strawberry(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    Strawberry(String color, String taste, double weight) {
        this.color = color;
        this.taste = taste;
        this.weight = weight;
    }

    Strawberry(String color, String taste, double weight, String origin) {
        this.color = color;
        this.taste = taste;
        this.weight = weight;
        this.origin = origin;
    }

    Strawberry(String color, String taste, double weight, String origin, int price) {
        this.color = color;
        this.taste = taste;
        this.weight = weight;
        this.origin = origin;
        this.price = price;
    }

    void display() {
        System.out.println(color + " " + taste + " " + weight + " " + origin + " " + price);
    }
}
