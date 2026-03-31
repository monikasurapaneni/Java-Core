class ChessBoard {
    String material;
    int size;
    String color;
    String type;
    double price;

    ChessBoard() {
        System.out.println("ChessBoard created using default constructor");
    }

    ChessBoard(String material) {
        this.material = material;
    }

    ChessBoard(String material, int size) {
        this.material = material;
        this.size = size;
    }

    ChessBoard(String material, int size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
    }

    ChessBoard(String material, int size, String color, String type) {
        this.material = material;
        this.size = size;
        this.color = color;
        this.type = type;
    }

    ChessBoard(String material, int size, String color, String type, double price) {
        this.material = material;
        this.size = size;
        this.color = color;
        this.type = type;
        this.price = price;
    }

    void display() {
        System.out.println(material + " " + size + " " + color + " " + type + " " + price);
    }
}