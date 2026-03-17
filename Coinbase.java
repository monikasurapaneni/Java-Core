class Coinbase{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long phoneNumber, int otp){
    System.out.println("Phone Number: " + phoneNumber);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("coinUser","coin123");
    login(9876543210L,4444);
  }
}