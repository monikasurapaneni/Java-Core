class Track {
    String type;
    double length;
    String place;
    String material;
    int lanes;

    Track() {
        System.out.println("Track created using default constructor");
    }

    Track(String type) {
        this.type = type;
    }

    Track(String type, double length) {
        this.type = type;
        this.length = length;
    }

    Track(String type, double length, String place) {
        this.type = type;
        this.length = length;
        this.place = place;
    }

    Track(String type, double length, String place, String material) {
        this.type = type;
        this.length = length;
        this.place = place;
        this.material = material;
    }

    Track(String type, double length, String place, String material, int lanes) {
        this.type = type;
        this.length = length;
        this.place = place;
        this.material = material;
        this.lanes = lanes;
    }

    void display() {
        System.out.println(type + " " + length + " " + place + " " + material + " " + lanes);
    }
}