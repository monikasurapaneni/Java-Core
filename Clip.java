class Clip {
    String color;
    String type;
    String material;
    double size;
    int price;

    Clip() {
        System.out.println("Clip created using default constructor");
    }

    Clip(String color) {
        this.color = color;
    }

    Clip(String color, String type) {
        this.color = color;
        this.type = type;
    }

    Clip(String color, String type, String material) {
        this.color = color;
        this.type = type;
        this.material = material;
    }

    Clip(String color, String type, String material, double size) {
        this.color = color;
        this.type = type;
        this.material = material;
        this.size = size;
    }

    Clip(String color, String type, String material, double size, int price) {
        this.color = color;
        this.type = type;
        this.material = material;
        this.size = size;
        this.price = price;
    }

    void display() {
        System.out.println(color + " " + type + " " + material + " " + size + " " + price);
    }
}