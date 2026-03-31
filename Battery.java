class Battery {
    String brand;
    int capacity;
    String type;
    double voltage;
    double price;

    Battery() {
        System.out.println("Battery created using default constructor");
    }

    Battery(String brand) {
        this.brand = brand;
    }

    Battery(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    Battery(String brand, int capacity, String type) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
    }

    Battery(String brand, int capacity, String type, double voltage) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
        this.voltage = voltage;
    }

    Battery(String brand, int capacity, String type, double voltage, double price) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
        this.voltage = voltage;
        this.price = price;
    }

    void display() {
        System.out.println(brand + " " + capacity + " " + type + " " + voltage + " " + price);
    }
}