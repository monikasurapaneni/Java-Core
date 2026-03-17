class PUBGMobile{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long playerId, int otp){
    System.out.println("Player ID: " + playerId);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("pubgUser","pubg123");
    login(123456789L,1111);
  }
}