class Snow {
    String type;
    double temperature;
    String color;
    String place;
    int depth;

    Snow() {
        System.out.println("Snow created using default constructor");
    }

    Snow(String type) {
        this.type = type;
    }

    Snow(String type, double temperature) {
        this.type = type;
        this.temperature = temperature;
    }

    Snow(String type, double temperature, String color) {
        this.type = type;
        this.temperature = temperature;
        this.color = color;
    }

    Snow(String type, double temperature, String color, String place) {
        this.type = type;
        this.temperature = temperature;
        this.color = color;
        this.place = place;
    }

    Snow(String type, double temperature, String color, String place, int depth) {
        this.type = type;
        this.temperature = temperature;
        this.color = color;
        this.place = place;
        this.depth = depth;
    }

    void display() {
        System.out.println(type + " " + temperature + " " + color + " " + place + " " + depth);
    }
}