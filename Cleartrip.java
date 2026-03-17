class Cleartrip{
  public static void login(String username, String password){
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void login(long bookingId, long code){
    System.out.println("Booking ID: " + bookingId);
    System.out.println("Code: " + code);
  }

  public static void main(String[] args){
    login("clearUser","clear123");
    login(456789123L,4444L);
  }
}