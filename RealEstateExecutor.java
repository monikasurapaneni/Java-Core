class RealEstateExecutor {

    public static void main(String[] args) {

        RealEstate r1 = new RealEstate();
        r1.companyName = "Brigade Group";
        r1.location = "Bangalore";
        r1.agentName = "Ramesh";
        r1.totalListings = 50;
        r1.contactNumber = "9876543210";

        Property p1 = new Property();
        p1.propertyType = "Apartment";
        p1.price = 7500000;
        p1.area = "1200 sqft";
        p1.numberOfRooms = 3;
        p1.isAvailable = true;

        r1.property = p1;
        r1.getRealEstateDetails();

        RealEstate r2 = new RealEstate();
        r2.companyName = "Prestige Estates";
        r2.location = "Hyderabad";
        r2.agentName = "Suresh";
        r2.totalListings = 40;
        r2.contactNumber = "9123456780";

        Property p2 = new Property();
        p2.propertyType = "Villa";
        p2.price = 15000000;
        p2.area = "2500 sqft";
        p2.numberOfRooms = 4;
        p2.isAvailable = false;

        r2.property = p2;
        r2.getRealEstateDetails();

        RealEstate r3 = new RealEstate();
        r3.companyName = "DLF";
        r3.location = "Chennai";
        r3.agentName = "Anjali";
        r3.totalListings = 30;
        r3.contactNumber = "9988776655";

        Property p3 = new Property();
        p3.propertyType = "Plot";
        p3.price = 5000000;
        p3.area = "1500 sqft";
        p3.numberOfRooms = 0;
        p3.isAvailable = true;

        r3.property = p3;
        r3.getRealEstateDetails();
		
		RealEstate r4 = new RealEstate();
		r4.companyName = "Sobha Limited";
		r4.location = "Pune";
		r4.agentName = "Kiran";
		r4.totalListings = 35;
		r4.contactNumber = "9000000004";

		Property p4 = new Property();
		p4.propertyType = "Apartment";
		p4.price = 8000000;
		p4.area = "1300 sqft";
		p4.numberOfRooms = 3;
		p4.isAvailable = true;

		r4.property = p4;
		r4.getRealEstateDetails();


		RealEstate r5 = new RealEstate();
		r5.companyName = "Godrej Properties";
		r5.location = "Mumbai";
		r5.agentName = "Sneha";
		r5.totalListings = 45;
		r5.contactNumber = "9000000005";

		Property p5 = new Property();
		p5.propertyType = "Villa";
		p5.price = 20000000;
		p5.area = "3000 sqft";
		p5.numberOfRooms = 5;
		p5.isAvailable = false;

		r5.property = p5;
		r5.getRealEstateDetails();


		RealEstate r6 = new RealEstate();
		r6.companyName = "Lodha Group";
		r6.location = "Delhi";
		r6.agentName = "Rahul";
		r6.totalListings = 50;
		r6.contactNumber = "9000000006";

		Property p6 = new Property();
		p6.propertyType = "Apartment";
		p6.price = 9500000;
		p6.area = "1400 sqft";
		p6.numberOfRooms = 3;
		p6.isAvailable = true;

		r6.property = p6;
		r6.getRealEstateDetails();


		RealEstate r7 = new RealEstate();
		r7.companyName = "Tata Housing";
		r7.location = "Kolkata";
		r7.agentName = "Anita";
		r7.totalListings = 28;
		r7.contactNumber = "9000000007";

		Property p7 = new Property();
		p7.propertyType = "Plot";
		p7.price = 4000000;
		p7.area = "1600 sqft";
		p7.numberOfRooms = 0;
		p7.isAvailable = true;

		r7.property = p7;
		r7.getRealEstateDetails();


		RealEstate r8 = new RealEstate();
		r8.companyName = "Mahindra Lifespaces";
		r8.location = "Chandigarh";
		r8.agentName = "Vikram";
		r8.totalListings = 32;
		r8.contactNumber = "9000000008";

		Property p8 = new Property();
		p8.propertyType = "Villa";
		p8.price = 18000000;
		p8.area = "2700 sqft";
		p8.numberOfRooms = 4;
		p8.isAvailable = false;

		r8.property = p8;
		r8.getRealEstateDetails();


		RealEstate r9 = new RealEstate();
		r9.companyName = "Puravankara";
		r9.location = "Ahmedabad";
		r9.agentName = "Pooja";
		r9.totalListings = 25;
		r9.contactNumber = "9000000009";

		Property p9 = new Property();
		p9.propertyType = "Apartment";
		p9.price = 7000000;
		p9.area = "1200 sqft";
		p9.numberOfRooms = 2;
		p9.isAvailable = true;

		r9.property = p9;
		r9.getRealEstateDetails();


		RealEstate r10 = new RealEstate();
		r10.companyName = "Embassy Group";
		r10.location = "Noida";
		r10.agentName = "Naveen";
		r10.totalListings = 38;
		r10.contactNumber = "9000000010";

		Property p10 = new Property();
		p10.propertyType = "Villa";
		p10.price = 22000000;
		p10.area = "3200 sqft";
		p10.numberOfRooms = 5;
		p10.isAvailable = true;

		r10.property = p10;
		r10.getRealEstateDetails();


		RealEstate r11 = new RealEstate();
		r11.companyName = "Oberoi Realty";
		r11.location = "Lucknow";
		r11.agentName = "Meena";
		r11.totalListings = 20;
		r11.contactNumber = "9000000011";

		Property p11 = new Property();
		p11.propertyType = "Apartment";
		p11.price = 6500000;
		p11.area = "1100 sqft";
		p11.numberOfRooms = 2;
		p11.isAvailable = true;

		r11.property = p11;
		r11.getRealEstateDetails();


		RealEstate r12 = new RealEstate();
		r12.companyName = "Phoenix Mills";
		r12.location = "Kochi";
		r12.agentName = "Suresh";
		r12.totalListings = 22;
		r12.contactNumber = "9000000012";

		Property p12 = new Property();
		p12.propertyType = "Plot";
		p12.price = 3500000;
		p12.area = "1500 sqft";
		p12.numberOfRooms = 0;
		p12.isAvailable = false;

		r12.property = p12;
		r12.getRealEstateDetails();


		RealEstate r13 = new RealEstate();
		r13.companyName = "Shapoorji Pallonji";
		r13.location = "Nagpur";
		r13.agentName = "Kavya";
		r13.totalListings = 27;
		r13.contactNumber = "9000000013";

		Property p13 = new Property();
		p13.propertyType = "Apartment";
		p13.price = 7200000;
		p13.area = "1250 sqft";
		p13.numberOfRooms = 3;
		p13.isAvailable = true;

		r13.property = p13;
		r13.getRealEstateDetails();


		RealEstate r14 = new RealEstate();
		r14.companyName = "Adani Realty";
		r14.location = "Indore";
		r14.agentName = "Manoj";
		r14.totalListings = 30;
		r14.contactNumber = "9000000014";

		Property p14 = new Property();
		p14.propertyType = "Villa";
		p14.price = 19000000;
		p14.area = "2800 sqft";
		p14.numberOfRooms = 4;
		p14.isAvailable = false;

		r14.property = p14;
		r14.getRealEstateDetails();


		RealEstate r15 = new RealEstate();
		r15.companyName = "Hiranandani";
		r15.location = "Thane";
		r15.agentName = "Neha";
		r15.totalListings = 33;
		r15.contactNumber = "9000000015";

		Property p15 = new Property();
		p15.propertyType = "Apartment";
		p15.price = 8500000;
		p15.area = "1350 sqft";
		p15.numberOfRooms = 3;
		p15.isAvailable = true;

		r15.property = p15;
		r15.getRealEstateDetails();


		RealEstate r16 = new RealEstate();
		r16.companyName = "Brigade Enterprises";
		r16.location = "Mysore";
		r16.agentName = "Arjun";
		r16.totalListings = 26;
		r16.contactNumber = "9000000016";

		Property p16 = new Property();
		p16.propertyType = "Plot";
		p16.price = 4500000;
		p16.area = "1700 sqft";
		p16.numberOfRooms = 0;
		p16.isAvailable = true;

		r16.property = p16;
		r16.getRealEstateDetails();


		RealEstate r17 = new RealEstate();
		r17.companyName = "Kolte Patil";
		r17.location = "Nashik";
		r17.agentName = "Divya";
		r17.totalListings = 24;
		r17.contactNumber = "9000000017";

		Property p17 = new Property();
		p17.propertyType = "Apartment";
		p17.price = 6000000;
		p17.area = "1150 sqft";
		p17.numberOfRooms = 2;
		p17.isAvailable = false;

		r17.property = p17;
		r17.getRealEstateDetails();


		RealEstate r18 = new RealEstate();
		r18.companyName = "Runwal Group";
		r18.location = "Surat";
		r18.agentName = "Rohit";
		r18.totalListings = 29;
		r18.contactNumber = "9000000018";

		Property p18 = new Property();
		p18.propertyType = "Villa";
		p18.price = 21000000;
		p18.area = "3100 sqft";
		p18.numberOfRooms = 5;
		p18.isAvailable = true;

		r18.property = p18;
		r18.getRealEstateDetails();


		RealEstate r19 = new RealEstate();
		r19.companyName = "Ajmera Realty";
		r19.location = "Jaipur";
		r19.agentName = "Lakshmi";
		r19.totalListings = 21;
		r19.contactNumber = "9000000019";

		Property p19 = new Property();
		p19.propertyType = "Apartment";
		p19.price = 6800000;
		p19.area = "1200 sqft";
		p19.numberOfRooms = 3;
		p19.isAvailable = true;

		r19.property = p19;
		r19.getRealEstateDetails();


		RealEstate r20 = new RealEstate();
		r20.companyName = "DLF Homes";
		r20.location = "Gurgaon";
		r20.agentName = "Aravind";
		r20.totalListings = 40;
		r20.contactNumber = "9000000020";

		Property p20 = new Property();
		p20.propertyType = "Villa";
		p20.price = 25000000;
		p20.area = "3500 sqft";
		p20.numberOfRooms = 5;
		p20.isAvailable = false;

		r20.property = p20;
		r20.getRealEstateDetails();
    }
}