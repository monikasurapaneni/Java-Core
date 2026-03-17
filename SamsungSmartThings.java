class SamsungSmartThings{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long deviceId, int otp){
    System.out.println("Device ID: " + deviceId);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("smart@gmail.com","smart123");
    login(789012345L,8888);
  }
}