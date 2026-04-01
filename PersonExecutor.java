class PersonExecutor {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Monika";
        p1.age = 22;
        p1.gender = "Female";
        p1.address = "Bangalore";
        p1.phoneNumber = "9876543210";

        GovernmentIdentification g1 = new GovernmentIdentification();
        g1.idType = "Aadhar";
        g1.idNumber = "1234-5678-9012";
        g1.issuedBy = "UIDAI";
        g1.validity = "Lifetime";
        g1.isVerified = true;

        p1.id = g1;
        p1.getPersonDetails();


        Person p2 = new Person();
        p2.name = "Rahul";
        p2.age = 28;
        p2.gender = "Male";
        p2.address = "Hyderabad";
        p2.phoneNumber = "9123456780";

        GovernmentIdentification g2 = new GovernmentIdentification();
        g2.idType = "PAN";
        g2.idNumber = "ABCDE1234F";
        g2.issuedBy = "Income Tax Dept";
        g2.validity = "Lifetime";
        g2.isVerified = true;

        p2.id = g2;
        p2.getPersonDetails();


        Person p3 = new Person();
        p3.name = "Anjali";
        p3.age = 25;
        p3.gender = "Female";
        p3.address = "Chennai";
        p3.phoneNumber = "9988776655";

        GovernmentIdentification g3 = new GovernmentIdentification();
        g3.idType = "Passport";
        g3.idNumber = "P1234567";
        g3.issuedBy = "Govt of India";
        g3.validity = "10 Years";
        g3.isVerified = true;

        p3.id = g3;
        p3.getPersonDetails();
		
		Person p4 = new Person();
		p4.name = "Kiran";
		p4.age = 30;
		p4.gender = "Male";
		p4.address = "Delhi";
		p4.phoneNumber = "9001122334";

		GovernmentIdentification g4 = new GovernmentIdentification();
		g4.idType = "Driving License";
		g4.idNumber = "DL12345678";
		g4.issuedBy = "RTO";
		g4.validity = "15 Years";
		g4.isVerified = true;

		p4.id = g4;
		p4.getPersonDetails();


		Person p5 = new Person();
		p5.name = "Sneha";
		p5.age = 27;
		p5.gender = "Female";
		p5.address = "Mumbai";
		p5.phoneNumber = "9011223344";

		GovernmentIdentification g5 = new GovernmentIdentification();
		g5.idType = "Aadhar";
		g5.idNumber = "2345-6789-0123";
		g5.issuedBy = "UIDAI";
		g5.validity = "Lifetime";
		g5.isVerified = true;

		p5.id = g5;
		p5.getPersonDetails();


		Person p6 = new Person();
		p6.name = "Ravi";
		p6.age = 35;
		p6.gender = "Male";
		p6.address = "Chennai";
		p6.phoneNumber = "9022334455";

		GovernmentIdentification g6 = new GovernmentIdentification();
		g6.idType = "PAN";
		g6.idNumber = "PQRSX1234Z";
		g6.issuedBy = "Income Tax Dept";
		g6.validity = "Lifetime";
		g6.isVerified = true;

		p6.id = g6;
		p6.getPersonDetails();


		Person p7 = new Person();
		p7.name = "Divya";
		p7.age = 24;
		p7.gender = "Female";
		p7.address = "Bangalore";
		p7.phoneNumber = "9033445566";

		GovernmentIdentification g7 = new GovernmentIdentification();
		g7.idType = "Passport";
		g7.idNumber = "P7654321";
		g7.issuedBy = "Govt of India";
		g7.validity = "10 Years";
		g7.isVerified = true;

		p7.id = g7;
		p7.getPersonDetails();


		Person p8 = new Person();
		p8.name = "Arjun";
		p8.age = 29;
		p8.gender = "Male";
		p8.address = "Hyderabad";
		p8.phoneNumber = "9044556677";

		GovernmentIdentification g8 = new GovernmentIdentification();
		g8.idType = "Driving License";
		g8.idNumber = "DL87654321";
		g8.issuedBy = "RTO";
		g8.validity = "15 Years";
		g8.isVerified = false;

		p8.id = g8;
		p8.getPersonDetails();


		Person p9 = new Person();
		p9.name = "Meena";
		p9.age = 31;
		p9.gender = "Female";
		p9.address = "Kolkata";
		p9.phoneNumber = "9055667788";

		GovernmentIdentification g9 = new GovernmentIdentification();
		g9.idType = "Voter ID";
		g9.idNumber = "VOT123456";
		g9.issuedBy = "Election Commission";
		g9.validity = "Lifetime";
		g9.isVerified = true;

		p9.id = g9;
		p9.getPersonDetails();


		Person p10 = new Person();
		p10.name = "Vikram";
		p10.age = 33;
		p10.gender = "Male";
		p10.address = "Pune";
		p10.phoneNumber = "9066778899";

		GovernmentIdentification g10 = new GovernmentIdentification();
		g10.idType = "Aadhar";
		g10.idNumber = "3456-7890-1234";
		g10.issuedBy = "UIDAI";
		g10.validity = "Lifetime";
		g10.isVerified = true;

		p10.id = g10;
		p10.getPersonDetails();


		Person p11 = new Person();
		p11.name = "Anil";
		p11.age = 40;
		p11.gender = "Male";
		p11.address = "Jaipur";
		p11.phoneNumber = "9077889900";

		GovernmentIdentification g11 = new GovernmentIdentification();
		g11.idType = "PAN";
		g11.idNumber = "ABCDE5678G";
		g11.issuedBy = "Income Tax Dept";
		g11.validity = "Lifetime";
		g11.isVerified = true;

		p11.id = g11;
		p11.getPersonDetails();


		Person p12 = new Person();
		p12.name = "Pooja";
		p12.age = 26;
		p12.gender = "Female";
		p12.address = "Ahmedabad";
		p12.phoneNumber = "9088990011";

		GovernmentIdentification g12 = new GovernmentIdentification();
		g12.idType = "Passport";
		g12.idNumber = "P9876543";
		g12.issuedBy = "Govt of India";
		g12.validity = "10 Years";
		g12.isVerified = true;

		p12.id = g12;
		p12.getPersonDetails();


		Person p13 = new Person();
		p13.name = "Karthik";
		p13.age = 28;
		p13.gender = "Male";
		p13.address = "Coimbatore";
		p13.phoneNumber = "9099001122";

		GovernmentIdentification g13 = new GovernmentIdentification();
		g13.idType = "Driving License";
		g13.idNumber = "DL11223344";
		g13.issuedBy = "RTO";
		g13.validity = "15 Years";
		g13.isVerified = false;

		p13.id = g13;
		p13.getPersonDetails();


		Person p14 = new Person();
		p14.name = "Lakshmi";
		p14.age = 34;
		p14.gender = "Female";
		p14.address = "Mysore";
		p14.phoneNumber = "9100112233";

		GovernmentIdentification g14 = new GovernmentIdentification();
		g14.idType = "Aadhar";
		g14.idNumber = "4567-8901-2345";
		g14.issuedBy = "UIDAI";
		g14.validity = "Lifetime";
		g14.isVerified = true;

		p14.id = g14;
		p14.getPersonDetails();


		Person p15 = new Person();
		p15.name = "Manoj";
		p15.age = 37;
		p15.gender = "Male";
		p15.address = "Nagpur";
		p15.phoneNumber = "9111223344";

		GovernmentIdentification g15 = new GovernmentIdentification();
		g15.idType = "Voter ID";
		g15.idNumber = "VOT654321";
		g15.issuedBy = "Election Commission";
		g15.validity = "Lifetime";
		g15.isVerified = true;

		p15.id = g15;
		p15.getPersonDetails();


		Person p16 = new Person();
		p16.name = "Nisha";
		p16.age = 23;
		p16.gender = "Female";
		p16.address = "Goa";
		p16.phoneNumber = "9122334455";

		GovernmentIdentification g16 = new GovernmentIdentification();
		g16.idType = "Passport";
		g16.idNumber = "P1122334";
		g16.issuedBy = "Govt of India";
		g16.validity = "10 Years";
		g16.isVerified = true;

		p16.id = g16;
		p16.getPersonDetails();


		Person p17 = new Person();
		p17.name = "Sanjay";
		p17.age = 45;
		p17.gender = "Male";
		p17.address = "Lucknow";
		p17.phoneNumber = "9133445566";

		GovernmentIdentification g17 = new GovernmentIdentification();
		g17.idType = "PAN";
		g17.idNumber = "ZXCVB6789H";
		g17.issuedBy = "Income Tax Dept";
		g17.validity = "Lifetime";
		g17.isVerified = true;

		p17.id = g17;
		p17.getPersonDetails();


		Person p18 = new Person();
		p18.name = "Keerthi";
		p18.age = 29;
		p18.gender = "Female";
		p18.address = "Trivandrum";
		p18.phoneNumber = "9144556677";

		GovernmentIdentification g18 = new GovernmentIdentification();
		g18.idType = "Driving License";
		g18.idNumber = "DL55667788";
		g18.issuedBy = "RTO";
		g18.validity = "15 Years";
		g18.isVerified = true;

		p18.id = g18;
		p18.getPersonDetails();


		Person p19 = new Person();
		p19.name = "Ajay";
		p19.age = 32;
		p19.gender = "Male";
		p19.address = "Indore";
		p19.phoneNumber = "9155667788";

		GovernmentIdentification g19 = new GovernmentIdentification();
		g19.idType = "Aadhar";
		g19.idNumber = "5678-9012-3456";
		g19.issuedBy = "UIDAI";
		g19.validity = "Lifetime";
		g19.isVerified = false;

		p19.id = g19;
		p19.getPersonDetails();


		Person p20 = new Person();
		p20.name = "Ritika";
		p20.age = 27;
		p20.gender = "Female";
		p20.address = "Bhopal";
		p20.phoneNumber = "9166778899";

		GovernmentIdentification g20 = new GovernmentIdentification();
		g20.idType = "Passport";
		g20.idNumber = "P2233445";
		g20.issuedBy = "Govt of India";
		g20.validity = "10 Years";
		g20.isVerified = true;

		p20.id = g20;
		p20.getPersonDetails();
    }
}