class Hospital{
  static String hospitaldoctornames[]={"Dr.Arjun Mehta","Dr.Priya Reddy","Dr.Vikram Sharma","Dr.Neha Kapoor","Dr.Rahul Verma","Dr.Ananya Iyer","Dr.Kiran Joshi","Dr.Sneha Patel","Dr.Aditya Nair","Dr.Kavya Rao"};
     
	  public static void getHospitaldoctornames(){
	  System.out.println("  getHospitaldoctornames invoked");
	  for(String hospitaldoctorname:hospitaldoctornames){
	  System.out.println(hospitaldoctorname);}
	  System.out.println("end of getHospitaldoctornames ");
   
    }
}