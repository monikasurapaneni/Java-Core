class MicrosoftPowerPoint{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long accountId, int otp){
    System.out.println("Account ID: " + accountId);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("ppt@outlook.com","ppt123");
    login(345678901L,3333);
  }
}