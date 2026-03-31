class ChessBoardRunner {
    public static void main(String[] args) {

        ChessBoard c1 = new ChessBoard();
        ChessBoard c2 = new ChessBoard("Wood");
        ChessBoard c3 = new ChessBoard("Wood", 8);
        ChessBoard c4 = new ChessBoard("Plastic", 10, "Black");
        ChessBoard c5 = new ChessBoard("Wood", 8, "Brown", "Classic");
        ChessBoard c6 = new ChessBoard("Wood", 8, "Brown", "Premium", 1200);

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
        c6.display();
    }
}