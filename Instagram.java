class Instagram{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long phoneNumber, int otp){
    System.out.println("Phone: " + phoneNumber);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("insta@gmail.com","insta123");
    login(9876543210L,1111);
  }
}







