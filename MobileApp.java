class MobileApp{
public static   void register(String patientName , String symptom , String email, Long mobile ){
	
	 System.out.println("The patient name is  " + patientName);
	 System.out.println("   The symptons are " + symptom);
	 System.out.println(" The email is              " + email);
	 System.out.println(" The mobile number is " + mobile);
	 

Reception.book("Shree","Fever","shree@gmail.com", 654365678L);



}

}