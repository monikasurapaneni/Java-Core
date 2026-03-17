class MXPlayer{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long phoneNumber, int otp){
    System.out.println("Phone Number: " + phoneNumber);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("mxUser","mx123");
    login(7890123456L,7777);
  }
}