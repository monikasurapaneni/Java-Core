class SubwaySurfers{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long playerId, int otp){
    System.out.println("Player ID: " + playerId);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("subway@gmail.com","sub123");
    login(456789012L,4444);
  }
}