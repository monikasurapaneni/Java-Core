class OTTPlatformExecutor {

    public static void main(String[] args) {

        OTTPlatform o1 = new OTTPlatform();
        o1.platformName = "Netflix";
        o1.appVersion = "7.0";
        o1.availableContent = "Movies & Series";
        o1.numberOfUsers = 200000000;
        o1.supportedDevices = "Mobile, TV, Laptop";

        Subscription s1 = new Subscription();
        s1.planName = "Premium";
        s1.price = 799;
        s1.validityDays = 30;
        s1.quality = "4K";
        s1.isAutoRenewal = true;

        o1.subscription = s1;
        o1.getOTTDetails();


        OTTPlatform o2 = new OTTPlatform();
        o2.platformName = "Amazon Prime";
        o2.appVersion = "6.5";
        o2.availableContent = "Movies & Originals";
        o2.numberOfUsers = 150000000;
        o2.supportedDevices = "Mobile, TV";

        Subscription s2 = new Subscription();
        s2.planName = "Annual";
        s2.price = 1499;
        s2.validityDays = 365;
        s2.quality = "HD";
        s2.isAutoRenewal = true;

        o2.subscription = s2;
        o2.getOTTDetails();


        OTTPlatform o3 = new OTTPlatform();
        o3.platformName = "Disney+ Hotstar";
        o3.appVersion = "5.2";
        o3.availableContent = "Sports & Movies";
        o3.numberOfUsers = 120000000;
        o3.supportedDevices = "Mobile, TV";

        Subscription s3 = new Subscription();
        s3.planName = "VIP";
        s3.price = 499;
        s3.validityDays = 365;
        s3.quality = "HD";
        s3.isAutoRenewal = false;

        o3.subscription = s3;
        o3.getOTTDetails();
		OTTPlatform o4 = new OTTPlatform();
		o4.platformName = "Sony LIV";
		o4.appVersion = "4.8";
		o4.availableContent = "Sports & Shows";
		o4.numberOfUsers = 80000000;
		o4.supportedDevices = "Mobile, TV";

		Subscription s4 = new Subscription();
		s4.planName = "Monthly";
		s4.price = 299;
		s4.validityDays = 30;
		s4.quality = "HD";
		s4.isAutoRenewal = true;

		o4.subscription = s4;
		o4.getOTTDetails();


		OTTPlatform o5 = new OTTPlatform();
		o5.platformName = "Zee5";
		o5.appVersion = "5.0";
		o5.availableContent = "Movies & Serials";
		o5.numberOfUsers = 90000000;
		o5.supportedDevices = "Mobile, Laptop";

		Subscription s5 = new Subscription();
		s5.planName = "Premium";
		s5.price = 599;
		s5.validityDays = 365;
		s5.quality = "Full HD";
		s5.isAutoRenewal = false;

		o5.subscription = s5;
		o5.getOTTDetails();


		OTTPlatform o6 = new OTTPlatform();
		o6.platformName = "JioCinema";
		o6.appVersion = "3.5";
		o6.availableContent = "Sports & Movies";
		o6.numberOfUsers = 100000000;
		o6.supportedDevices = "Mobile";

		Subscription s6 = new Subscription();
		s6.planName = "Free";
		s6.price = 0;
		s6.validityDays = 365;
		s6.quality = "HD";
		s6.isAutoRenewal = false;

		o6.subscription = s6;
		o6.getOTTDetails();


		OTTPlatform o7 = new OTTPlatform();
		o7.platformName = "Apple TV+";
		o7.appVersion = "6.2";
		o7.availableContent = "Originals";
		o7.numberOfUsers = 60000000;
		o7.supportedDevices = "Mobile, TV";

		Subscription s7 = new Subscription();
		s7.planName = "Monthly";
		s7.price = 99;
		s7.validityDays = 30;
		s7.quality = "4K";
		s7.isAutoRenewal = true;

		o7.subscription = s7;
		o7.getOTTDetails();


		OTTPlatform o8 = new OTTPlatform();
		o8.platformName = "MX Player";
		o8.appVersion = "5.4";
		o8.availableContent = "Free Movies";
		o8.numberOfUsers = 110000000;
		o8.supportedDevices = "Mobile";

		Subscription s8 = new Subscription();
		s8.planName = "Free";
		s8.price = 0;
		s8.validityDays = 365;
		s8.quality = "HD";
		s8.isAutoRenewal = false;

		o8.subscription = s8;
		o8.getOTTDetails();


		OTTPlatform o9 = new OTTPlatform();
		o9.platformName = "ALT Balaji";
		o9.appVersion = "4.2";
		o9.availableContent = "Web Series";
		o9.numberOfUsers = 30000000;
		o9.supportedDevices = "Mobile";

		Subscription s9 = new Subscription();
		s9.planName = "Quarterly";
		s9.price = 199;
		s9.validityDays = 90;
		s9.quality = "HD";
		s9.isAutoRenewal = false;

		o9.subscription = s9;
		o9.getOTTDetails();


		OTTPlatform o10 = new OTTPlatform();
		o10.platformName = "Voot";
		o10.appVersion = "4.0";
		o10.availableContent = "TV Shows";
		o10.numberOfUsers = 50000000;
		o10.supportedDevices = "Mobile, TV";

		Subscription s10 = new Subscription();
		s10.planName = "Select";
		s10.price = 299;
		s10.validityDays = 365;
		s10.quality = "HD";
		s10.isAutoRenewal = true;

		o10.subscription = s10;
		o10.getOTTDetails();


		OTTPlatform o11 = new OTTPlatform();
		o11.platformName = "Hungama Play";
		o11.appVersion = "3.8";
		o11.availableContent = "Music & Movies";
		o11.numberOfUsers = 20000000;
		o11.supportedDevices = "Mobile";

		Subscription s11 = new Subscription();
		s11.planName = "Basic";
		s11.price = 99;
		s11.validityDays = 30;
		s11.quality = "SD";
		s11.isAutoRenewal = false;

		o11.subscription = s11;
		o11.getOTTDetails();


		OTTPlatform o12 = new OTTPlatform();
		o12.platformName = "Discovery+";
		o12.appVersion = "2.5";
		o12.availableContent = "Documentaries";
		o12.numberOfUsers = 40000000;
		o12.supportedDevices = "Mobile, TV";

		Subscription s12 = new Subscription();
		s12.planName = "Monthly";
		s12.price = 299;
		s12.validityDays = 30;
		s12.quality = "Full HD";
		s12.isAutoRenewal = true;

		o12.subscription = s12;
		o12.getOTTDetails();


		OTTPlatform o13 = new OTTPlatform();
		o13.platformName = "Sun NXT";
		o13.appVersion = "3.9";
		o13.availableContent = "South Movies";
		o13.numberOfUsers = 25000000;
		o13.supportedDevices = "Mobile";

		Subscription s13 = new Subscription();
		s13.planName = "Annual";
		s13.price = 799;
		s13.validityDays = 365;
		s13.quality = "HD";
		s13.isAutoRenewal = true;

		o13.subscription = s13;
		o13.getOTTDetails();


		OTTPlatform o14 = new OTTPlatform();
		o14.platformName = "Aha";
		o14.appVersion = "4.1";
		o14.availableContent = "Telugu Content";
		o14.numberOfUsers = 20000000;
		o14.supportedDevices = "Mobile, TV";

		Subscription s14 = new Subscription();
		s14.planName = "Monthly";
		s14.price = 199;
		s14.validityDays = 30;
		s14.quality = "HD";
		s14.isAutoRenewal = false;

		o14.subscription = s14;
		o14.getOTTDetails();


		OTTPlatform o15 = new OTTPlatform();
		o15.platformName = "Eros Now";
		o15.appVersion = "3.6";
		o15.availableContent = "Bollywood";
		o15.numberOfUsers = 35000000;
		o15.supportedDevices = "Mobile";

		Subscription s15 = new Subscription();
		s15.planName = "Premium";
		s15.price = 399;
		s15.validityDays = 365;
		s15.quality = "HD";
		s15.isAutoRenewal = true;

		o15.subscription = s15;
		o15.getOTTDetails();


		OTTPlatform o16 = new OTTPlatform();
		o16.platformName = "Tubi";
		o16.appVersion = "2.9";
		o16.availableContent = "Free Movies";
		o16.numberOfUsers = 30000000;
		o16.supportedDevices = "Mobile";

		Subscription s16 = new Subscription();
		s16.planName = "Free";
		s16.price = 0;
		s16.validityDays = 365;
		s16.quality = "HD";
		s16.isAutoRenewal = false;

		o16.subscription = s16;
		o16.getOTTDetails();


		OTTPlatform o17 = new OTTPlatform();
		o17.platformName = "Peacock";
		o17.appVersion = "3.3";
		o17.availableContent = "Shows & Sports";
		o17.numberOfUsers = 45000000;
		o17.supportedDevices = "Mobile, TV";

		Subscription s17 = new Subscription();
		s17.planName = "Premium";
		s17.price = 499;
		s17.validityDays = 365;
		s17.quality = "Full HD";
		s17.isAutoRenewal = true;

		o17.subscription = s17;
		o17.getOTTDetails();


		OTTPlatform o18 = new OTTPlatform();
		o18.platformName = "Paramount+";
		o18.appVersion = "2.7";
		o18.availableContent = "Movies & Series";
		o18.numberOfUsers = 40000000;
		o18.supportedDevices = "Mobile";

		Subscription s18 = new Subscription();
		s18.planName = "Monthly";
		s18.price = 299;
		s18.validityDays = 30;
		s18.quality = "HD";
		s18.isAutoRenewal = true;

		o18.subscription = s18;
		o18.getOTTDetails();


		OTTPlatform o19 = new OTTPlatform();
		o19.platformName = "Crunchyroll";
		o19.appVersion = "5.1";
		o19.availableContent = "Anime";
		o19.numberOfUsers = 60000000;
		o19.supportedDevices = "Mobile, TV";

		Subscription s19 = new Subscription();
		s19.planName = "Fan";
		s19.price = 99;
		s19.validityDays = 30;
		s19.quality = "HD";
		s19.isAutoRenewal = true;

		o19.subscription = s19;
		o19.getOTTDetails();


		OTTPlatform o20 = new OTTPlatform();
		o20.platformName = "HBO Max";
		o20.appVersion = "6.0";
		o20.availableContent = "Movies & Originals";
		o20.numberOfUsers = 70000000;
		o20.supportedDevices = "Mobile, TV";

		Subscription s20 = new Subscription();
		s20.planName = "Premium";
		s20.price = 799;
		s20.validityDays = 30;
		s20.quality = "4K";
		s20.isAutoRenewal = true;

		o20.subscription = s20;
		o20.getOTTDetails();
    }
}