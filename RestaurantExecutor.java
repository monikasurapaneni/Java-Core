class RestaurantExecutor {

    public static void main(String[] args) {

        Restaurant r1 = new Restaurant();
        r1.name = "Empire Restaurant";
        r1.location = "Bangalore";
        r1.cuisineType = "Multi-Cuisine";
        r1.seatingCapacity = 100;
        r1.rating = 4.2;

        Chef c1 = new Chef();
        c1.chefName = "Ravi";
        c1.experience = 10;
        c1.specialization = "North Indian";
        c1.salary = 50000;
        c1.isFamous = true;

        r1.chef = c1;
        r1.getRestaurantDetails();


        Restaurant r2 = new Restaurant();
        r2.name = "Barbeque Nation";
        r2.location = "Hyderabad";
        r2.cuisineType = "BBQ";
        r2.seatingCapacity = 120;
        r2.rating = 4.5;

        Chef c2 = new Chef();
        c2.chefName = "Anil";
        c2.experience = 8;
        c2.specialization = "Grill";
        c2.salary = 45000;
        c2.isFamous = true;

        r2.chef = c2;
        r2.getRestaurantDetails();


        Restaurant r3 = new Restaurant();
        r3.name = "Meghana Foods";
        r3.location = "Bangalore";
        r3.cuisineType = "South Indian";
        r3.seatingCapacity = 80;
        r3.rating = 4.6;

        Chef c3 = new Chef();
        c3.chefName = "Suresh";
        c3.experience = 12;
        c3.specialization = "Biryani";
        c3.salary = 55000;
        c3.isFamous = true;

        r3.chef = c3;
        r3.getRestaurantDetails();
		Restaurant r4 = new Restaurant();
		r4.name = "KFC";
		r4.location = "Bangalore";
		r4.cuisineType = "Fast Food";
		r4.seatingCapacity = 90;
		r4.rating = 4.1;

		Chef c4 = new Chef();
		c4.chefName = "Arjun";
		c4.experience = 6;
		c4.specialization = "Fried Chicken";
		c4.salary = 40000;
		c4.isFamous = false;

		r4.chef = c4;
		r4.getRestaurantDetails();


		Restaurant r5 = new Restaurant();
		r5.name = "Domino's";
		r5.location = "Hyderabad";
		r5.cuisineType = "Pizza";
		r5.seatingCapacity = 60;
		r5.rating = 4.0;

		Chef c5 = new Chef();
		c5.chefName = "Vikram";
		c5.experience = 5;
		c5.specialization = "Pizza";
		c5.salary = 35000;
		c5.isFamous = false;

		r5.chef = c5;
		r5.getRestaurantDetails();


		Restaurant r6 = new Restaurant();
		r6.name = "Pizza Hut";
		r6.location = "Chennai";
		r6.cuisineType = "Italian";
		r6.seatingCapacity = 70;
		r6.rating = 4.2;

		Chef c6 = new Chef();
		c6.chefName = "Kiran";
		c6.experience = 7;
		c6.specialization = "Italian Cuisine";
		c6.salary = 42000;
		c6.isFamous = true;

		r6.chef = c6;
		r6.getRestaurantDetails();


		Restaurant r7 = new Restaurant();
		r7.name = "Truffles";
		r7.location = "Bangalore";
		r7.cuisineType = "Continental";
		r7.seatingCapacity = 80;
		r7.rating = 4.5;

		Chef c7 = new Chef();
		c7.chefName = "Neha";
		c7.experience = 8;
		c7.specialization = "Burgers";
		c7.salary = 45000;
		c7.isFamous = true;

		r7.chef = c7;
		r7.getRestaurantDetails();


		Restaurant r8 = new Restaurant();
		r8.name = "McDonald's";
		r8.location = "Bangalore";
		r8.cuisineType = "Fast Food";
		r8.seatingCapacity = 100;
		r8.rating = 4.1;

		Chef c8 = new Chef();
		c8.chefName = "Rohit";
		c8.experience = 6;
		c8.specialization = "Fast Food";
		c8.salary = 38000;
		c8.isFamous = false;

		r8.chef = c8;
		r8.getRestaurantDetails();


		Restaurant r9 = new Restaurant();
		r9.name = "A2B";
		r9.location = "Chennai";
		r9.cuisineType = "South Indian";
		r9.seatingCapacity = 120;
		r9.rating = 4.3;

		Chef c9 = new Chef();
		c9.chefName = "Suresh";
		c9.experience = 10;
		c9.specialization = "South Indian";
		c9.salary = 50000;
		c9.isFamous = true;

		r9.chef = c9;
		r9.getRestaurantDetails();


		Restaurant r10 = new Restaurant();
		r10.name = "Paradise";
		r10.location = "Hyderabad";
		r10.cuisineType = "Biryani";
		r10.seatingCapacity = 150;
		r10.rating = 4.6;

		Chef c10 = new Chef();
		c10.chefName = "Imran";
		c10.experience = 12;
		c10.specialization = "Biryani";
		c10.salary = 60000;
		c10.isFamous = true;

		r10.chef = c10;
		r10.getRestaurantDetails();


		Restaurant r11 = new Restaurant();
		r11.name = "Subway";
		r11.location = "Bangalore";
		r11.cuisineType = "Healthy Food";
		r11.seatingCapacity = 50;
		r11.rating = 4.0;

		Chef c11 = new Chef();
		c11.chefName = "Amit";
		c11.experience = 5;
		c11.specialization = "Sandwich";
		c11.salary = 30000;
		c11.isFamous = false;

		r11.chef = c11;
		r11.getRestaurantDetails();


		Restaurant r12 = new Restaurant();
		r12.name = "Cafe Coffee Day";
		r12.location = "Bangalore";
		r12.cuisineType = "Cafe";
		r12.seatingCapacity = 60;
		r12.rating = 4.2;

		Chef c12 = new Chef();
		c12.chefName = "Priya";
		c12.experience = 6;
		c12.specialization = "Coffee & Snacks";
		c12.salary = 32000;
		c12.isFamous = false;

		r12.chef = c12;
		r12.getRestaurantDetails();


		Restaurant r13 = new Restaurant();
		r13.name = "Starbucks";
		r13.location = "Bangalore";
		r13.cuisineType = "Cafe";
		r13.seatingCapacity = 70;
		r13.rating = 4.4;

		Chef c13 = new Chef();
		c13.chefName = "Ritika";
		c13.experience = 7;
		c13.specialization = "Coffee";
		c13.salary = 40000;
		c13.isFamous = true;

		r13.chef = c13;
		r13.getRestaurantDetails();


		Restaurant r14 = new Restaurant();
		r14.name = "Absolute Barbeque";
		r14.location = "Bangalore";
		r14.cuisineType = "BBQ";
		r14.seatingCapacity = 110;
		r14.rating = 4.5;

		Chef c14 = new Chef();
		c14.chefName = "Manoj";
		c14.experience = 9;
		c14.specialization = "Grill";
		c14.salary = 55000;
		c14.isFamous = true;

		r14.chef = c14;
		r14.getRestaurantDetails();


		Restaurant r15 = new Restaurant();
		r15.name = "Wow Momo";
		r15.location = "Hyderabad";
		r15.cuisineType = "Chinese";
		r15.seatingCapacity = 40;
		r15.rating = 4.1;

		Chef c15 = new Chef();
		c15.chefName = "Karthik";
		c15.experience = 5;
		c15.specialization = "Momos";
		c15.salary = 30000;
		c15.isFamous = false;

		r15.chef = c15;
		r15.getRestaurantDetails();


		Restaurant r16 = new Restaurant();
		r16.name = "Haldiram's";
		r16.location = "Delhi";
		r16.cuisineType = "Indian Snacks";
		r16.seatingCapacity = 120;
		r16.rating = 4.3;

		Chef c16 = new Chef();
		c16.chefName = "Deepak";
		c16.experience = 11;
		c16.specialization = "Sweets";
		c16.salary = 52000;
		c16.isFamous = true;

		r16.chef = c16;
		r16.getRestaurantDetails();


		Restaurant r17 = new Restaurant();
		r17.name = "Chutneys";
		r17.location = "Hyderabad";
		r17.cuisineType = "South Indian";
		r17.seatingCapacity = 90;
		r17.rating = 4.4;

		Chef c17 = new Chef();
		c17.chefName = "Ramesh";
		c17.experience = 10;
		c17.specialization = "Dosa";
		c17.salary = 48000;
		c17.isFamous = true;

		r17.chef = c17;
		r17.getRestaurantDetails();


		Restaurant r18 = new Restaurant();
		r18.name = "Empire";
		r18.location = "Bangalore";
		r18.cuisineType = "Multi-Cuisine";
		r18.seatingCapacity = 130;
		r18.rating = 4.2;

		Chef c18 = new Chef();
		c18.chefName = "Salman";
		c18.experience = 9;
		c18.specialization = "Kebabs";
		c18.salary = 50000;
		c18.isFamous = true;

		r18.chef = c18;
		r18.getRestaurantDetails();


		Restaurant r19 = new Restaurant();
		r19.name = "Udupi Palace";
		r19.location = "Bangalore";
		r19.cuisineType = "Vegetarian";
		r19.seatingCapacity = 80;
		r19.rating = 4.1;

		Chef c19 = new Chef();
		c19.chefName = "Ganesh";
		c19.experience = 8;
		c19.specialization = "Veg Meals";
		c19.salary = 42000;
		c19.isFamous = false;

		r19.chef = c19;
		r19.getRestaurantDetails();


		Restaurant r20 = new Restaurant();
		r20.name = "Biryani Zone";
		r20.location = "Bangalore";
		r20.cuisineType = "Biryani";
		r20.seatingCapacity = 100;
		r20.rating = 4.3;

		Chef c20 = new Chef();
		c20.chefName = "Aslam";
		c20.experience = 12;
		c20.specialization = "Hyderabadi Biryani";
		c20.salary = 60000;
		c20.isFamous = true;

		r20.chef = c20;
		r20.getRestaurantDetails();
    }
}