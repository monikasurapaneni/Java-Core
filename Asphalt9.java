class Asphalt9{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long racerId, int otp){
    System.out.println("Racer ID: " + racerId);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("asphalt@gmail.com","asphalt123");
    login(456789012L,4444);
  }
}