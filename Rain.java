class Rain {
    String type;
    double intensity;
    String season;
    String place;
    int duration;

    Rain() {
        System.out.println("Rain created using default constructor");
    }

    Rain(String type) {
        this.type = type;
    }

    Rain(String type, double intensity) {
        this.type = type;
        this.intensity = intensity;
    }

    Rain(String type, double intensity, String season) {
        this.type = type;
        this.intensity = intensity;
        this.season = season;
    }

    Rain(String type, double intensity, String season, String place) {
        this.type = type;
        this.intensity = intensity;
        this.season = season;
        this.place = place;
    }

    Rain(String type, double intensity, String season, String place, int duration) {
        this.type = type;
        this.intensity = intensity;
        this.season = season;
        this.place = place;
        this.duration = duration;
    }

    void display() {
        System.out.println(type + " " + intensity + " " + season + " " + place + " " + duration);
    }
}