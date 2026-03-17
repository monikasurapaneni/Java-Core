class Firefox{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long accountId, int otp){
    System.out.println("Account ID: " + accountId);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("fireUser","fire123");
    login(678901234L,6666);
  }
}