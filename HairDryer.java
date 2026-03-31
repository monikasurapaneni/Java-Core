class HairDryer {
    String brand;
    int power;
    String color;
    String type;
    double price;

    HairDryer() {
        System.out.println("HairDryer created using default constructor");
    }

    HairDryer(String brand) {
        this.brand = brand;
    }

    HairDryer(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    HairDryer(String brand, int power, String color) {
        this.brand = brand;
        this.power = power;
        this.color = color;
    }

    HairDryer(String brand, int power, String color, String type) {
        this.brand = brand;
        this.power = power;
        this.color = color;
        this.type = type;
    }

    HairDryer(String brand, int power, String color, String type, double price) {
        this.brand = brand;
        this.power = power;
        this.color = color;
        this.type = type;
        this.price = price;
    }

    void display() {
        System.out.println(brand + " " + power + " " + color + " " + type + " " + price);
    }
}