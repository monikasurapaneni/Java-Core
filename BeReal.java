class BeReal{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long userId, int otp){
    System.out.println("User ID: " + userId);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("berealUser","real123");
    login(444444L,1010);
  }
}