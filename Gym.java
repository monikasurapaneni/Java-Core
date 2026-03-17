class Gym {
    static String gymequipments[]={"Treadmill","dumbells","Kettlebells","Wall Ball","Pedometer","Exercise Bike","Barbells","Calf Press","Ab Roller","Last Pull Down"};
	
    public static void getGymequipments(){
	  System.out.println("getGymequipments invoked");
	  for(String gymequipment:gymequipments){
	  System.out.println(gymequipment);}
	  System.out.println("end of getGymequipments ");
   
    }
}