class AliExpress
{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long userId, int otp){
    System.out.println("User ID: " + userId);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("auth@gmail.com","auth123");
    login(901234567L,1010);
  }
}