class Reception{
 public static  void  book(String patientName , String symptom, String email,Long mobile){
 
 System.out.println(" The patient Name is" + patientName);
 System.out.println(" The sympton is " + symptom);
 System.out.println(" The email is " + email);
 System.out.println(" The mobile number is " + mobile);

Hospital.bookAppointment("Shree","Leg Pain");
 }
}