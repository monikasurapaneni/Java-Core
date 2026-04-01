class Movie {

    String movieName;
    String director;
    String genre;
    int releaseYear;
    double rating;

    Actor actor; 

    public void getMovieDetails() {
        System.out.println("Movie Details:");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Director: " + director);
        System.out.println("Genre: " + genre);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating);
        System.out.println("--------------------------------");

        actor.getActorDetails();

        System.out.println("=================================");
    }
}