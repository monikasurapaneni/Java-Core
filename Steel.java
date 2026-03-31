class Steel {
    String type;
    double weight;
    String grade;
    String use;
    double price;

    Steel() {
        System.out.println("Steel created using default constructor");
    }

    Steel(String type) {
        this.type = type;
    }

    Steel(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    Steel(String type, double weight, String grade) {
        this.type = type;
        this.weight = weight;
        this.grade = grade;
    }

    Steel(String type, double weight, String grade, String use) {
        this.type = type;
        this.weight = weight;
        this.grade = grade;
        this.use = use;
    }

    Steel(String type, double weight, String grade, String use, double price) {
        this.type = type;
        this.weight = weight;
        this.grade = grade;
        this.use = use;
        this.price = price;
    }

    void display() {
        System.out.println(type + " " + weight + " " + grade + " " + use + " " + price);
    }
}