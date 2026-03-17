class Hopper{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long bookingId, int otp){
    System.out.println("Booking ID: " + bookingId);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("hopper@gmail.com","hop123");
    login(987654321L,1212);
  }
}