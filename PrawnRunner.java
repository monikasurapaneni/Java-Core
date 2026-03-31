class PawnRunner {
    public static void main(String[] args) {

        Pawn p1 = new Pawn();
        Pawn p2 = new Pawn("White");
        Pawn p3 = new Pawn("Black", "E2");
        Pawn p4 = new Pawn("White", "D4", "Chess");
        Pawn p5 = new Pawn("Black", "E5", "Chess", 2);
        Pawn p6 = new Pawn("White", "E2", "Chess", 1, "Active");

        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
        p6.display();
    }
}