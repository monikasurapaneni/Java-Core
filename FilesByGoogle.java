class FilesByGoogle{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long accountId, int otp){
    System.out.println("Account ID: " + accountId);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("files@gmail.com","files123");
    login(567890123L,6666);
  }
}