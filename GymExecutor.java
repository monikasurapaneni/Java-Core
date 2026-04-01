class GymExecutor {

    public static void main(String[] args) {

        Gym g1 = new Gym();
        g1.gymName = "Gold's Gym";
        g1.location = "Bangalore";
        g1.numberOfMembers = 200;
        g1.gymType = "Fitness";
        g1.monthlyFee = 2500;

        Trainer t1 = new Trainer();
        t1.trainerName = "Rahul";
        t1.experience = 5;
        t1.specialization = "Weight Training";
        t1.salary = 30000;
        t1.certified = true;

        g1.trainer = t1;
        g1.getGymDetails();

        Gym g2 = new Gym();
        g2.gymName = "Cult Fit";
        g2.location = "Hyderabad";
        g2.numberOfMembers = 150;
        g2.gymType = "CrossFit";
        g2.monthlyFee = 3000;

        Trainer t2 = new Trainer();
        t2.trainerName = "Anjali";
        t2.experience = 4;
        t2.specialization = "Yoga";
        t2.salary = 28000;
        t2.certified = true;

        g2.trainer = t2;
        g2.getGymDetails();

        Gym g3 = new Gym();
        g3.gymName = "Anytime Fitness";
        g3.location = "Chennai";
        g3.numberOfMembers = 180;
        g3.gymType = "Premium";
        g3.monthlyFee = 3500;

        Trainer t3 = new Trainer();
        t3.trainerName = "Kiran";
        t3.experience = 6;
        t3.specialization = "Cardio";
        t3.salary = 32000;
        t3.certified = true;

        g3.trainer = t3;
        g3.getGymDetails();
		
		Gym g4 = new Gym();
		g4.gymName = "Fitness First";
		g4.location = "Mumbai";
		g4.numberOfMembers = 220;
		g4.gymType = "Premium";
		g4.monthlyFee = 4000;

		Trainer t4 = new Trainer();
		t4.trainerName = "Suresh";
		t4.experience = 7;
		t4.specialization = "Strength Training";
		t4.salary = 35000;
		t4.certified = true;

		g4.trainer = t4;
		g4.getGymDetails();

		Gym g5 = new Gym();
		g5.gymName = "Snap Fitness";
		g5.location = "Delhi";
		g5.numberOfMembers = 160;
		g5.gymType = "Fitness";
		g5.monthlyFee = 2800;

		Trainer t5 = new Trainer();
		t5.trainerName = "Pooja";
		t5.experience = 3;
		t5.specialization = "Zumba";
		t5.salary = 25000;
		t5.certified = true;

		g5.trainer = t5;
		g5.getGymDetails();

		Gym g6 = new Gym();
		g6.gymName = "Talwalkars";
		g6.location = "Pune";
		g6.numberOfMembers = 140;
		g6.gymType = "Classic";
		g6.monthlyFee = 2000;

		Trainer t6 = new Trainer();
		t6.trainerName = "Arjun";
		t6.experience = 5;
		t6.specialization = "Bodybuilding";
		t6.salary = 30000;
		t6.certified = true;

		g6.trainer = t6;
		g6.getGymDetails();


		Gym g7 = new Gym();
		g7.gymName = "Powerhouse Gym";
		g7.location = "Kolkata";
		g7.numberOfMembers = 130;
		g7.gymType = "Fitness";
		g7.monthlyFee = 2200;

		Trainer t7 = new Trainer();
		t7.trainerName = "Neha";
		t7.experience = 4;
		t7.specialization = "Yoga";
		t7.salary = 27000;
		t7.certified = true;

		g7.trainer = t7;
		g7.getGymDetails();

		Gym g8 = new Gym();
		g8.gymName = "Muscle Factory";
		g8.location = "Ahmedabad";
		g8.numberOfMembers = 170;
		g8.gymType = "Strength";
		g8.monthlyFee = 2600;

		Trainer t8 = new Trainer();
		t8.trainerName = "Rohit";
		t8.experience = 6;
		t8.specialization = "Weight Training";
		t8.salary = 32000;
		t8.certified = true;

		g8.trainer = t8;
		g8.getGymDetails();

		Gym g9 = new Gym();
		g9.gymName = "Fit Zone";
		g9.location = "Jaipur";
		g9.numberOfMembers = 120;
		g9.gymType = "Fitness";
		g9.monthlyFee = 2100;

		Trainer t9 = new Trainer();
		t9.trainerName = "Anita";
		t9.experience = 3;
		t9.specialization = "Cardio";
		t9.salary = 24000;
		t9.certified = true;

		g9.trainer = t9;
		g9.getGymDetails();

		Gym g10 = new Gym();
		g10.gymName = "Urban Gym";
		g10.location = "Noida";
		g10.numberOfMembers = 190;
		g10.gymType = "Premium";
		g10.monthlyFee = 3600;

		Trainer t10 = new Trainer();
		t10.trainerName = "Vikram";
		t10.experience = 8;
		t10.specialization = "CrossFit";
		t10.salary = 38000;
		t10.certified = true;

		g10.trainer = t10;
		g10.getGymDetails();

		Gym g11 = new Gym();
		g11.gymName = "Pro Fitness";
		g11.location = "Lucknow";
		g11.numberOfMembers = 150;
		g11.gymType = "Fitness";
		g11.monthlyFee = 2300;

		Trainer t11 = new Trainer();
		t11.trainerName = "Meena";
		t11.experience = 4;
		t11.specialization = "Yoga";
		t11.salary = 26000;
		t11.certified = true;

		g11.trainer = t11;
		g11.getGymDetails();

		Gym g12 = new Gym();
		g12.gymName = "Core Gym";
		g12.location = "Kochi";
		g12.numberOfMembers = 110;
		g12.gymType = "Classic";
		g12.monthlyFee = 2000;

		Trainer t12 = new Trainer();
		t12.trainerName = "Sanjay";
		t12.experience = 5;
		t12.specialization = "Core Training";
		t12.salary = 28000;
		t12.certified = true;

		g12.trainer = t12;
		g12.getGymDetails();

		Gym g13 = new Gym();
		g13.gymName = "Iron Paradise";
		g13.location = "Nagpur";
		g13.numberOfMembers = 140;
		g13.gymType = "Strength";
		g13.monthlyFee = 2500;

		Trainer t13 = new Trainer();
		t13.trainerName = "Kavya";
		t13.experience = 6;
		t13.specialization = "Bodybuilding";
		t13.salary = 31000;
		t13.certified = true;

		g13.trainer = t13;
		g13.getGymDetails();

		Gym g14 = new Gym();
		g14.gymName = "Flex Gym";
		g14.location = "Indore";
		g14.numberOfMembers = 135;
		g14.gymType = "Fitness";
		g14.monthlyFee = 2200;

		Trainer t14 = new Trainer();
		t14.trainerName = "Manoj";
		t14.experience = 4;
		t14.specialization = "Cardio";
		t14.salary = 26000;
		t14.certified = true;

		g14.trainer = t14;
		g14.getGymDetails();

		Gym g15 = new Gym();
		g15.gymName = "Elite Fitness";
		g15.location = "Thane";
		g15.numberOfMembers = 200;
		g15.gymType = "Premium";
		g15.monthlyFee = 3700;

		Trainer t15 = new Trainer();
		t15.trainerName = "Lakshmi";
		t15.experience = 7;
		t15.specialization = "Zumba";
		t15.salary = 34000;
		t15.certified = true;

		g15.trainer = t15;
		g15.getGymDetails();

		Gym g16 = new Gym();
		g16.gymName = "Beast Mode Gym";
		g16.location = "Mysore";
		g16.numberOfMembers = 125;
		g16.gymType = "Strength";
		g16.monthlyFee = 2400;

		Trainer t16 = new Trainer();
		t16.trainerName = "Aravind";
		t16.experience = 5;
		t16.specialization = "Weight Training";
		t16.salary = 30000;
		t16.certified = true;

		g16.trainer = t16;
		g16.getGymDetails();

		Gym g17 = new Gym();
		g17.gymName = "Body Fit";
		g17.location = "Nashik";
		g17.numberOfMembers = 145;
		g17.gymType = "Fitness";
		g17.monthlyFee = 2300;

		Trainer t17 = new Trainer();
		t17.trainerName = "Divya";
		t17.experience = 3;
		t17.specialization = "Yoga";
		t17.salary = 25000;
		t17.certified = true;

		g17.trainer = t17;
		g17.getGymDetails();

		Gym g18 = new Gym();
		g18.gymName = "Muscle Hub";
		g18.location = "Surat";
		g18.numberOfMembers = 175;
		g18.gymType = "Strength";
		g18.monthlyFee = 2600;

		Trainer t18 = new Trainer();
		t18.trainerName = "Ramesh";
		t18.experience = 6;
		t18.specialization = "Bodybuilding";
		t18.salary = 32000;
		t18.certified = true;

		g18.trainer = t18;
		g18.getGymDetails();

		Gym g19 = new Gym();
		g19.gymName = "Fitness World";
		g19.location = "Jaipur";
		g19.numberOfMembers = 155;
		g19.gymType = "Fitness";
		g19.monthlyFee = 2200;

		Trainer t19 = new Trainer();
		t19.trainerName = "Neeraj";
		t19.experience = 4;
		t19.specialization = "CrossFit";
		t19.salary = 27000;
		t19.certified = true;

		g19.trainer = t19;
		g19.getGymDetails();

		Gym g20 = new Gym();
		g20.gymName = "Ultimate Gym";
		g20.location = "Gurgaon";
		g20.numberOfMembers = 210;
		g20.gymType = "Premium";
		g20.monthlyFee = 3800;

		Trainer t20 = new Trainer();
		t20.trainerName = "Sandeep";
		t20.experience = 8;
		t20.specialization = "Strength Training";
		t20.salary = 36000;
		t20.certified = true;

		g20.trainer = t20;
		g20.getGymDetails();
    }
}