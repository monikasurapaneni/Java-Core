class RedBus{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long ticketId, int otp){
    System.out.println("Ticket ID: " + ticketId);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("redbus@gmail.com","bus123");
    login(123456789L,6666);
  }
}