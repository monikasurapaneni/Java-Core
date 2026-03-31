class Pawn {
    String color;
    String position;
    String type;
    int moves;
    String status;

    Pawn() {
        System.out.println("Pawn created using default constructor");
    }

    Pawn(String color) {
        this.color = color;
    }

    Pawn(String color, String position) {
        this.color = color;
        this.position = position;
    }

    Pawn(String color, String position, String type) {
        this.color = color;
        this.position = position;
        this.type = type;
    }

    Pawn(String color, String position, String type, int moves) {
        this.color = color;
        this.position = position;
        this.type = type;
        this.moves = moves;
    }

    Pawn(String color, String position, String type, int moves, String status) {
        this.color = color;
        this.position = position;
        this.type = type;
        this.moves = moves;
        this.status = status;
    }

    void display() {
        System.out.println(color + " " + position + " " + type + " " + moves + " " + status);
    }
}