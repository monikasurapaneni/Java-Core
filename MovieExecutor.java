class MovieExecutor {

    public static void main(String[] args){

        Movie movieOne = new Movie();
        movieOne.movieId = 1;
        movieOne.movieName = "Inception";
        movieOne.genre = "Sci-Fi";

        Movie movieTwo = new Movie();
        movieTwo.movieId = 2;
        movieTwo.movieName = "Titanic";
        movieTwo.genre = "Romance";

        Movie movieThree = new Movie();
        movieThree.movieId = 3;
        movieThree.movieName = "Avengers";
        movieThree.genre = "Action";

        Movie movieFour = new Movie();
        movieFour.movieId = 4;
        movieFour.movieName = "Joker";
        movieFour.genre = "Drama";

        Movie movieFive = new Movie();
        movieFive.movieId = 5;
        movieFive.movieName = "Frozen";
        movieFive.genre = "Animation";

        Movie movieSix = new Movie();
        movieSix.movieId = 6;
        movieSix.movieName = "Interstellar";
        movieSix.genre = "Sci-Fi";

        Movie movieSeven = new Movie();
        movieSeven.movieId = 7;
        movieSeven.movieName = "Batman";
        movieSeven.genre = "Action";

        Movie movieEight = new Movie();
        movieEight.movieId = 8;
        movieEight.movieName = "Coco";
        movieEight.genre = "Animation";

        Movie movieNine = new Movie();
        movieNine.movieId = 9;
        movieNine.movieName = "Gladiator";
        movieNine.genre = "Action";

        Movie movieTen = new Movie();
        movieTen.movieId = 10;
        movieTen.movieName = "Notebook";
        movieTen.genre = "Romance";

        Movie movieEleven = new Movie();
        movieEleven.movieId = 11;
        movieEleven.movieName = "Matrix";
        movieEleven.genre = "Sci-Fi";

        Movie movieTwelve = new Movie();
        movieTwelve.movieId = 12;
        movieTwelve.movieName = "Up";
        movieTwelve.genre = "Animation";

        Movie movieThirteen = new Movie();
        movieThirteen.movieId = 13;
        movieThirteen.movieName = "Thor";
        movieThirteen.genre = "Action";

        Movie movieFourteen = new Movie();
        movieFourteen.movieId = 14;
        movieFourteen.movieName = "LaLaLand";
        movieFourteen.genre = "Romance";

        Movie movieFifteen = new Movie();
        movieFifteen.movieId = 15;
        movieFifteen.movieName = "Soul";
        movieFifteen.genre = "Animation";

        Movie movies[] = new Movie[15];

        movies[0] = movieOne;
        movies[1] = movieTwo;
        movies[2] = movieThree;
        movies[3] = movieFour;
        movies[4] = movieFive;
        movies[5] = movieSix;
        movies[6] = movieSeven;
        movies[7] = movieEight;
        movies[8] = movieNine;
        movies[9] = movieTen;
        movies[10] = movieEleven;
        movies[11] = movieTwelve;
        movies[12] = movieThirteen;
        movies[13] = movieFourteen;
        movies[14] = movieFifteen;

        for(Movie movie : movies){
            System.out.println("The movie Id is " + movie.movieId);
            System.out.println("The movie name is " + movie.movieName);
            System.out.println("The genre is " + movie.genre);
            System.out.println("                     ");
        }
    }
}