class TrackRunner {
    public static void main(String[] args) {

        Track t1 = new Track();
        Track t2 = new Track("Running");
        Track t3 = new Track("Running", 400);
        Track t4 = new Track("Cycling", 1000, "Stadium");
        Track t5 = new Track("Running", 500, "Ground", "Rubber");
        Track t6 = new Track("Running", 400, "Stadium", "Synthetic", 6);

        t1.display();
        t2.display();
        t3.display();
        t4.display();
        t5.display();
        t6.display();
    }
}