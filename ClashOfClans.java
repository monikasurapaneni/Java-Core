class ClashOfClans{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long playerId, int otp){
    System.out.println("Player ID: " + playerId);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("clash@gmail.com","clash123");
    login(678901234L,6666);
  }
}