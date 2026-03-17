class MakeMyTrip{
  public static void login(String email, String password){
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
  }

  public static void login(long bookingId, int otp){
    System.out.println("Booking ID: " + bookingId);
    System.out.println("OTP: " + otp);
  }

  public static void main(String[] args){
    login("trip@gmail.com","trip123");
    login(123789456L,6666);
  }
}