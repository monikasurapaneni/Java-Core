class Episodes {

    String episodeTitle;
    int episodeNumber;
    double duration;
    String releaseDate;
    boolean isHit;

    public void getEpisodeDetails() {
        System.out.println("Episode Details:");
        System.out.println("Title: " + episodeTitle);
        System.out.println("Episode Number: " + episodeNumber);
        System.out.println("Duration: " + duration);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Hit Episode: " + isHit);
        System.out.println("-----------------------------");
    }
}