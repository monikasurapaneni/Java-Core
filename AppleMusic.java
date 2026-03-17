class AppleMusic{
  public static void login(String appleId, String password){
    System.out.println("Apple ID: " + appleId);
    System.out.println("Password: " + password);
  }

  public static void login(long deviceId, int otp){
    System.out.println("Device ID: " + deviceId);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("apple@icloud.com","apple123");
    login(222333444L,4444);
  }
}