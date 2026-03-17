class Notion{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long accountId, int otp){
    System.out.println("Account ID: " + accountId);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("notion@gmail.com","notion123");
    login(456789123L,5555);
  }
}