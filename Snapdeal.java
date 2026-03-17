class Snapdeal{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long phoneNumber, int otp){
    System.out.println("Phone Number: " + phoneNumber);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("snapUser","snap123");
    login(9988776655L,3030);
  }
}