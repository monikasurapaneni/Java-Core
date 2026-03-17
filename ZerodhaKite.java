class ZerodhaKite{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long userId, int otp){
    System.out.println("User ID: " + userId);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("kite@gmail.com","kite123");
    login(789012345L,1010);
  }
}