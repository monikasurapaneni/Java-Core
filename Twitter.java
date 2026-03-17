class Twitter{
 public static void login(String email, String phoneNumber){
	System.out.println("Login using username and phoneNumber");
    System.out.println("Email: " + email);
	System.out.println("Phone Number: " + phoneNumber);

  }
  public static void login( long phonenumber ){
	System.out.println("Login using phone number");
	
	 System.out.println("Phone Number: " + phonenumber);

  }
  public static void main(String[]args){
    login("monikasurapaneni@gmail.com" , "9110818086");
	login(9482476657L);
}
}