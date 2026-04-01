class MobileExecutor {

    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.model = "Galaxy S21";
        m1.price = 70000;
        m1.color = "Black";
        m1.storage = "128GB";

        Sim s1 = new Sim();
        s1.provider = "Airtel";
        s1.simType = "Nano";
        s1.networkType = "5G";
        s1.phoneNumber = "9876543210";
        s1.isActive = true;

        m1.sim = s1;
        m1.getMobileDetails();

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.model = "iPhone 13";
        m2.price = 80000;
        m2.color = "Blue";
        m2.storage = "256GB";

        Sim s2 = new Sim();
        s2.provider = "Jio";
        s2.simType = "eSIM";
        s2.networkType = "5G";
        s2.phoneNumber = "9123456780";
        s2.isActive = true;

        m2.sim = s2;
        m2.getMobileDetails();

        Mobile m3 = new Mobile();
        m3.brand = "OnePlus";
        m3.model = "9 Pro";
        m3.price = 65000;
        m3.color = "Green";
        m3.storage = "128GB";

        Sim s3 = new Sim();
        s3.provider = "Vi";
        s3.simType = "Nano";
        s3.networkType = "4G";
        s3.phoneNumber = "9988776655";
        s3.isActive = false;

        m3.sim = s3;
        m3.getMobileDetails();
		
		Mobile m4 = new Mobile();
		m4.brand = "Vivo";
		m4.model = "V23";
		m4.price = 30000;
		m4.color = "Gold";
		m4.storage = "128GB";

		Sim s4 = new Sim();
		s4.provider = "Airtel";
		s4.simType = "Nano";
		s4.networkType = "5G";
		s4.phoneNumber = "9000000004";
		s4.isActive = true;

		m4.sim = s4;
		m4.getMobileDetails();


		Mobile m5 = new Mobile();
		m5.brand = "Oppo";
		m5.model = "Reno 8";
		m5.price = 32000;
		m5.color = "Black";
		m5.storage = "256GB";

		Sim s5 = new Sim();
		s5.provider = "Jio";
		s5.simType = "Nano";
		s5.networkType = "5G";
		s5.phoneNumber = "9000000005";
		s5.isActive = true;

		m5.sim = s5;
		m5.getMobileDetails();


		Mobile m6 = new Mobile();
		m6.brand = "Realme";
		m6.model = "GT Neo";
		m6.price = 28000;
		m6.color = "Blue";
		m6.storage = "128GB";

		Sim s6 = new Sim();
		s6.provider = "Vi";
		s6.simType = "Nano";
		s6.networkType = "4G";
		s6.phoneNumber = "9000000006";
		s6.isActive = false;

		m6.sim = s6;
		m6.getMobileDetails();


		Mobile m7 = new Mobile();
		m7.brand = "Redmi";
		m7.model = "Note 12";
		m7.price = 20000;
		m7.color = "Grey";
		m7.storage = "128GB";

		Sim s7 = new Sim();
		s7.provider = "Airtel";
		s7.simType = "Nano";
		s7.networkType = "4G";
		s7.phoneNumber = "9000000007";
		s7.isActive = true;

		m7.sim = s7;
		m7.getMobileDetails();


		Mobile m8 = new Mobile();
		m8.brand = "iQOO";
		m8.model = "Neo 7";
		m8.price = 35000;
		m8.color = "Orange";
		m8.storage = "256GB";

		Sim s8 = new Sim();
		s8.provider = "Jio";
		s8.simType = "Nano";
		s8.networkType = "5G";
		s8.phoneNumber = "9000000008";
		s8.isActive = true;

		m8.sim = s8;
		m8.getMobileDetails();


		Mobile m9 = new Mobile();
		m9.brand = "Motorola";
		m9.model = "Edge 30";
		m9.price = 30000;
		m9.color = "Black";
		m9.storage = "128GB";

		Sim s9 = new Sim();
		s9.provider = "Vi";
		s9.simType = "Nano";
		s9.networkType = "4G";
		s9.phoneNumber = "9000000009";
		s9.isActive = false;

		m9.sim = s9;
		m9.getMobileDetails();


		Mobile m10 = new Mobile();
		m10.brand = "Nokia";
		m10.model = "G21";
		m10.price = 15000;
		m10.color = "Blue";
		m10.storage = "64GB";

		Sim s10 = new Sim();
		s10.provider = "BSNL";
		s10.simType = "Nano";
		s10.networkType = "4G";
		s10.phoneNumber = "9000000010";
		s10.isActive = true;

		m10.sim = s10;
		m10.getMobileDetails();


		Mobile m11 = new Mobile();
		m11.brand = "Sony";
		m11.model = "Xperia 5";
		m11.price = 60000;
		m11.color = "Black";
		m11.storage = "128GB";

		Sim s11 = new Sim();
		s11.provider = "Airtel";
		s11.simType = "Nano";
		s11.networkType = "5G";
		s11.phoneNumber = "9000000011";
		s11.isActive = true;

		m11.sim = s11;
		m11.getMobileDetails();


		Mobile m12 = new Mobile();
		m12.brand = "Asus";
		m12.model = "ROG 5";
		m12.price = 50000;
		m12.color = "White";
		m12.storage = "256GB";

		Sim s12 = new Sim();
		s12.provider = "Jio";
		s12.simType = "Nano";
		s12.networkType = "5G";
		s12.phoneNumber = "9000000012";
		s12.isActive = true;

		m12.sim = s12;
		m12.getMobileDetails();


		Mobile m13 = new Mobile();
		m13.brand = "Lenovo";
		m13.model = "Legion";
		m13.price = 40000;
		m13.color = "Black";
		m13.storage = "128GB";

		Sim s13 = new Sim();
		s13.provider = "Vi";
		s13.simType = "Nano";
		s13.networkType = "4G";
		s13.phoneNumber = "9000000013";
		s13.isActive = false;

		m13.sim = s13;
		m13.getMobileDetails();


		Mobile m14 = new Mobile();
		m14.brand = "Honor";
		m14.model = "Magic 4";
		m14.price = 45000;
		m14.color = "Green";
		m14.storage = "256GB";

		Sim s14 = new Sim();
		s14.provider = "Airtel";
		s14.simType = "Nano";
		s14.networkType = "5G";
		s14.phoneNumber = "9000000014";
		s14.isActive = true;

		m14.sim = s14;
		m14.getMobileDetails();


		Mobile m15 = new Mobile();
		m15.brand = "Infinix";
		m15.model = "Zero 5G";
		m15.price = 18000;
		m15.color = "Purple";
		m15.storage = "128GB";

		Sim s15 = new Sim();
		s15.provider = "Jio";
		s15.simType = "Nano";
		s15.networkType = "4G";
		s15.phoneNumber = "9000000015";
		s15.isActive = true;

		m15.sim = s15;
		m15.getMobileDetails();


		Mobile m16 = new Mobile();
		m16.brand = "Tecno";
		m16.model = "Camon 19";
		m16.price = 17000;
		m16.color = "Blue";
		m16.storage = "128GB";

		Sim s16 = new Sim();
		s16.provider = "Vi";
		s16.simType = "Nano";
		s16.networkType = "4G";
		s16.phoneNumber = "9000000016";
		s16.isActive = false;

		m16.sim = s16;
		m16.getMobileDetails();


		Mobile m17 = new Mobile();
		m17.brand = "Google";
		m17.model = "Pixel 7";
		m17.price = 70000;
		m17.color = "White";
		m17.storage = "128GB";

		Sim s17 = new Sim();
		s17.provider = "Airtel";
		s17.simType = "eSIM";
		s17.networkType = "5G";
		s17.phoneNumber = "9000000017";
		s17.isActive = true;

		m17.sim = s17;
		m17.getMobileDetails();


		Mobile m18 = new Mobile();
		m18.brand = "Apple";
		m18.model = "iPhone 14";
		m18.price = 90000;
		m18.color = "Black";
		m18.storage = "256GB";

		Sim s18 = new Sim();
		s18.provider = "Jio";
		s18.simType = "eSIM";
		s18.networkType = "5G";
		s18.phoneNumber = "9000000018";
		s18.isActive = true;

		m18.sim = s18;
		m18.getMobileDetails();


		Mobile m19 = new Mobile();
		m19.brand = "Samsung";
		m19.model = "S23";
		m19.price = 85000;
		m19.color = "Green";
		m19.storage = "256GB";

		Sim s19 = new Sim();
		s19.provider = "Vi";
		s19.simType = "Nano";
		s19.networkType = "5G";
		s19.phoneNumber = "9000000019";
		s19.isActive = true;

		m19.sim = s19;
		m19.getMobileDetails();


		Mobile m20 = new Mobile();
		m20.brand = "OnePlus";
		m20.model = "11R";
		m20.price = 45000;
		m20.color = "Black";
		m20.storage = "256GB";

		Sim s20 = new Sim();
		s20.provider = "Airtel";
		s20.simType = "Nano";
		s20.networkType = "5G";
		s20.phoneNumber = "9000000020";
		s20.isActive = true;

		m20.sim = s20;
		m20.getMobileDetails();
    }
}