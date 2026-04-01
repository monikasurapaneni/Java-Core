class MovieExecutor {

    public static void main(String[] args) {

        Movie m1 = new Movie();
        m1.movieName = "RRR";
        m1.director = "S.S. Rajamouli";
        m1.genre = "Action";
        m1.releaseYear = 2022;
        m1.rating = 8.5;

        Actor a1 = new Actor();
        a1.actorName = "NTR";
        a1.age = 40;
        a1.nationality = "Indian";
        a1.numberOfMovies = 30;
        a1.isAwardWinner = true;

        m1.actor = a1;
        m1.getMovieDetails();

        Movie m2 = new Movie();
        m2.movieName = "Pushpa";
        m2.director = "Sukumar";
        m2.genre = "Action";
        m2.releaseYear = 2021;
        m2.rating = 8.0;

        Actor a2 = new Actor();
        a2.actorName = "Allu Arjun";
        a2.age = 42;
        a2.nationality = "Indian";
        a2.numberOfMovies = 25;
        a2.isAwardWinner = true;

        m2.actor = a2;
        m2.getMovieDetails();

        Movie m3 = new Movie();
        m3.movieName = "Jawan";
        m3.director = "Atlee";
        m3.genre = "Action";
        m3.releaseYear = 2023;
        m3.rating = 7.8;

        Actor a3 = new Actor();
        a3.actorName = "Shah Rukh Khan";
        a3.age = 58;
        a3.nationality = "Indian";
        a3.numberOfMovies = 80;
        a3.isAwardWinner = true;

        m3.actor = a3;
        m3.getMovieDetails();
		
		Movie m4 = new Movie();
		m4.movieName = "Salaar";
		m4.director = "Prashanth Neel";
		m4.genre = "Action";
		m4.releaseYear = 2023;
		m4.rating = 8.2;

		Actor a4 = new Actor();
		a4.actorName = "Prabhas";
		a4.age = 44;
		a4.nationality = "Indian";
		a4.numberOfMovies = 25;
		a4.isAwardWinner = true;

		m4.actor = a4;
		m4.getMovieDetails();


		Movie m5 = new Movie();
		m5.movieName = "Leo";
		m5.director = "Lokesh Kanagaraj";
		m5.genre = "Action";
		m5.releaseYear = 2023;
		m5.rating = 7.9;

		Actor a5 = new Actor();
		a5.actorName = "Vijay";
		a5.age = 49;
		a5.nationality = "Indian";
		a5.numberOfMovies = 60;
		a5.isAwardWinner = true;

		m5.actor = a5;
		m5.getMovieDetails();


		Movie m6 = new Movie();
		m6.movieName = "Kantara";
		m6.director = "Rishab Shetty";
		m6.genre = "Drama";
		m6.releaseYear = 2022;
		m6.rating = 8.7;

		Actor a6 = new Actor();
		a6.actorName = "Rishab Shetty";
		a6.age = 40;
		a6.nationality = "Indian";
		a6.numberOfMovies = 10;
		a6.isAwardWinner = true;

		m6.actor = a6;
		m6.getMovieDetails();


		Movie m7 = new Movie();
		m7.movieName = "KGF";
		m7.director = "Prashanth Neel";
		m7.genre = "Action";
		m7.releaseYear = 2018;
		m7.rating = 8.2;

		Actor a7 = new Actor();
		a7.actorName = "Yash";
		a7.age = 38;
		a7.nationality = "Indian";
		a7.numberOfMovies = 20;
		a7.isAwardWinner = true;

		m7.actor = a7;
		m7.getMovieDetails();


		Movie m8 = new Movie();
		m8.movieName = "Baahubali";
		m8.director = "S.S. Rajamouli";
		m8.genre = "Epic";
		m8.releaseYear = 2015;
		m8.rating = 8.0;

		Actor a8 = new Actor();
		a8.actorName = "Prabhas";
		a8.age = 44;
		a8.nationality = "Indian";
		a8.numberOfMovies = 25;
		a8.isAwardWinner = true;

		m8.actor = a8;
		m8.getMovieDetails();


		Movie m9 = new Movie();
		m9.movieName = "Animal";
		m9.director = "Sandeep Reddy Vanga";
		m9.genre = "Crime";
		m9.releaseYear = 2023;
		m9.rating = 7.6;

		Actor a9 = new Actor();
		a9.actorName = "Ranbir Kapoor";
		a9.age = 42;
		a9.nationality = "Indian";
		a9.numberOfMovies = 30;
		a9.isAwardWinner = true;

		m9.actor = a9;
		m9.getMovieDetails();


		Movie m10 = new Movie();
		m10.movieName = "Pathaan";
		m10.director = "Siddharth Anand";
		m10.genre = "Action";
		m10.releaseYear = 2023;
		m10.rating = 7.5;

		Actor a10 = new Actor();
		a10.actorName = "Shah Rukh Khan";
		a10.age = 58;
		a10.nationality = "Indian";
		a10.numberOfMovies = 80;
		a10.isAwardWinner = true;

		m10.actor = a10;
		m10.getMovieDetails();


		Movie m11 = new Movie();
		m11.movieName = "Dangal";
		m11.director = "Nitesh Tiwari";
		m11.genre = "Sports";
		m11.releaseYear = 2016;
		m11.rating = 8.8;

		Actor a11 = new Actor();
		a11.actorName = "Aamir Khan";
		a11.age = 59;
		a11.nationality = "Indian";
		a11.numberOfMovies = 50;
		a11.isAwardWinner = true;

		m11.actor = a11;
		m11.getMovieDetails();


		Movie m12 = new Movie();
		m12.movieName = "3 Idiots";
		m12.director = "Rajkumar Hirani";
		m12.genre = "Comedy";
		m12.releaseYear = 2009;
		m12.rating = 8.4;

		Actor a12 = new Actor();
		a12.actorName = "Aamir Khan";
		a12.age = 59;
		a12.nationality = "Indian";
		a12.numberOfMovies = 50;
		a12.isAwardWinner = true;

		m12.actor = a12;
		m12.getMovieDetails();


		Movie m13 = new Movie();
		m13.movieName = "Drishyam";
		m13.director = "Jeethu Joseph";
		m13.genre = "Thriller";
		m13.releaseYear = 2015;
		m13.rating = 8.2;

		Actor a13 = new Actor();
		a13.actorName = "Ajay Devgn";
		a13.age = 55;
		a13.nationality = "Indian";
		a13.numberOfMovies = 90;
		a13.isAwardWinner = true;

		m13.actor = a13;
		m13.getMovieDetails();


		Movie m14 = new Movie();
		m14.movieName = "War";
		m14.director = "Siddharth Anand";
		m14.genre = "Action";
		m14.releaseYear = 2019;
		m14.rating = 7.1;

		Actor a14 = new Actor();
		a14.actorName = "Hrithik Roshan";
		a14.age = 50;
		a14.nationality = "Indian";
		a14.numberOfMovies = 40;
		a14.isAwardWinner = true;

		m14.actor = a14;
		m14.getMovieDetails();


		Movie m15 = new Movie();
		m15.movieName = "PK";
		m15.director = "Rajkumar Hirani";
		m15.genre = "Comedy";
		m15.releaseYear = 2014;
		m15.rating = 8.1;

		Actor a15 = new Actor();
		a15.actorName = "Aamir Khan";
		a15.age = 59;
		a15.nationality = "Indian";
		a15.numberOfMovies = 50;
		a15.isAwardWinner = true;

		m15.actor = a15;
		m15.getMovieDetails();


		Movie m16 = new Movie();
		m16.movieName = "Sultan";
		m16.director = "Ali Abbas Zafar";
		m16.genre = "Sports";
		m16.releaseYear = 2016;
		m16.rating = 7.0;

		Actor a16 = new Actor();
		a16.actorName = "Salman Khan";
		a16.age = 58;
		a16.nationality = "Indian";
		a16.numberOfMovies = 100;
		a16.isAwardWinner = true;

		m16.actor = a16;
		m16.getMovieDetails();


		Movie m17 = new Movie();
		m17.movieName = "Kabir Singh";
		m17.director = "Sandeep Reddy Vanga";
		m17.genre = "Romance";
		m17.releaseYear = 2019;
		m17.rating = 7.0;

		Actor a17 = new Actor();
		a17.actorName = "Shahid Kapoor";
		a17.age = 43;
		a17.nationality = "Indian";
		a17.numberOfMovies = 35;
		a17.isAwardWinner = true;

		m17.actor = a17;
		m17.getMovieDetails();


		Movie m18 = new Movie();
		m18.movieName = "Zindagi Na Milegi Dobara";
		m18.director = "Zoya Akhtar";
		m18.genre = "Drama";
		m18.releaseYear = 2011;
		m18.rating = 8.2;

		Actor a18 = new Actor();
		a18.actorName = "Hrithik Roshan";
		a18.age = 50;
		a18.nationality = "Indian";
		a18.numberOfMovies = 40;
		a18.isAwardWinner = true;

		m18.actor = a18;
		m18.getMovieDetails();


		Movie m19 = new Movie();
		m19.movieName = "Chennai Express";
		m19.director = "Rohit Shetty";
		m19.genre = "Comedy";
		m19.releaseYear = 2013;
		m19.rating = 6.9;

		Actor a19 = new Actor();
		a19.actorName = "Shah Rukh Khan";
		a19.age = 58;
		a19.nationality = "Indian";
		a19.numberOfMovies = 80;
		a19.isAwardWinner = true;

		m19.actor = a19;
		m19.getMovieDetails();


		Movie m20 = new Movie();
		m20.movieName = "Pushpa 2";
		m20.director = "Sukumar";
		m20.genre = "Action";
		m20.releaseYear = 2024;
		m20.rating = 8.3;

		Actor a20 = new Actor();
		a20.actorName = "Allu Arjun";
		a20.age = 42;
		a20.nationality = "Indian";
		a20.numberOfMovies = 25;
		a20.isAwardWinner = true;

		m20.actor = a20;
		m20.getMovieDetails();
    }
}