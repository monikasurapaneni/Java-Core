class Umbrella {
    String color;
    String type;
    double size;
    String material;
    int price;

    Umbrella() {
        System.out.println("Umbrella created using default constructor");
    }

    Umbrella(String color) {
        this.color = color;
    }

    Umbrella(String color, String type) {
        this.color = color;
        this.type = type;
    }

    Umbrella(String color, String type, double size) {
        this.color = color;
        this.type = type;
        this.size = size;
    }

    Umbrella(String color, String type, double size, String material) {
        this.color = color;
        this.type = type;
        this.size = size;
        this.material = material;
    }

    Umbrella(String color, String type, double size, String material, int price) {
        this.color = color;
        this.type = type;
        this.size = size;
        this.material = material;
        this.price = price;
    }

    void display() {
        System.out.println(color + " " + type + " " + size + " " + material + " " + price);
    }
}