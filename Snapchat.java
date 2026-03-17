class Snapchat{
  public static void login(String username, String snapId){
    System.out.println("Username: " + username);
    System.out.println("Snap ID: " + snapId);
  }

  public static void login(long phoneNumber, int otp){
    System.out.println("Phone: " + phoneNumber);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("snapUser","snap123");
    login(9876543210L,3333);
  }
}