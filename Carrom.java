class Carrom {
    String type;
    String color;
    int size;
    String material;
    double price;

    Carrom() {
        System.out.println("Carrom created using default constructor");
    }

    Carrom(String type) {
        this.type = type;
    }

    Carrom(String type, String color) {
        this.type = type;
        this.color = color;
    }

    Carrom(String type, String color, int size) {
        this.type = type;
        this.color = color;
        this.size = size;
    }

    Carrom(String type, String color, int size, String material) {
        this.type = type;
        this.color = color;
        this.size = size;
        this.material = material;
    }

    Carrom(String type, String color, int size, String material, double price) {
        this.type = type;
        this.color = color;
        this.size = size;
        this.material = material;
        this.price = price;
    }

    void display() {
        System.out.println(type + " " + color + " " + size + " " + material + " " + price);
    }
}