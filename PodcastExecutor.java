class PodcastExecutor {

    public static void main(String[] args) {

        Podcast p1 = new Podcast();
        p1.podcastName = "Tech Talks";
        p1.hostName = "Ravi";
        p1.genre = "Technology";
        p1.episodeNumber = 1;
        p1.duration = 45.5;

        Guest g1 = new Guest();
        g1.guestName = "Sundar";
        g1.profession = "CEO";
        g1.age = 50;
        g1.topicDiscussed = "AI and Future";
        g1.isFamous = true;

        p1.guest = g1;
        p1.getPodcastDetails();


        Podcast p2 = new Podcast();
        p2.podcastName = "Health Hub";
        p2.hostName = "Anjali";
        p2.genre = "Health";
        p2.episodeNumber = 2;
        p2.duration = 30.0;

        Guest g2 = new Guest();
        g2.guestName = "Dr. Mehta";
        g2.profession = "Doctor";
        g2.age = 45;
        g2.topicDiscussed = "Fitness Tips";
        g2.isFamous = true;

        p2.guest = g2;
        p2.getPodcastDetails();


        Podcast p3 = new Podcast();
        p3.podcastName = "Startup Stories";
        p3.hostName = "Kiran";
        p3.genre = "Business";
        p3.episodeNumber = 3;
        p3.duration = 50.0;

        Guest g3 = new Guest();
        g3.guestName = "Rohit";
        g3.profession = "Entrepreneur";
        g3.age = 35;
        g3.topicDiscussed = "Startup Journey";
        g3.isFamous = true;

        p3.guest = g3;
        p3.getPodcastDetails();
		  
		  Podcast p4 = new Podcast();
		p4.podcastName = "Finance Talks";
		p4.hostName = "Amit";
		p4.genre = "Finance";
		p4.episodeNumber = 4;
		p4.duration = 40.0;

		Guest g4 = new Guest();
		g4.guestName = "Rakesh";
		g4.profession = "Investor";
		g4.age = 55;
		g4.topicDiscussed = "Stock Market";
		g4.isFamous = true;

		p4.guest = g4;
		p4.getPodcastDetails();


		Podcast p5 = new Podcast();
		p5.podcastName = "Travel Diaries";
		p5.hostName = "Neha";
		p5.genre = "Travel";
		p5.episodeNumber = 5;
		p5.duration = 35.0;

		Guest g5 = new Guest();
		g5.guestName = "Arjun";
		g5.profession = "Traveler";
		g5.age = 32;
		g5.topicDiscussed = "World Tour";
		g5.isFamous = false;

		p5.guest = g5;
		p5.getPodcastDetails();


		Podcast p6 = new Podcast();
		p6.podcastName = "Food Stories";
		p6.hostName = "Priya";
		p6.genre = "Food";
		p6.episodeNumber = 6;
		p6.duration = 28.5;

		Guest g6 = new Guest();
		g6.guestName = "Chef Raj";
		g6.profession = "Chef";
		g6.age = 45;
		g6.topicDiscussed = "Indian Cuisine";
		g6.isFamous = true;

		p6.guest = g6;
		p6.getPodcastDetails();


		Podcast p7 = new Podcast();
		p7.podcastName = "Fitness Freak";
		p7.hostName = "Kiran";
		p7.genre = "Health";
		p7.episodeNumber = 7;
		p7.duration = 30.0;

		Guest g7 = new Guest();
		g7.guestName = "Rohit";
		g7.profession = "Trainer";
		g7.age = 34;
		g7.topicDiscussed = "Workout Tips";
		g7.isFamous = false;

		p7.guest = g7;
		p7.getPodcastDetails();


		Podcast p8 = new Podcast();
		p8.podcastName = "Movie Buzz";
		p8.hostName = "Sneha";
		p8.genre = "Entertainment";
		p8.episodeNumber = 8;
		p8.duration = 50.0;

		Guest g8 = new Guest();
		g8.guestName = "Varun";
		g8.profession = "Actor";
		g8.age = 38;
		g8.topicDiscussed = "Film Industry";
		g8.isFamous = true;

		p8.guest = g8;
		p8.getPodcastDetails();


		Podcast p9 = new Podcast();
		p9.podcastName = "Career Talks";
		p9.hostName = "Anil";
		p9.genre = "Education";
		p9.episodeNumber = 9;
		p9.duration = 42.0;

		Guest g9 = new Guest();
		g9.guestName = "Meena";
		g9.profession = "Teacher";
		g9.age = 40;
		g9.topicDiscussed = "Career Guidance";
		g9.isFamous = false;

		p9.guest = g9;
		p9.getPodcastDetails();


		Podcast p10 = new Podcast();
		p10.podcastName = "Startup Talks";
		p10.hostName = "Ravi";
		p10.genre = "Business";
		p10.episodeNumber = 10;
		p10.duration = 55.0;

		Guest g10 = new Guest();
		g10.guestName = "Sandeep";
		g10.profession = "Entrepreneur";
		g10.age = 36;
		g10.topicDiscussed = "Startup Growth";
		g10.isFamous = true;

		p10.guest = g10;
		p10.getPodcastDetails();


		Podcast p11 = new Podcast();
		p11.podcastName = "Mind Matters";
		p11.hostName = "Divya";
		p11.genre = "Psychology";
		p11.episodeNumber = 11;
		p11.duration = 33.0;

		Guest g11 = new Guest();
		g11.guestName = "Dr. Kumar";
		g11.profession = "Psychologist";
		g11.age = 48;
		g11.topicDiscussed = "Mental Health";
		g11.isFamous = true;

		p11.guest = g11;
		p11.getPodcastDetails();


		Podcast p12 = new Podcast();
		p12.podcastName = "Science Talks";
		p12.hostName = "Arun";
		p12.genre = "Science";
		p12.episodeNumber = 12;
		p12.duration = 45.0;

		Guest g12 = new Guest();
		g12.guestName = "Dr. Rao";
		g12.profession = "Scientist";
		g12.age = 52;
		g12.topicDiscussed = "Space Research";
		g12.isFamous = true;

		p12.guest = g12;
		p12.getPodcastDetails();


		Podcast p13 = new Podcast();
		p13.podcastName = "Fashion Hub";
		p13.hostName = "Ritika";
		p13.genre = "Fashion";
		p13.episodeNumber = 13;
		p13.duration = 29.0;

		Guest g13 = new Guest();
		g13.guestName = "Ananya";
		g13.profession = "Designer";
		g13.age = 30;
		g13.topicDiscussed = "Trends";
		g13.isFamous = false;

		p13.guest = g13;
		p13.getPodcastDetails();


		Podcast p14 = new Podcast();
		p14.podcastName = "Gaming Zone";
		p14.hostName = "Vikram";
		p14.genre = "Gaming";
		p14.episodeNumber = 14;
		p14.duration = 38.0;

		Guest g14 = new Guest();
		g14.guestName = "Ajay";
		g14.profession = "Gamer";
		g14.age = 27;
		g14.topicDiscussed = "eSports";
		g14.isFamous = true;

		p14.guest = g14;
		p14.getPodcastDetails();


		Podcast p15 = new Podcast();
		p15.podcastName = "History Talks";
		p15.hostName = "Megha";
		p15.genre = "History";
		p15.episodeNumber = 15;
		p15.duration = 41.0;

		Guest g15 = new Guest();
		g15.guestName = "Prof. Sharma";
		g15.profession = "Historian";
		g15.age = 60;
		g15.topicDiscussed = "Ancient India";
		g15.isFamous = true;

		p15.guest = g15;
		p15.getPodcastDetails();


		Podcast p16 = new Podcast();
		p16.podcastName = "Music Beats";
		p16.hostName = "Rahul";
		p16.genre = "Music";
		p16.episodeNumber = 16;
		p16.duration = 36.0;

		Guest g16 = new Guest();
		g16.guestName = "Armaan";
		g16.profession = "Singer";
		g16.age = 35;
		g16.topicDiscussed = "Music Journey";
		g16.isFamous = true;

		p16.guest = g16;
		p16.getPodcastDetails();


		Podcast p17 = new Podcast();
		p17.podcastName = "Tech Trends";
		p17.hostName = "Suresh";
		p17.genre = "Technology";
		p17.episodeNumber = 17;
		p17.duration = 47.0;

		Guest g17 = new Guest();
		g17.guestName = "Nikhil";
		g17.profession = "Engineer";
		g17.age = 33;
		g17.topicDiscussed = "AI & ML";
		g17.isFamous = false;

		p17.guest = g17;
		p17.getPodcastDetails();


		Podcast p18 = new Podcast();
		p18.podcastName = "Legal Talks";
		p18.hostName = "Anita";
		p18.genre = "Law";
		p18.episodeNumber = 18;
		p18.duration = 39.0;

		Guest g18 = new Guest();
		g18.guestName = "Adv. Reddy";
		g18.profession = "Lawyer";
		g18.age = 45;
		g18.topicDiscussed = "Legal Rights";
		g18.isFamous = true;

		p18.guest = g18;
		p18.getPodcastDetails();


		Podcast p19 = new Podcast();
		p19.podcastName = "Art & Craft";
		p19.hostName = "Keerthi";
		p19.genre = "Art";
		p19.episodeNumber = 19;
		p19.duration = 25.0;

		Guest g19 = new Guest();
		g19.guestName = "Pooja";
		g19.profession = "Artist";
		g19.age = 28;
		g19.topicDiscussed = "Painting";
		g19.isFamous = false;

		p19.guest = g19;
		p19.getPodcastDetails();


		Podcast p20 = new Podcast();
		p20.podcastName = "Motivation Hub";
		p20.hostName = "Deepak";
		p20.genre = "Motivation";
		p20.episodeNumber = 20;
		p20.duration = 50.0;

		Guest g20 = new Guest();
		g20.guestName = "Sandeep";
		g20.profession = "Motivational Speaker";
		g20.age = 42;
		g20.topicDiscussed = "Success Tips";
		g20.isFamous = true;

		p20.guest = g20;
		p20.getPodcastDetails();
			}
		}