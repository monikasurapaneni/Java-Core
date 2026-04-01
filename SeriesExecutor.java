class SeriesExecutor {

    public static void main(String[] args) {

        Series s1 = new Series();
        s1.seriesName = "Stranger Things";
        s1.genre = "Sci-Fi";
        s1.seasons = 4;
        s1.platform = "Netflix";
        s1.rating = 8.7;

        Episodes e1 = new Episodes();
        e1.episodeTitle = "Chapter One";
        e1.episodeNumber = 1;
        e1.duration = 50.0;
        e1.releaseDate = "2016";
        e1.isHit = true;

        s1.episode = e1;
        s1.getSeriesDetails();


        Series s2 = new Series();
        s2.seriesName = "Money Heist";
        s2.genre = "Crime";
        s2.seasons = 5;
        s2.platform = "Netflix";
        s2.rating = 8.5;

        Episodes e2 = new Episodes();
        e2.episodeTitle = "The Heist Begins";
        e2.episodeNumber = 1;
        e2.duration = 55.0;
        e2.releaseDate = "2017";
        e2.isHit = true;

        s2.episode = e2;
        s2.getSeriesDetails();


        Series s3 = new Series();
        s3.seriesName = "Breaking Bad";
        s3.genre = "Drama";
        s3.seasons = 5;
        s3.platform = "AMC";
        s3.rating = 9.5;

        Episodes e3 = new Episodes();
        e3.episodeTitle = "Pilot";
        e3.episodeNumber = 1;
        e3.duration = 58.0;
        e3.releaseDate = "2008";
        e3.isHit = true;

        s3.episode = e3;
        s3.getSeriesDetails();
		
		Series s4 = new Series();
		s4.seriesName = "Game of Thrones";
		s4.genre = "Fantasy";
		s4.seasons = 8;
		s4.platform = "HBO";
		s4.rating = 9.2;

		Episodes e4 = new Episodes();
		e4.episodeTitle = "Winter Is Coming";
		e4.episodeNumber = 1;
		e4.duration = 60.0;
		e4.releaseDate = "2011";
		e4.isHit = true;

		s4.episode = e4;
		s4.getSeriesDetails();


		Series s5 = new Series();
		s5.seriesName = "Friends";
		s5.genre = "Comedy";
		s5.seasons = 10;
		s5.platform = "Netflix";
		s5.rating = 8.9;

		Episodes e5 = new Episodes();
		e5.episodeTitle = "The Pilot";
		e5.episodeNumber = 1;
		e5.duration = 22.0;
		e5.releaseDate = "1994";
		e5.isHit = true;

		s5.episode = e5;
		s5.getSeriesDetails();


		Series s6 = new Series();
		s6.seriesName = "The Witcher";
		s6.genre = "Fantasy";
		s6.seasons = 3;
		s6.platform = "Netflix";
		s6.rating = 8.2;

		Episodes e6 = new Episodes();
		e6.episodeTitle = "The End's Beginning";
		e6.episodeNumber = 1;
		e6.duration = 61.0;
		e6.releaseDate = "2019";
		e6.isHit = true;

		s6.episode = e6;
		s6.getSeriesDetails();


		Series s7 = new Series();
		s7.seriesName = "Dark";
		s7.genre = "Thriller";
		s7.seasons = 3;
		s7.platform = "Netflix";
		s7.rating = 8.8;

		Episodes e7 = new Episodes();
		e7.episodeTitle = "Secrets";
		e7.episodeNumber = 1;
		e7.duration = 52.0;
		e7.releaseDate = "2017";
		e7.isHit = true;

		s7.episode = e7;
		s7.getSeriesDetails();


		Series s8 = new Series();
		s8.seriesName = "The Boys";
		s8.genre = "Action";
		s8.seasons = 3;
		s8.platform = "Amazon Prime";
		s8.rating = 8.7;

		Episodes e8 = new Episodes();
		e8.episodeTitle = "The Name of the Game";
		e8.episodeNumber = 1;
		e8.duration = 55.0;
		e8.releaseDate = "2019";
		e8.isHit = true;

		s8.episode = e8;
		s8.getSeriesDetails();


		Series s9 = new Series();
		s9.seriesName = "Loki";
		s9.genre = "Sci-Fi";
		s9.seasons = 2;
		s9.platform = "Disney+";
		s9.rating = 8.4;

		Episodes e9 = new Episodes();
		e9.episodeTitle = "Glorious Purpose";
		e9.episodeNumber = 1;
		e9.duration = 52.0;
		e9.releaseDate = "2021";
		e9.isHit = true;

		s9.episode = e9;
		s9.getSeriesDetails();


		Series s10 = new Series();
		s10.seriesName = "Wednesday";
		s10.genre = "Comedy";
		s10.seasons = 1;
		s10.platform = "Netflix";
		s10.rating = 8.1;

		Episodes e10 = new Episodes();
		e10.episodeTitle = "Wednesday's Child";
		e10.episodeNumber = 1;
		e10.duration = 50.0;
		e10.releaseDate = "2022";
		e10.isHit = true;

		s10.episode = e10;
		s10.getSeriesDetails();


		Series s11 = new Series();
		s11.seriesName = "Peaky Blinders";
		s11.genre = "Crime";
		s11.seasons = 6;
		s11.platform = "Netflix";
		s11.rating = 8.8;

		Episodes e11 = new Episodes();
		e11.episodeTitle = "Episode 1";
		e11.episodeNumber = 1;
		e11.duration = 58.0;
		e11.releaseDate = "2013";
		e11.isHit = true;

		s11.episode = e11;
		s11.getSeriesDetails();


		Series s12 = new Series();
		s12.seriesName = "Euphoria";
		s12.genre = "Drama";
		s12.seasons = 2;
		s12.platform = "HBO";
		s12.rating = 8.3;

		Episodes e12 = new Episodes();
		e12.episodeTitle = "Pilot";
		e12.episodeNumber = 1;
		e12.duration = 55.0;
		e12.releaseDate = "2019";
		e12.isHit = true;

		s12.episode = e12;
		s12.getSeriesDetails();


		Series s13 = new Series();
		s13.seriesName = "Mirzapur";
		s13.genre = "Crime";
		s13.seasons = 2;
		s13.platform = "Amazon Prime";
		s13.rating = 8.5;

		Episodes e13 = new Episodes();
		e13.episodeTitle = "Jhandu";
		e13.episodeNumber = 1;
		e13.duration = 45.0;
		e13.releaseDate = "2018";
		e13.isHit = true;

		s13.episode = e13;
		s13.getSeriesDetails();


		Series s14 = new Series();
		s14.seriesName = "Sacred Games";
		s14.genre = "Thriller";
		s14.seasons = 2;
		s14.platform = "Netflix";
		s14.rating = 8.6;

		Episodes e14 = new Episodes();
		e14.episodeTitle = "Ashwathama";
		e14.episodeNumber = 1;
		e14.duration = 50.0;
		e14.releaseDate = "2018";
		e14.isHit = true;

		s14.episode = e14;
		s14.getSeriesDetails();


		Series s15 = new Series();
		s15.seriesName = "The Office";
		s15.genre = "Comedy";
		s15.seasons = 9;
		s15.platform = "Netflix";
		s15.rating = 8.9;

		Episodes e15 = new Episodes();
		e15.episodeTitle = "Pilot";
		e15.episodeNumber = 1;
		e15.duration = 22.0;
		e15.releaseDate = "2005";
		e15.isHit = true;

		s15.episode = e15;
		s15.getSeriesDetails();


		Series s16 = new Series();
		s16.seriesName = "House of the Dragon";
		s16.genre = "Fantasy";
		s16.seasons = 1;
		s16.platform = "HBO";
		s16.rating = 8.5;

		Episodes e16 = new Episodes();
		e16.episodeTitle = "The Heirs of the Dragon";
		e16.episodeNumber = 1;
		e16.duration = 60.0;
		e16.releaseDate = "2022";
		e16.isHit = true;

		s16.episode = e16;
		s16.getSeriesDetails();


		Series s17 = new Series();
		s17.seriesName = "Money Heist Korea";
		s17.genre = "Crime";
		s17.seasons = 1;
		s17.platform = "Netflix";
		s17.rating = 7.5;

		Episodes e17 = new Episodes();
		e17.episodeTitle = "Episode 1";
		e17.episodeNumber = 1;
		e17.duration = 52.0;
		e17.releaseDate = "2022";
		e17.isHit = false;

		s17.episode = e17;
		s17.getSeriesDetails();


		Series s18 = new Series();
		s18.seriesName = "Attack on Titan";
		s18.genre = "Anime";
		s18.seasons = 4;
		s18.platform = "Crunchyroll";
		s18.rating = 9.0;

		Episodes e18 = new Episodes();
		e18.episodeTitle = "To You, in 2000 Years";
		e18.episodeNumber = 1;
		e18.duration = 24.0;
		e18.releaseDate = "2013";
		e18.isHit = true;

		s18.episode = e18;
		s18.getSeriesDetails();


		Series s19 = new Series();
		s19.seriesName = "Demon Slayer";
		s19.genre = "Anime";
		s19.seasons = 3;
		s19.platform = "Netflix";
		s19.rating = 8.7;

		Episodes e19 = new Episodes();
		e19.episodeTitle = "Cruelty";
		e19.episodeNumber = 1;
		e19.duration = 24.0;
		e19.releaseDate = "2019";
		e19.isHit = true;

		s19.episode = e19;
		s19.getSeriesDetails();


		Series s20 = new Series();
		s20.seriesName = "Narcos";
		s20.genre = "Crime";
		s20.seasons = 3;
		s20.platform = "Netflix";
		s20.rating = 8.8;

		Episodes e20 = new Episodes();
		e20.episodeTitle = "Descenso";
		e20.episodeNumber = 1;
		e20.duration = 49.0;
		e20.releaseDate = "2015";
		e20.isHit = true;

		s20.episode = e20;
		s20.getSeriesDetails();
    }
}