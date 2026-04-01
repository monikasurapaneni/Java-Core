class Series {

    String seriesName;
    String genre;
    int seasons;
    String platform;
    double rating;

    Episodes episode; 

    public void getSeriesDetails() {
        System.out.println("Series Details:");
        System.out.println("Series Name: " + seriesName);
        System.out.println("Genre: " + genre);
        System.out.println("Seasons: " + seasons);
        System.out.println("Platform: " + platform);
        System.out.println("Rating: " + rating);
        System.out.println("--------------------------------");

        episode.getEpisodeDetails();

        System.out.println("=================================");
    }
}